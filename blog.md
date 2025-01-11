---
title: blog
h1: marblog
permalink: /blog
layout: article
---

<div markdown="1">
see also:
[retrospect]({% link retrospect.md %})
</div>
{:.c}

<section markdown="1">
some of my encounters with various pieces of technology
</section>
{:.c}

<div markdown="1">
{%- for post in site.categories.blog -%}
- {{ post.date | date: "%Y-%m-%d" }} :: [{{ post.title }}]({{ post.url }})
{% endfor -%}
</div>
