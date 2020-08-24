package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TryOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		driver.findElement(By.xpath("//*[@id=\'nav-xshop\']/a[7]")).click();
		driver.findElement(By.xpath("//*[@id=\'contentGrid_702364\']/div/div/div[1]/div/div/a/img")).click();
		//Thread.sleep(2000);
		

		
	}

}
