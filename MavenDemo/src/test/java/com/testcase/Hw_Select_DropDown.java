package com.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hw_Select_DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//wait for 30 seconds.
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//input[@id = \'src\']")).sendKeys("che");
		driver.findElement(By.xpath("//input[@id = \'dest\']")).sendKeys("nag");
		driver.findElement(By.xpath("//*[@id='search']/div/div[3]/div/label"));
		
		driver.findElement(By.id("onward_cal")).click();
		//driver.findElement(By.xpath("//*[@id=\'rb-calendar_onward_cal\']/table/tbody/tr[6]/td[4]")).click();
		
		//Selecting Date
		driver.findElement(By.xpath("//*[@id=\'rb-calendar_onward_cal\']/table/tbody/tr[1]/td[3]/button")).click();
		driver.findElement(By.xpath("//*[@id=\'rb-calendar_onward_cal\']/table/tbody/tr[6]/td[4]")).click();
		
		
		//driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id='search']/div/div[1]/div/ul/li[4]")).click();
		driver.findElement(By.xpath("//*[@id=\'search\']/div/div[2]/div/ul/li")).click();
		
		

	}

}
