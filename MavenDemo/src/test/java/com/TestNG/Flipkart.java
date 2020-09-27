package com.TestNG;

	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import com.testcase.WrapperMethod;

	public class Flipkart {
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
			
			wm.clickbyxpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']");
			wm.windowhandling();
			
		}
		@Test(dependsOnMethods = "selectproduct")
		public void addproduct() throws InterruptedException {
			wm.clickbyxpath("//button[@class =\"_2AkmmA _2Npkh4 _2MWPVK\"]");
			
		}
		
		

	}



