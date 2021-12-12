Feature: CRM Login Feature

Scenario: Free CRM Login test SCenario with data tables with table header
Given User is already on login page
When User enters credentials
|username|password|
|agrawalanjali65@gmail.com|Anjali25|
Then User is on  Home Page
Then close the browser