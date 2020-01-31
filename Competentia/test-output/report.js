$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/SeleniumPrac/Competentia/src/test/java/Features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Check Competetia website login functionality for referre",
  "description": "",
  "id": "check-competetia-website-login-functionality-for-referre",
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
  "status": "skipped"
});
formatter.match({
  "location": "Login.user_Clicks_on_Login_CTA_from_homepage()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 10,
  "name": "Login Test for Referrer User",
  "description": "",
  "id": "check-competetia-website-login-functionality-for-referre;login-test-for-referrer-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "User enters Email id as \"deulkar.prasad87@gmail.com\" and password as \"Password!21\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User clicks on LoginCTA from pop-up",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User navigates on Welcome page with page title as \"Inner Circle : Dashboard\"",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Referre dashboard should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User close the browser",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "deulkar.prasad87@gmail.com",
      "offset": 25
    },
    {
      "val": "Password!21",
      "offset": 70
    }
  ],
  "location": "Login.user_enters_Email_id_as_and_password_as(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.user_clicks_on_LoginCTA_from_pop_up()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Inner Circle : Dashboard",
      "offset": 51
    }
  ],
  "location": "Login.user_navigates_on_Welcome_page_with_page_title_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.user_should_view_the_referre_s_dashboard()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.user_close_the_browser()"
});
formatter.result({
  "status": "skipped"
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
  "status": "skipped"
});
formatter.match({
  "location": "Login.user_Clicks_on_Login_CTA_from_homepage()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 18,
  "name": "Login Test for Normal User",
  "description": "",
  "id": "check-competetia-website-login-functionality-for-referre;login-test-for-normal-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "User enters Email id as \"test.jan@mailcatch.com\" and password as \"Password!21\"",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "User clicks on LoginCTA from pop-up",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "User navigates on Welcome page with page title as \"Inner Circle : Dashboard\"",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Normal dashboard should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "User close the browser",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "test.jan@mailcatch.com",
      "offset": 25
    },
    {
      "val": "Password!21",
      "offset": 66
    }
  ],
  "location": "Login.user_enters_Email_id_as_and_password_as(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.user_clicks_on_LoginCTA_from_pop_up()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Inner Circle : Dashboard",
      "offset": 51
    }
  ],
  "location": "Login.user_navigates_on_Welcome_page_with_page_title_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.normal_dashboard_should_be_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.user_close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});