package com.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://filebin.net/");	
		
		driver.findElement(By.id("fileField")).sendKeys("C:\\Users\\vdharmadhikari\\Documents\\Selenium\\Homework.txt");

		
	}

}
