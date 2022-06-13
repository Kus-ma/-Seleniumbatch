package com.sellabspractice;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupTest 
{
	@BeforeGroups (groups = {"sanity"})
	public void logIn () {
		System.out.println("LogIn successful..");
		}
	
	@Test (groups = {"sanity"})
	public void search () {
		System.out.println("Search succesful........");
		}
	
	@Test (groups = {"sanity", "regression"})
	public void advancedSearch () {
		System.out.println("Advanced Search successful...");
		}
	
	@Test ( groups = {"regression"})
	public void buyProducts () {
		System.out.println("Buy Products successful...");
		}
	
	@AfterGroups (groups = {"sanity"})
	public void logOut () {
		System.out.println("LogOut successful...");
		}

}



