Feature: Check Competetia website login functionality for referre

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