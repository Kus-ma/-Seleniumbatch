package com.sellabspractice;

import org.testng.annotations.Test;

public class TestNgProgram 
{

	@Test(priority = 2)
	public void B() {
		System.out.println(10/0);
	}
	@Test (priority = 3, enabled = false)
	public void A() {
		System.out.println("A");
	}
	@Test (priority = 4, dependsOnMethods = {"B"}, alwaysRun = true)
	public void D() {
		System.out.println("D");
	}
	@Test (priority = 1)
	public void C() {
		System.out.println("C");
	}
	@Test (priority = 5)
	public void E() {
		System.out.println("E");
	}
}
 