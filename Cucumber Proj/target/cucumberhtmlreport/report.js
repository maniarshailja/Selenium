$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("background.feature");
formatter.feature({
  "line": 1,
  "name": "check title",
  "description": "",
  "id": "check-title",
  "keyword": "Feature"
});
formatter.background({
  "line": 2,
  "name": "driver installed",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "BackgroundDemo.i_am_on_homepage()"
});
formatter.result({
  "duration": 5193684600,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "verify title",
  "description": "",
  "id": "check-title;verify-title",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I should see that title contains \"Shop\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Shop",
      "offset": 34
    }
  ],
  "location": "BackgroundDemo.i_should_see_that_title_contains(String)"
});
formatter.result({
  "duration": 11694100,
  "status": "passed"
});
formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Verify Login",
  "description": "",
  "id": "verify-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Successful login with valid credentials",
  "description": "",
  "id": "verify-login;successful-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters valid data",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user should see logout link",
  "keyword": "Then "
});
formatter.match({
  "location": "Signin.user_is_on_login_page()"
});
formatter.result({
  "duration": 2905897900,
  "status": "passed"
});
formatter.match({
  "location": "Signin.user_enters_valid_data()"
});
formatter.result({
  "duration": 2377333500,
  "status": "passed"
});
formatter.match({
  "location": "Signin.user_should_see_logout_link()"
});
formatter.result({
  "duration": 844458600,
  "status": "passed"
});
});