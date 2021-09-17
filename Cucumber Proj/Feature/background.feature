Feature: check title
Background: driver installed
Given I am on homepage
@smoke
Scenario: verify title
Then I should see that title contains "Shop"
@regression
Scenario: check the source of the page
Then I should see that source contains "shop"
