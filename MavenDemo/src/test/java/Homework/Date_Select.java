package Homework;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Date_Select {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.redbus.in");
		driver.findElement(By.xpath("//*[@id=\'src\']")).sendKeys("che");
		Thread.sleep(2000);
		
//Keydown Handling		
	    Actions action = new Actions(driver);{
	    
	          action.sendKeys(Keys.ARROW_DOWN).perform();
	          action.sendKeys(Keys.ARROW_DOWN).perform();
	          action.sendKeys(Keys.ARROW_DOWN).perform();
	          action.sendKeys(Keys.ENTER).perform();
	          Thread.sleep(2000);
	      }
	          
	          
//Selecting Calander    
	  		driver.findElement(By.xpath("//*[@id=\"onward_cal\"]")).click();
	  		driver.findElement(By.xpath("//*[@id=\'rb-calendar_onward_cal\']/table/tbody/tr[1]/td[3]/button")).click();
	  		driver.findElement(By.xpath("//*[@id=\'rb-calendar_onward_cal\']/table/tbody/tr[5]/td[1]")).click();
	  		
	  		
//Taking Screenshot	  		
	  		TakesScreenshot ts =(TakesScreenshot)driver;
		       File source = ts.getScreenshotAs(OutputType.FILE);
		       FileUtils.copyFile(source,new File(("src/test/resources/ScreenShot/dateSelect.png")));
	    
		//driver.quit();
		
		
		
	}

	}


