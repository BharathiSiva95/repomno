package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Sample3 {
	@AfterSuite
	private void aftersuite() {
		System.out.println("updated by krish");
		System.out.println("After suite");
	}
	@Test(groups= {"Sanity"})
	private void tc03() {
		System.out.println("Test case 03");

	}

}
