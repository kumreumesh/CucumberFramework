Feature: Verify that login feature using map
Scenario: Verify that login scenario using maps

Given User currently on the home page 
When User need to enter the username and password
|username|password|
|umesh.kumre@ibrandtech.in|Kumreuk#09|

Then User need to click on login button
Then User finally close the browser