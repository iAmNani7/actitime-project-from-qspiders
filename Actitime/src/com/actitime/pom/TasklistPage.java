package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.BaseClass;

public class TasklistPage extends BaseClass {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addnewbtn;
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newcustomerlistbtn;
	@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @class]")
	private WebElement customernametxbox;
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement cusdescbox;
	@FindBy(xpath="(//div[@class='dropdownButton'])[15]")
	private WebElement dropdownlistbtn;
	@FindBy(xpath="//div[text()='- Select Customer -']/..//div[text()='Our company']")
	private WebElement ourcustomer;
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createcustbtn;
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[1]")
	private WebElement createcustomermsgdiv;
	
	public WebElement getCreatecustomermsgdiv() {
		return createcustomermsgdiv;
	}

	public TasklistPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddnewbtn() {
		return addnewbtn;
	}
	public WebElement getNewcustomerlistbtn() {
		return newcustomerlistbtn;
	}
	public WebElement getCustomernametxbox() {
		return customernametxbox;
	}
	public WebElement getCusdescbox() {
		return cusdescbox;
	}
	public WebElement getDropdownlistbtn() {
		return dropdownlistbtn;
	}
	public WebElement getOurcustomer() {
		return ourcustomer;
	}
	public WebElement getCreatecustbtn() {
		return createcustbtn;
	}


}
