---
title: MIDI Info Grabber
updated: 2025-01-10
highlight: true
---

<div markdown="1">
The MIDI Info Grabber tool was a spontaneous project
using a language and framework
which were completely new to me at the time
and which I haven't used since.
This was my first and last experience writing C# and using WPF,
just for curiosity's sake.

There isn't much to say about this one.
It performs a very simple task:
it allows the user to open a MIDI file from their computer
and view some properties retrieved from the MIDI file header
in a friendly format.
</div>

<section markdown="1">
## gallery
{:.c}

- ![The program window, with the title "MIDI Info Grabber" and a button labelled "Open File".
"File: C:\TilePuzzle.mid
MIDI Format: 0 (Single multi-channel track)
Tracks: 6
Division: 1 ticks per quarter-note"]({% link assets/midi-info-grabber/window.png %} "The program window after opening a MIDI file"){:.nopix}
{:.collection}
</section>

<div markdown="1">
{% include codedetails.md path="_projects/midi-info-grabber/MIDI Info Grabber.xaml" lang="xml" %}
{% include codedetails.md path="_projects/midi-info-grabber/MIDI Info Grabber.xaml.cs" lang="cs" %}
</div>
