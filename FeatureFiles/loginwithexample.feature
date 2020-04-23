Feature: verify that login functionality feature file
Scenario Outline: verify that login functionality scenario file

Given Open an application url
When Please enter "<username>" and "<password>"
Then Click login button
Then Close the browser

Examples:
|username|password|
|umesh.kumre@ibrandtech.in|Kumreuk#09|
|uk@yahoo.com|test123|


