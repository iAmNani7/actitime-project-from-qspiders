package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.BaseClass;

public class EnterTimeTrack extends BaseClass
{
	@FindBy(xpath="//td//a[text()='Logout']")
	private WebElement lgobtn;
	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement taskbutton;
	
	public EnterTimeTrack(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void setLogout() 
	{
		lgobtn.click();
	}
	public void setTaskButton()
	{
		taskbutton.click();
	}
}
