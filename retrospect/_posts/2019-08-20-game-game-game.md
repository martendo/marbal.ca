---
title: GAME GAME GAME
updated: 2025-01-07
highlight: true
---

<div markdown="1">
GAME GAME GAME is what I called my first Nintendo Game Boy assembly project.
The name comes from the childish assertion of its status as a game,
since the project barely resembles a game at all.

The source code is really silly.
I was following [an old and mildly infamous tutorial](https://gb-archive.github.io/salvage/tutorial_de_ensamblador/tutorial_de_ensamblador_la_decadence.html),
so I took a lot of liberties for my own amusement.
I had the amazing idea of giving every label the most bizarre names I could come up with,
leading to hits such as `potato_salad.walmart` and `strawberry_jam.let_set`.
I also decided to write comments for as much code as I could,
even when I had no idea what was being done.
This was actually a good idea in hindsight:
it made it explicit what I didn't understand
(so I could learn about it in the future --- not to be blindly accepted)
and it helped reinforce the knowledge that I did gain.
It's really funny how little I understood at this point, though.

I made another silly but good decision,
which was to iterate on this and incorporate some of my own twists
for a second version of GAME GAME GAME.
This is a really good idea.
I'd strongly encourage this when learning anything for the first time:
practice what you just learned, and then extend it. Add something new.
In this case, since the program involved moving a sprite around the screen,
I switched the sprite to an arrow and I added functionality
to make the arrow face the direction it moves
(roughly --- diagonal cases are not handled, with vertical movement given precedence).

The original version remained named "GAME GAME GAME v1",
with the added functionality found in a separate copy named "GAME GAME GAME v2".
(This might have been the first experience enticing me to start using version control,
which began a little later!)
</div>

<section markdown="1">
## gallery
{:.c}

- ![A screenshot of SameBoy emulating a Game Boy. A small smiley face sprite sits at the centre of a plain background]({% link assets/game-game-game/init.png %} "Playing GAME GAME GAME v1")
- ![A small neutral face sprite sits near the top left corner of a plain background]({% link assets/game-game-game/alt.png %} "Alternative sprite in GAME GAME GAME v1")
- ![A small right arrow sprite sits slightly right of the centre of a plain background]({% link assets/game-game-game/arrow.png %} "Moving to the right in GAME GAME GAME v2")
- ![A small square sprite sits near the bottom left corner of a plain background]({% link assets/game-game-game/alt2.png %} "Alternative sprite in GAME GAME GAME v2")
{:.collection}
</section>

<div markdown="1">
{% include codedetails.md path="_projects/game-game-game/GAME GAME GAME v1.asm" lang="nasm" %}
{% include codedetails.md path="_projects/game-game-game/GAME GAME GAME v2.asm" lang="nasm" %}
{% include codedetails.md path="_projects/game-game-game/gbhw.inc" lang="nasm" notes="
I did not write nor modify this file.
I include it here only for the sake of preservation;
it appears here as I had downloaded it from the aforementioned tutorial in 2019.
The improved modern descendant of this file
can be found on [GitHub at gbdev/hardware.inc](https://github.com/gbdev/hardware.inc).
" %}
</div>
