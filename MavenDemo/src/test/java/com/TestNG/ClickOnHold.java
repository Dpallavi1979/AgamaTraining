package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickOnHold {
	@Test
	public void actiobOn() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	//OPen Jquery.com and click selectable
	driver.get("https://jqueryui.com/selectable/");
	//Inspect the Frame
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	
	//Drag the Web Element
		WebElement item1= driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]"));
		WebElement item2= driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[2]"));
		WebElement item3= driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[3]"));
		WebElement item4= driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[4]"));
		
		//Perform action of Selecting item1 and hold till item4 and release
		Actions action= new Actions(driver);
		action.clickAndHold(item1).clickAndHold(item4).release().build().perform();

	}
	
}
