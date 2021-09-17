Feature: scenarionoutline demo

Scenario Outline: Successful login with multiple valid entries
Given User is present on demowebshop login page
When user enters <email> and <password> 
Then user should see the logout link
Examples:

|email              |password|
|rekhabr1@gmail.com |rekhab  |
|rekhabr3@gmail.com |rekhab  |
