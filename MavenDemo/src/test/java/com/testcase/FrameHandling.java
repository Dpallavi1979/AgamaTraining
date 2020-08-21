package com.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//wait for 30 seconds.
		driver.get("https://jqueryui.com/draggable/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
         //driver.findElement(By.xpath("//*[@id='draggable']")).isDisplayed();
		System.out.println(driver.findElement(By.xpath("//*[@id='draggable']")).isDisplayed());
		driver.switchTo().defaultContent();
		
		//Click Droppable
		driver.findElement(By.linkText("Droppable")).click();
	
	}

}
