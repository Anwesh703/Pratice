Feature: Portal login

#dataTable
@smokeTest @Dtest
Scenario: Home page default login page
Given user is on landing page
#When user enter the "anwesh" and "password" credentials*
When user signups with below details
|UserName|Password|Date   | Greetings |
| Anwesh |Reddy   | 11/21 | Thank you |
Then User lands on Home page is "True"



