package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Sample {
	//Testng
	@BeforeSuite
	private void beforeSuite() {
		System.out.println("Before suite");

	}
	@Test(groups= {"Sanity"})
	private void tc01() {
		System.out.println("Test case 01");

	}

}
/*
Grouping
--------
Combining More than one Test cases as a Group

*we can able to perform Group level Execution
*we can able to perform Group level Execution in suite level
*we can able to include or exclude the particular group


10 Groups
---------
we need to execute it groups among 10
-->Exclude<--

we need to execute 2 groups among 10
-->include<--

we are not supposed to use both in a same time

10 groups--> 2 Groups include-->3 Exclude-->2

In our testng.xml
-----------------

<test name="Test">
<groups>

<run>

    <include name="GroupName1"/>
    <include name="GroupName2"/>
    <exclude name="GroupName"/>
</run>    


*/