$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Test.feature");
formatter.feature({
  "name": "Test the Cogmento Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To check the login functionality of Cogmento",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Launch the browser and navigate to the URL",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepDefinition.LoginSteps_Deals.launch_the_browser_and_navigate_to_the_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Email and password",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepDefinition.LoginSteps_Deals.enter_Email_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinition.LoginSteps_Deals.click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Get the page title and screen shot",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinition.LoginSteps_Deals.get_the_page_title_and_screen_shot()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check Deals Page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "click on Deals section icon",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepDefinition.LoginSteps_Deals.click_on_Deals_section_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "should see Deals page contents",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinition.LoginSteps_Deals.should_see_Deals_page_contents()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Title",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepDefinition.LoginSteps_Deals.click_on_Title()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "should see Title and arrow button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinition.LoginSteps_Deals.should_see_Title_and_arrow_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on title Up/Down arrow",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Title list should change with up/down arrow",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});