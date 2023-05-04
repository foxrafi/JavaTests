# JavaTests
This is a space where I store my java code written to prepare to the Java certification.
Get-ChildItem -Path C:\ExampleDirectory -Directory | ForEach-Object { $_.FullName; Get-ChildItem $_.FullName -Recurse | Measure-Object -Property Length -Sum | Select-Object -ExpandProperty Sum } | Sort-Object -Property @{Expression={$_.Substring($_.LastIndexOf("\")+1)}}, @{Expression={$_};Descending=$true} | ForEach-Object { "{0:N2} MB`t{1}" -f ($_/1MB), $_.Substring($_.LastIndexOf("\")+1) }
