Feature: Verify Navistar Login Page

@TestCase1
Scenario: Validating Navistar login page with Valid crendantial 
Given User launching the browser and Enter the URL
And   User Enter the Valid UserName and Passowrd
Then  User Validating the Login 

@TestCase2 
Scenario: Validating Navistar login page with Invalid crendantial 
Given User launching the browser and Enter the URL
And   User Enter Invalid UserName and Passowrd
#Then  User Validating the Invalid Login 