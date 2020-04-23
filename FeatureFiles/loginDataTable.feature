Feature: Verify that login feature using data table
Scenario: Verify that login scenario using data table

Given User on the home page 
When User enter the username and password
|umesh.kumre@ibrandtech.in|Kumreuk#09|
Then User click on login button
Then User close the browser