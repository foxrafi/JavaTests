Get-ChildItem -Path .\ -Directory | ForEach-Object { $_.FullName; Get-ChildItem $_.FullName -Recurse | Measure-Object -Property Length -Sum | Select-Object -ExpandProperty Sum } | Sort-Object -Property @{Expression={$_.Substring($_.LastIndexOf("\")+1)}}, @{Expression={$_};Descending=$true} | ForEach-Object { "{0:N2} MB`t{1}" -f ($_/1MB), $_.Substring($_.LastIndexOf("\")+1) }

Mid-Year Performance Review – Software Test Automation Engineer

Dear [Engineer's Name],

I hope this review finds you well. As we reach the midpoint of the year, I wanted to take a moment to acknowledge your outstanding contributions and achievements as a Software Test Automation Engineer. Your dedication, expertise, and proactive approach have significantly contributed to the success of our team and projects. Below is a summary of your accomplishments in the first half of the year:

1. **Maintenance of Quality Management Applications**:
You have demonstrated exceptional skill in maintaining critical quality management applications such as "Insights" and "QMAD." Your attention to detail and thoroughness in ensuring these applications are in top-notch condition have been instrumental in enhancing our testing processes and overall quality assurance.

2. **Developer in QM Metric Tool Development**:
Your participation as a developer in the development of a new QM metric tool has been invaluable. Your technical acumen and collaboration with the development team have resulted in the creation of a robust and efficient tool that aids in measuring and improving our testing metrics.

3. **Update of Test Automation Framework Software**:
Your proactive efforts in updating the test automation framework software have significantly improved our automation capabilities. By keeping up with the latest updates and incorporating relevant improvements, you have ensured that our automation infrastructure remains up-to-date and reliable.

4. **Overcoming Roadblocks in Test Automation**:
Your problem-solving skills and resourcefulness in removing roadblocks related to external software downloads, particularly for the Playwright framework, have not gone unnoticed. Your ability to find solutions efficiently has saved valuable time and effort for the entire team.

5. **Active Participation in Initiatives**:
Your active involvement in initiatives like the "Global Test Automation Forum" and "QM Code Sharing" showcases your commitment to continuous improvement. Your contributions in updating the "bbb" library and implementing a new Selenium Java archetype in "QM Code Sharing" have been commendable. In the "Global Test Automation Forum," your leadership and insightful presentation on "bbb" have been well-received.

6. **Proactive Support in Mainframe Test Automation**:
Your proactive support in assisting a fellow tester with the proof-of-concept around mainframe test automation reflects your strong teamwork and willingness to help others succeed. Your collaborative spirit has fostered a positive and supportive work environment.

7. **Engagement in Women in Technology Community**:
Your active participation as a panelist in the "Women in Technology Community" demonstrates your commitment to diversity and inclusion. Your contribution to these initiatives promotes a sense of community and empowerment among team members.

Looking ahead, we encourage you to continue your excellent work and further develop your programming skills in Java and test automation frameworks such as Playwright, Selenium, Cypress, etc. Your continuous growth in technical expertise will not only benefit our team but also empower you to take on more challenging projects and responsibilities.

We appreciate your dedication to excellence and your positive influence on the team. As the year progresses, please know that your efforts are recognized and valued. We are excited to see you flourish and make even greater contributions to the success of our team and organization.

Keep up the fantastic work!

Best regards,
[Your Name]
[Your Title/Position]
