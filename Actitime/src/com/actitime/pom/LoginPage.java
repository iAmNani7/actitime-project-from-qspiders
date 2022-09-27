package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.BaseClass;

public class LoginPage extends BaseClass{
	@FindBy(id="username")
	private WebElement lgbox;
	@FindBy(name="pwd")
	private WebElement pwbox;
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement lgbtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setLogin(String un,String pw)
	{
		lgbox.sendKeys(un);
		pwbox.sendKeys(pw);
		lgbtn.click();
	}
}
