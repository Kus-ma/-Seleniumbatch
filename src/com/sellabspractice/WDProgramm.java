package com.sellabspractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WDProgramm 
{
	
	
	WebDriver driver; // Reference of web driver
	
	By downloadlink =  By.linkText("Downloads");
	
	public void wd() 
	{
	String projectpath	= System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", projectpath +"/chromedriver_win32/chromedriver.exe"); // Environment setup using program)
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.selenium.dev/");
	driver.findElement(downloadlink).click();
	driver.navigate().back();
	String title = driver.getTitle();
	
	System.out.println(title);
	
	}
	
	public static void main(String[] args) 
	{
		WDProgramm wdp = new WDProgramm();
		wdp.wd();
	}

}
