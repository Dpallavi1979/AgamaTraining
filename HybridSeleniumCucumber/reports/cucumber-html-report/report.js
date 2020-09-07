$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Testcase.feature");
formatter.feature({
  "name": "Test OrangeHRM Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To check the login functionality of OrangeHRM",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "To Launch the browser and navigate to the URL",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Enter user name and password",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepDefination.LoginSteps.enter_user_name_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click login button",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Get the page Title and screenshot",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenarioOutline({
  "name": "To check the login functionality of OrangeHRM with data Driven",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "launch the browser and navigate to the URL",
  "keyword": "Given "
});
formatter.step({
  "name": "Enter \"\u003cuname\u003e\" and \"\u003cpas\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "click submit button",
  "keyword": "Then "
});
formatter.step({
  "name": "Get the page title and get screen shot",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "uname",
        "pas"
      ]
    },
    {
      "cells": [
        "Admin",
        "admin123"
      ]
    },
    {
      "cells": [
        "Admin",
        "admin12345"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To check the login functionality of OrangeHRM with data Driven",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "launch the browser and navigate to the URL",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepDefination.LoginStepsWithDataDriven.launch_the_browser_and_navigate_to_the_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter \"Admin\" and \"admin123\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepDefination.LoginStepsWithDataDriven.enter_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefination.LoginStepsWithDataDriven.click_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Get the page title and get screen shot",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "To check the login functionality of OrangeHRM with data Driven",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "launch the browser and navigate to the URL",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepDefination.LoginStepsWithDataDriven.launch_the_browser_and_navigate_to_the_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter \"Admin\" and \"admin12345\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepDefination.LoginStepsWithDataDriven.enter_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefination.LoginStepsWithDataDriven.click_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Get the page title and get screen shot",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});