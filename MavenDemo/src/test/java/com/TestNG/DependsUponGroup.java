//Code to include or exclude any Testing in the testing suite. For ex. if you want to run only regression 
//or sanity. You can include those you want to run and exclude remaning. Then run testng.xml as a suite.

package com.TestNG;

import org.testng.annotations.Test;

public class DependsUponGroup {
	@Test(groups={"SmokeTesting","Regression testing"})
	public void Testcase1() {
	System.out.println("Testcase1");
	}
	@Test(groups={"SmokeTesting","Sanity"})
	public void Testcase2() {
	System.out.println("Testcase2");
	}
	@Test(groups={"FunctionalTesting"," Retesting"})
	public void Testcase3() {
	System.out.println("Testcase3");
	}
}
