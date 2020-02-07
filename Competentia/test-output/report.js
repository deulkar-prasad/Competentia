$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Check Competetia website login and forgot password functionality",
  "description": "",
  "id": "check-competetia-website-login-and-forgot-password-functionality",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "Below are the common steps for each scenario",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User launch Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Clicks on Login CTA from homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.user_launch_Chrome_browser()"
});
formatter.result({
  "duration": 9962042601,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_Clicks_on_Login_CTA_from_homepage()"
});
formatter.result({
  "duration": 4148575555,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "Validating Forgot password functionality for valid Email id",
  "description": "",
  "id": "check-competetia-website-login-and-forgot-password-functionality;validating-forgot-password-functionality-for-valid-email-id",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 35,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 37,
  "name": "User clicks on forgot password link",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "Pop-up heading should displayed as \"Reset password\"",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "User enters invalid email-id as \"test\"",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "User clicks on reset password CTA",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "User prompt with Error message as \"This User was not found or invalid\"",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "User clicks on Cancel CTA",
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "User navigate back to homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "User close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.user_clicks_on_forgot_password_link()"
});
formatter.result({
  "duration": 12788540533,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Reset password",
      "offset": 36
    }
  ],
  "location": "Login.pop_up_heading_should_displayed_as(String)"
});
formatter.result({
  "duration": 145428614,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test",
      "offset": 33
    }
  ],
  "location": "Login.user_enters_invalid_email_id_as(String)"
});
formatter.result({
  "duration": 152174990,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_clicks_on_reset_password_CTA()"
});
formatter.result({
  "duration": 84844218,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "This User was not found or invalid",
      "offset": 35
    }
  ],
  "location": "Login.user_prompt_with_Error_message_as(String)"
});
formatter.result({
  "duration": 45681949,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_clicks_on_Cancel_CTA()"
});
formatter.result({
  "duration": 158396132,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_navigate_back_to_homepage()"
});
formatter.result({
  "duration": 17512552,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_close_the_browser()"
});
formatter.result({
  "duration": 835218954,
  "status": "passed"
});
});