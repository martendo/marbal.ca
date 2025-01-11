---
---
"use strict";

const Discord = require("discord.js");
const config  = require("./config.json");
const synth   = require("synth-js");
const https   = require("https");
const fs      = require("fs");
const Lame    = require("node-lame").Lame;

const waveforms = ["sine", "pulse", "tri", "saw"];

function download(url, filename) {
  return new Promise((resolve, reject) => {
    const file = fs.createWriteStream(filename);
    const request = https.get(url, (response) => {
      response.pipe(file);
      file.on("finish", () => {
        file.close();
        resolve();
      });
    }).on("error", (error) => {
      reject(error);
    });
  });
}

async function makeWav(message, convert = false) {
  const split = message.content.trim().split(" ");
  var filename = "test.mid";
  if (message.attachments.size > 0) {
    const attachment = message.attachments.first();
    filename = "user";
    await download(attachment.url, filename);
  }
  try {
    var type, duty;
    if (split.length > 1) {
      if (waveforms.includes(split[1])) {
        type = split[1];
        if (type === "pulse" && split.length > 2 && parseFloat(split[2])) {
          duty = parseFloat(split[2]);
        }
      } else {
        message.channel.send(`The waveform type of \`${split[1]}\` is not supported. Continuing with \`tri\`...`);
      }
    }
    var outname = convert ? "converted.wav" : "output.wav";
    fs.writeFileSync(outname, synth.midiToWav(fs.readFileSync(filename), {type, duty}).toBuffer(), {
      encoding: "binary"
    });
    if (convert) {
      filename = outname;
      outname = "converted.mp3";
      const encoder = new Lame({
        output: outname
      }).setFile(filename);
      await encoder.encode();
    }
    filename = outname;
  } catch(error) {
    console.error(error);
    filename = "user";
  }
  return filename;
}

const client = new Discord.Client();

const states = new Map;
const dispatchers = new Map;
const connections = new Map;

client.on("message", async (message) => {
  const content = message.content.trim();
  if (content.slice(0, 1) !== "*") {
    return;
  }
  let vc = null;
  if (message.member && message.member.voice.channel) {
    vc = message.member.voice.channel;
  }
  if (vc) {
    var state = states.get(vc.id);
    var dispatcher = dispatchers.get(vc.id);
    var connection = connections.get(vc.id);
    if (!states.has(vc.id)) {
      states.set(vc.id, "stopped");
    }
  }
  const split = content.split(" ");
  switch (split[0]) {
    case "*play":
      if (state === "playing") {
        dispatcher.destroy();
      }
      if (vc) {
        const filename = await makeWav(message);
        
        connection = await vc.join();
        dispatcher = connection.play(filename);
        dispatcher.on("error", console.error);
        state = "playing";
      } else {
        message.channel.send("Join a voice channel first, then type `*play` again.");
      }
      break;
    case "*convert":
      const filename = await makeWav(message, true);
      if (filename == "user") {
        message.channel.send("I convert MIDI files.");
        break;
      }
      if (fs.statSync(filename).size > 18*1024*1024) {
        message.channel.send("Converted file is too large for Discord.");
      } else {
        message.channel.send(`Here you go, ${message.author}!`, {
          files: [filename]
        });
      }
      break;
    case "*stop":
      if (state === "playing") {
        dispatcher.destroy();
        state = "stopped";
      }
      break;
    case "*pause":
      if (state === "playing") {
        dispatcher.pause();
        state = "paused";
      }
      break;
    case "*resume":
      if (state === "paused") {
        dispatcher.resume();
        state = "playing";
      }
      break;
    case "*leave":
      connection.disconnect();
      dispatcher.destroy();
      state = "stopped";
      break;
    case "*help":
      message.channel.send("**Commands:**\n`*play [waveform type [duty cycle]]` - Play the attached file.\n`*convert [waveform type [duty cycle]]` - Convert the attached MIDI file to MP3.\n`*volume [value]` - Set the volume. The value should be in decimal (1 = 100%). Default 1.\n`*stop`\n`*pause`\n`*resume`\n`*leave` - Leave the voice channel.\n`*help`\n\n**MIDI**\nAvailable waveforms: `sine`, `pulse`, `tri` (default), `saw`.\n`pulse` can have a duty cycle specified in decimal (1 = 100%). Default 0.5.");
      break;
    case "*volume":
      dispatcher.setVolume(parseFloat(split[1]) || 1);
      break;
  }
  if (vc) {
    states.set(vc.id, state);
    dispatchers.set(vc.id, dispatcher);
    connections.set(vc.id, connection);
  }
});

client.login(config.BOT_TOKEN);
