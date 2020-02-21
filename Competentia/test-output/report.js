$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Homepage.feature");
formatter.feature({
  "line": 1,
  "name": "Check Competetia website HOMEPAGE",
  "description": "",
  "id": "check-competetia-website-homepage",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#With Example keyword"
    }
  ],
  "line": 5,
  "name": "Validate the Homepage Global Hearder Component of Inner-Circle site",
  "description": "",
  "id": "check-competetia-website-homepage;validate-the-homepage-global-hearder-component-of-inner-circle-site",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User navigate on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Verifies the Global Header section on Homepage",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User closed the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Homepage.user_is_on_homepage()"
});
formatter.result({
  "duration": 10459219692,
  "status": "passed"
});
formatter.match({
  "location": "Homepage.verifies_the_Global_Header_section_on_Homepage()"
});
formatter.result({
  "duration": 10089081667,
  "status": "passed"
});
formatter.match({
  "location": "Homepage.user_closed_the_browser()"
});
formatter.result({
  "duration": 1121389525,
  "status": "passed"
});
formatter.uri("Login.feature");
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
  "duration": 9492477163,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_Clicks_on_Login_CTA_from_homepage()"
});
formatter.result({
  "duration": 3087495705,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Login Test for Referrer User",
  "description": "",
  "id": "check-competetia-website-login-and-forgot-password-functionality;login-test-for-referrer-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User enters Email id as \"deulkar.prasad87@gmail.com\" and password as \"Password!21\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User clicks on LoginCTA from pop-up",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User navigates on Welcome page with page title as \"Inner Circle : Dashboard\"",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Referre dashboard should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
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
  "duration": 2554793811,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_clicks_on_LoginCTA_from_pop_up()"
});
formatter.result({
  "duration": 10212257520,
  "status": "passed"
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
  "duration": 10439509,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_should_view_the_referre_s_dashboard()"
});
formatter.result({
  "duration": 204600809,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_close_the_browser()"
});
formatter.result({
  "duration": 1446913084,
  "status": "passed"
});
});