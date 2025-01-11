{% assign doc = site.projects | where: "path", include.path | first %}
## [{{ include.path | split: "/" | last }}]({{ doc.url }})
{{ include.notes }}
<details markdown="1">
<summary>file contents</summary>
```{{ include.lang }}
{{ doc.content -}}
```
</details>
