package Homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testcase.WrapperMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipKart {
	
	WrapperMethod wm;
	@BeforeTest
	public void launchapp() {
		wm= new WrapperMethod();
		wm.insertapp("https://www.flipkart.com/");
	}
	
	@Test
	public void search() {
		wm.enterbyname("q", " apple mobile");
		wm.enterkeyusingxpath("//button[@class=\'vh79eN\']");
		//wm.clickbyxpath("//button[@class=\'vh79eN\']");
		//wm.enterbyxapth(val2, name2);
			
	}
	@Test(dependsOnMethods = "search")
	public void selectproduct() throws InterruptedException {
		
		wm.clickbyxpath("//*[@id=\'container\']/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div/a/div[1]/div[1]/div/div/img");
		wm.windowhandling();
		
	}
	@Test(dependsOnMethods = "selectproduct")
	public void addproduct() throws InterruptedException {
		wm.clickbyxpath("//button[@class =\"_2AkmmA _2Npkh4 _2MWPVK\"]");
		
	}
	
	
	

}
