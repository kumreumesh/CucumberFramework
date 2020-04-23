Feature: Loginpage functionality feature 
Scenario: Loginpage functionality scenario

Given Launch browser then open application URL
When  Click over my acccount link
Then  Enter "umesh.kumre@ibrandtech.in" and "Kumreuk#09"
Then  Select remember me checkbox
Then  Click over login button  
Then  Click over logout button