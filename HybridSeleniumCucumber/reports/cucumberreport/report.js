$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/TestCase.feature");
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
  "name": "To launch the browser and navigate to the URL",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepDefination.LoginSteps.to_launch_the_browser_and_navigate_to_the_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Username and Password",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepDefination.LoginSteps.enter_Username_and_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click login button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefination.LoginSteps.click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Get the page title and screenshot",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefination.LoginSteps.get_the_page_title_and_screenshot()"
});
formatter.result({
  "status": "passed"
});
});