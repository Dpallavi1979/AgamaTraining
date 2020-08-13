package com.testcase;

import java.io.IOException;

public class CallWrapper {
	
	public static void main(String[] args) throws IOException 
	{
		  WrapperMethod wm = new WrapperMethod();
		  wm.insertapp("https://opensource-demo.orangehrmlive.com/");
		  wm.enterbyid("email", "joshij@gmail.com");
		  wm.enterbyid("pass", "xxxxxx");
		  wm.clickbyxpath("//*[@id=\'btnLogin\']");
		  wm.takesnap("E:\\takescreen\\file1.png");
		  wm.closeapp();
			}

}
