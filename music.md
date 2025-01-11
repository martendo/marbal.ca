---
title: music
h1: martinmusic
permalink: /music
layout: article
---

<section markdown="1">
personal archive of the tunes I make,
including short sketches
</section>
{:.c}

<ul class="collection wide">
{% assign tracks = site.data.music | sort: "date" | reverse %}
{% for track in tracks %}
{% assign name = track.shortname | default: track.title | slugify %}
<li class="card">
<a href="{% link music/{{ name }}.mp4 %}">
<section class="c" markdown="1">
![]({% link assets/music/{{ name }}.png %})

{{ track.date | date: "%Y-%m-%d" -}}
<span class="undecoa">&nbsp;::&nbsp;</span>
{{- track.title }}
{:role="text"}

{% for tag in track.tags -%}
<span class="chip" role="note">{{ tag }}</span>
{%- endfor %}
</section>
</a>
{% if track.youtube -%}
<a href="{{ track.youtube }}">
<section class="c button" markdown="1">
youtube
</section>
</a>
{%- endif %}
</li>
{% endfor %}
</ul>

<section markdown="1">
2025-01-11: additional older tunes to be processed and added soon

calm,
cave,
feb-20,
fmokey,
fun,
impassion,
impatience,
impossible,
machine2,
new,
perc
</section>
{:.c}
