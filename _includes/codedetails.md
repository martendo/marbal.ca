{% assign doc = site.projects | where: "path", include.path | first %}
## [{{ include.path | split: "/" | last }}]({{ doc.url }})
{{ include.notes }}
<details markdown="1" {% if include.open -%} open {%- endif %}>
<summary>file contents</summary>
```{{ include.lang }}
{{ doc.content -}}
```
</details>
