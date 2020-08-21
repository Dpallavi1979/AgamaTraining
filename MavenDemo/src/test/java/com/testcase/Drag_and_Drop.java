package com.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_and_Drop {
	@Test
	public void actiobOn() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	//OPen Jquery.com and click droppable
	driver.get("https://jqueryui.com/droppable/");
	
	//Inspect the Frame
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	
	
	//Drag the Web Element
	WebElement drag= driver.findElement(By.xpath("//*[@id=\'draggable\']"));
	
	//Drop the Web Element
	WebElement droppable= driver.findElement(By.xpath("//*[@id=\'droppable\']"));
	
	//Perform action of Dragging and Dropping
	Actions action= new Actions(driver);
	action.dragAndDrop(drag, droppable).build().perform();

	}

}