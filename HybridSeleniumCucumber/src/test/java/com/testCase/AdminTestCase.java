package com.testCase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baseClass.Library;
import com.pages.AdminPage;
import com.pages.LoginPage;

public class AdminTestCase extends Library{
	AdminPage adminpage;
	@BeforeTest
	public void startup() {
		browserSetUp();
		logger.info("Browser Launched and navigate to URL");
	
	}
	@Test(priority =1)
	public void login() {
		LoginPage lpage=new LoginPage(driver);
		String usname = properties.getProperty("username");//taking values from config property
		String pwd = properties.getProperty("pass");//taking values from config property
		lpage.login(usname, pwd);
		//lpage.login("Admin", "admin123");
		logger.info("Login successful");
	}
	@Test(priority =2)
	public void adminClick() {
		adminpage = new AdminPage(driver);
		adminpage.adminClick();
		String searchusername =properties.getProperty("searchUsername");
		String searchrole = properties.getProperty("searchRole");
		//adminpage.searchuser("kevin","All","Kevin Mathews","Enabled");
		
	
	}

}