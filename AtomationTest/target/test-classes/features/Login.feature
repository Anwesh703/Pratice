Feature: Application login

  Background: 
    Given validate the browser
    When browser is triggered
    Then check if browser is started

  @regressionTest @smokeTest
  Scenario: Home page default login page regression
    Given user is on landing page
    When user enter the "anwesh" and "password" credentials
    And clicks on login button
    Then User lands on Home page is "False"

  #dataTable
  @smokeTest
  Scenario: Home page default login page
    Given user is on landing page
    #When user enter the "anwesh" and "password" credentials*
    When user signups with below details
      | Anwesh | Reddy | 11/21 | Thank you |
    Then User lands on Home page is "True"

  #parameterization using Outline and Examples
  @smokeTest
  Scenario Outline: Home page default login page
    Given user is on landing page
    When user enters the <UserName> and <Password> credentials
    And clicks on login button
    Then User lands on Home page is "False"

    Examples: 
      | UserName | Password |
      | Anwesh   | Reddy    |
      | Dileep   | gangula  |
      | raj      | kumar    |
