Feature: DTE Time charge

@DTETest
 Scenario Outline: DTE Time charging
Given user is on <URL> DTE home page
When user clicks on hyperlink of current week
Then User lands on DTE page and clicks on expand button
And user enters <hours> hours on <day> for charge code
And Clicks on save button


Examples: 
      | URL             |                       hours|       day|
|https://dte.deloitte.com/te/ExpenseSummary.aspx |9   |      Tuesday|

      
      
      