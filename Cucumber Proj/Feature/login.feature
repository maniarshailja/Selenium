Feature: Verify Login
@smoke
Scenario: Successful login with valid credentials
Given User is on login page
When user enters valid data
Then user should see logout link
@regression
Scenario: Successful login with invalid credentials
Given User is present
When user enters invalid entries
Then user should see the error "Invalid Credentials"