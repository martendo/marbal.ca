---
title: retrospect
h1: retrospect
permalink: /retrospect
layout: article
---

<section markdown="1">
some of my old stuff that is cool + some thoughts
</section>
{:.c}

<div markdown="1">
{%- for post in site.categories.retrospect -%}
- {{ post.date | date: "%Y-%m-%d" }} :: [{{ post.title }}]({{ post.url }})
{% endfor -%}
</div>
