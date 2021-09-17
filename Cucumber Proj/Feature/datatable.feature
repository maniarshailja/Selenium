Feature: datatable demo

Scenario: Successful login with valid entries
Given User is on demowebshop login page
When user signs in with login button
|rekhabr1@gmail.com |rekhab|
Then user should view logout