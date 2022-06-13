package com.sellabspractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WDProgram1

{
	WebDriver driver;
	By searchArea = By.id("srchword");
	
	public void WD1() 
	{
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "/chromedriver_win32/chromedriver.exe");
		
		driver= new ChromeDriver();
		driver.get("https://www.rediff.com/");
		WebElement srchfild = driver.findElement(searchArea);
		srchfild.clear();
		srchfild.sendKeys("cyclone");
		srchfild.submit();
		driver.quit();
		
		
		
		
		
	}
	
	public static void main(String[] args) 
	{
		WDProgram1 wdp1 = new WDProgram1();
		wdp1.WD1();
		
	}

}
