package com.TestNG;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testcase.WrapperMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CallWrapperTestNG {
	
	WebDriver driver;
	WrapperMethod wm = new WrapperMethod();
	
	//Use BeforeTest instead of BeforeMethod to run only once
	@BeforeTest
	public void launchapp() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  wm.insertapp("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test
	public void login() throws IOException {
		  wm.enterbyid("txtUsername", "Admin");
		  wm.enterbyid("txtPassword", "admin123");
		  wm.clickbyxpath("//*[@id=\'btnLogin\']");
		  wm.takesnap("src/test/resources/ScreenShot/demo.png");
	}
		  
	
	@AfterTest
	public void closeout() {
		  wm.closeapp();
			}
	

}