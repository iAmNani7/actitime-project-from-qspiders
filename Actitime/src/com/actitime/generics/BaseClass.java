package com.actitime.generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static WebDriver driver;
	@BeforeClass
	public void openBrowser()
	{
		driver=new ChromeDriver();
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
	@BeforeMethod
	public void login() 
	{
		
	}
	
}
