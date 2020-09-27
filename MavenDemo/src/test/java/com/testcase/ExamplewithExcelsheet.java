package com.testcase;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExamplewithExcelsheet {

	public static void main(String[] args) throws IOException {
		FileInputStream fil = new FileInputStream(new File("C:\\Users\\vdharmadhikari\\Documents\\Agama Solutions\\Automation Testing\\Testdata.xlsx"));
		
		XSSFWorkbook workbook = new XSSFWorkbook(fil);
		XSSFSheet sheet =workbook.getSheet("Sheet1"); 
		int count =sheet.getLastRowNum();
		
		System.out.println(count);
		
		for(int i=1; i<=count;i++) {
		XSSFRow row= sheet.getRow(i);
		XSSFCell cell=row.getCell(0);
		String un=cell.getStringCellValue();
		XSSFCell cell1=row.getCell(1);
		String pwd= cell1.getStringCellValue();
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();
		//driver.findElement(By.xpath("//input[@value='Log In']")).click();
		driver.close();
		
				}
		
	}}	
	