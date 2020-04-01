Feature: demo web shop login feature 
Scenario: valid login user
Given the url of the login for demo web shop "http://demowebshop.tricentis.com/login"
When user enters "askmail@email.com" as email
And user enters "abc123" as password
And user clicks on login button
Then user is in shopping page 