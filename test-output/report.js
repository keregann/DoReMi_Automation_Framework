$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SignIn.feature");
formatter.feature({
  "line": 2,
  "name": "Login functionality",
  "description": "",
  "id": "login-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Margarita"
    }
  ]
});
formatter.before({
  "duration": 14697372400,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Login with valid credentials",
  "description": "",
  "id": "login-functionality;login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "\u0027Home\u0027 page is displayed",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user clicks \u0027My Account\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user clicks \u0027Login Button\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "\u0027Login\u0027 page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user enters the following values:",
  "rows": [
    {
      "cells": [
        "email",
        "user@phptravels.com"
      ],
      "line": 11
    },
    {
      "cells": [
        "password",
        "demouser"
      ],
      "line": 12
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user clicks \u0027Login Button\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "\u0027User Account\u0027 page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user clicks \u0027My Account\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user clicks \u0027Logout\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "\u0027Login\u0027 page is displayed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Home",
      "offset": 1
    }
  ],
  "location": "Steps.pageIsDisplayed(String)"
});
formatter.result({
  "duration": 306797100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My Account",
      "offset": 13
    }
  ],
  "location": "Steps.click(String)"
});
formatter.result({
  "duration": 627652000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login Button",
      "offset": 13
    }
  ],
  "location": "Steps.click(String)"
});
formatter.result({
  "duration": 2593064700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 1
    }
  ],
  "location": "Steps.pageIsDisplayed(String)"
});
formatter.result({
  "duration": 15911300,
  "status": "passed"
});
formatter.match({
  "location": "Steps.userEntersTheFollowingValues(DataTable)"
});
formatter.result({
  "duration": 767503300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login Button",
      "offset": 13
    }
  ],
  "location": "Steps.click(String)"
});
formatter.result({
  "duration": 469248700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "User Account",
      "offset": 1
    }
  ],
  "location": "Steps.pageIsDisplayed(String)"
});
formatter.result({
  "duration": 3742831500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My Account",
      "offset": 13
    }
  ],
  "location": "Steps.click(String)"
});
formatter.result({
  "duration": 667116900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Logout",
      "offset": 13
    }
  ],
  "location": "Steps.click(String)"
});
formatter.result({
  "duration": 2455587600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 1
    }
  ],
  "location": "Steps.pageIsDisplayed(String)"
});
formatter.result({
  "duration": 11085200,
  "status": "passed"
});
formatter.after({
  "duration": 904146100,
  "status": "passed"
});
});