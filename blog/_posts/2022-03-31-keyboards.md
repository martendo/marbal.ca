---
title: Keyboards
highlight: true
---

<div markdown="1">
I've recently changed some keyboard-related things.

<figure markdown="1">
```bash
$ setxkbmap -layout us,ca -variant altgr-intl,multix -option grp:shifts_toggle -option compose:sclk
```
<figcaption markdown="1">
The command I use in my `~/.xinitrc` file to configure my keyboard.
</figcaption>
</figure>
</div>

<section markdown="1">
## Contents
{:.no_toc}

- contents
{:toc}
</section>

<div markdown="1">
## Canadian French

There are some small things that I dislike about `ca(fr)`,
the layout for Canadian French.
The main issue I have with it is simply with the characters it has available:
most notably, it has a cedilla
&#x27E8;&cedil;&#x27E9;
dead key, even though it would only be used with the letter
&#x27E8;c&#x27E9;
(that is, &#x27E8;&ccedil;&#x27E9;, as in *fran&ccedil;ais*{:lang="fr-CA"}).
There also aren't dedicated keys for
&#x27E8;&egrave;&#x27E9;
or
&#x27E8;&agrave;&#x27E9;,
which aren't uncommon characters;
I have to type
<kbd>&grave;</kbd><kbd>e</kbd>
or
<kbd>&grave;</kbd><kbd>a</kbd>
for those, respectively. (There *is* a dedicated key for the common
&#x27E8;&eacute;&#x27E9;,
so I'll give them that.)

After a bit of investigating, I found out about `ca(multix)`.

It's named "Canadian (intl.)" --- seemingly not targeted towards French,
but it does have the dedicated keys I was looking for!
It also has some characters moved to places that I'm more familiar with,
due to my experience with using the `us(basic)` layout.
For example, the at sign
&#x27E8;@&#x27E9;
is entered with
<kbd>Shift</kbd><kbd>2</kbd>
using `ca(multix)`, as it is with `us(basic)`.
With `ca(fr)`, it's
<kbd>AltGr</kbd><kbd>2</kbd>
instead, where
<kbd>Shift</kbd><kbd>2</kbd>
is a double quote &#x27E8;\"&#x27E9;.

## Fancy Characters

Sometimes --- not often, I'll admit, but sometimes ---
I want to type some more exotic characters.
These might be the em dash &#x27E8;---&#x27E9;,
degree symbol &#x27E8;&deg;&#x27E9;,
multiplication sign &#x27E8;&times;&#x27E9;,
division sign &#x27E8;&divide;&#x27E9;,
minus sign &#x27E8;&minus;&#x27E9;
(different from the "hyphen-minus" &#x27E8;-&#x27E9; found in ASCII),
and perhaps a superscript two
&#x27E8;&sup2;&#x27E9;,
to name... nearly all of them.

Most of those characters are normally typed with <kbd>AltGr</kbd>,
the "Level 3" modifier key, which is missing from the `us(basic)` layout.
Instead, I get two <kbd>Alt</kbd>s!

I found a layout variant called `us(altgr-intl)`.

I get to use my keyboard's right <kbd>Alt</kbd> as <kbd>AltGr</kbd>,
giving me access to a bunch of fancy characters.
For example, I can type the degree symbol using
<kbd>Shift</kbd><kbd>AltGr</kbd><kbd>;</kbd>,
or the multiplication sign using
<kbd>AltGr</kbd><kbd>=</kbd>.

Great for discussing the temperature and math, I guess.

<figure markdown="1">
> ah yes, lovely weather today, a nice warm
4&sup2;&nbsp;&divide;&nbsp;2&nbsp;&times;&nbsp;3&nbsp;&deg;C!
<figcaption markdown="1">
Finally, I can write this with ease! I've always wanted this!
</figcaption>
</figure>

I still use HTML entities
(e.g., `&plusmn;` for &#x27E8;&plusmn;&#x27E9;)
whenever I can, but it's nice to know I would be able to type out
some of these characters when not writing markup.

### The Compose Key

What about my em dash? It still isn't in the `us(altgr-intl)` layout.

<kbd>Compose</kbd> to the rescue!

The [Compose key] is a special key on some keyboards that allows entering
a sequence of characters in order to form a single character,
useful when that single character isn't found on your keyboard.
For example,
<kbd>Compose</kbd><kbd>t</kbd><kbd>m</kbd>
results in
&#x27E8;&trade;&#x27E9;.

One of those special characters is the em dash, entered with
<kbd>Compose</kbd><kbd>-</kbd><kbd>-</kbd><kbd>-</kbd>!
However, the keyboard I use, being a pretty typical US keyboard,
doesn't have a Compose key.
Luckily, as this situation isn't all that uncommon
(I said my keyboard was typical!),
XKB provides the option to use existing keys as substitutes.

I chose the `compose:sclk` option.

That means that when I press <kbd>Scroll Lock</kbd>,
it's interpreted as <kbd>Compose</kbd>!
There are quite a few options for <kbd>Compose</kbd> substitutes,
but I chose `compose:sclk` specifically because
(1) my keyboard has it,
(2) it's a single keystroke, and
(3) I wouldn't normally use it for anything.

<figure markdown="1">
<figcaption markdown="1">
There are quite a few options for <kbd>Compose</kbd> substitutes:
</figcaption>
```bash
$ grep "compose:" /usr/share/X11/xkb/rules/base.lst
```
</figure>

The Compose key covers a lot of characters.
I actually no longer need to use `us(altgr-intl)`,
since all of the characters I wanted from it are available with
<kbd>Compose</kbd>.
For example, I can type the multiplication sign
&#x27E8;&times;&#x27E9;
with
<kbd>Compose</kbd><kbd>x</kbd><kbd>x</kbd>,
so I don't need to be able to use
<kbd>AltGr</kbd><kbd>=</kbd>.
However, I find that using <kbd>Compose</kbd> is often just
a tad more cumbersome
--- three keystrokes instead of two in the prior example.

[Compose key]: https://en.wikipedia.org/wiki/Compose_key

### The Minus Sign

Even with the Compose key,
I'm still lacking the ability to type the minus sign!

Fortunately, I can define my own Compose sequences.
I can create a file named `.XCompose` in my home directory
to add my own Compose sequence for the minus sign:

<figure markdown="1">
```bash
include "%L"

<Multi_key> <minus> <minus> <equal> : "−" U2212 # MINUS SIGN
```
<figcaption markdown="1">
The contents of my `~/.XCompose` file.
</figcaption>
</figure>

First, I `include` the default Compose sequences:
`%L` expands to the name of the locale-specific Compose file
--- in the case of my locale, `en_CA.UTF-8`,
that's `/usr/share/X11/locale/en_US.UTF-8/Compose`.
Then I define one more sequence for the minus sign,
<kbd>Compose</kbd><kbd>-</kbd><kbd>-</kbd><kbd>=</kbd>.

(For more details on Compose files, see [Compose(5)]!)

<figure markdown="1">
> - March 29--31
> - It's nice --- really!
> - 3&nbsp;&minus;&nbsp;5&nbsp;=&nbsp;&minus;2
<figcaption markdown="1">
At last, the en dash, em dash, and minus sign!
</figcaption>
</figure>
</div>

[Compose(5)]: https://man.archlinux.org/man/Compose.5
