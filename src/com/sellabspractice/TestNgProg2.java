package com.sellabspractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgProg2 
{
	
	@Test 
	public void F() {
	
	
		System.out.println("A");
	}
	
	@Test 
	public void G() {
		System.out.println("G");
}
	@BeforeMethod
	public void precond() 
	{
		System.out.println("Before Method");
	}
	@AfterMethod
	public void postcond() 
	{
		System.out.println("After Method");
	}
}

