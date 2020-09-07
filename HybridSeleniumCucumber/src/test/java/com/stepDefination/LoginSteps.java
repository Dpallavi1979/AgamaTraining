package com.stepDefination;

import com.baseClass.Library;
import com.pages.LoginPage;
import com.seleniumReusableFunctions.SeleniumUtilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends Library{
	
	 LoginPage lpage;
	 SeleniumUtilities sUti;
	
	@Given("To launch the browser and navigate to the URL")
	public void to_launch_the_browser_and_navigate_to_the_URL() {
		browserSetUp();
		logger.info("Browser Launched and navigate to URL");
	    
	}

	@When("Enter user name and password")
	public void enter_user_name_and_password() {
        lpage=new LoginPage(driver);
		
		lpage.login(properties.getProperty("username"), properties.getProperty("pass"));
		//lpage.login("Admin", "admin123");
		logger.info("Login successful"); 
	    
	}

	@Then("click login button")
	public void click_login_button() {
		lpage.submit();
	    
	}

	@Then("Get the page title and screen shot")
	public void get_the_page_title_and_screen_shot() {
		sUti = new SeleniumUtilities(driver);
		sUti.to_take_screenshot("src/test/resources/ScreenShots/orangeHRMLogin1.png");
		logger.info("Take Screen Shot");
		sUti.getTitle();
		tearDown();
	   
	}




}
