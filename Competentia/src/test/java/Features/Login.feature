Feature: Check Competetia website login and forgot password functionality

Background: Below are the common steps for each scenario 

Given User launch Chrome browser  
Then User Clicks on Login CTA from homepage

@Sanity
Scenario: Login Test for Referrer User
Then User enters Email id as "deulkar.prasad87@gmail.com" and password as "Password!21"
Then User clicks on LoginCTA from pop-up
Then User navigates on Welcome page with page title as "Inner Circle : Dashboard" 
Then Referre dashboard should be displayed
Then User close the browser

@Regression
Scenario: Login Test for Normal User
Then User enters Email id as "test.jan@mailcatch.com" and password as "Password!21"
Then User clicks on LoginCTA from pop-up
Then User navigates on Welcome page with page title as "Inner Circle : Dashboard" 
Then Normal dashboard should be displayed
Then User close the browser

@Regression
Scenario: Validating Forgot password functionality for valid Email id
Then User clicks on forgot password link
Then Pop-up heading should displayed as "Reset password"
Then User enters registered emailid as "test.jan@mailcatch.com"
When User clicks on reset password CTA
Then User prompt with confirmation message
When User clicks on Got it CTA
Then User navigate back to homepage
Then User close the browser

@smoke
Scenario: Validating Forgot password functionality for valid Email id
Then User clicks on forgot password link
Then Pop-up heading should displayed as "Reset password"
Then User enters invalid email-id as "test"
When User clicks on reset password CTA
Then User prompt with Error message as "This User was not found or invalid"
When User clicks on Cancel CTA
Then User navigate back to homepage
Then User close the browser