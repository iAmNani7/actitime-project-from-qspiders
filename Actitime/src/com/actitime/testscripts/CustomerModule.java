package com.actitime.testscripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.generics.FileLib;
import com.actitime.pom.EnterTimeTrack;
import com.actitime.pom.LoginPage;
import com.actitime.pom.TasklistPage;
@Listeners(com.actitime.generics.ListenerImplementation.class)
public class CustomerModule extends BaseClass
{
	@Test
	public void testCreateCustomer() throws InterruptedException, IOException, AWTException
	{
		EnterTimeTrack e=new EnterTimeTrack(driver);
		e.setTaskButton();

		TasklistPage t=new TasklistPage(driver);
		t.getAddnewbtn().click();
		t.getNewcustomerlistbtn().click();
		FileLib f=new FileLib(); 
		String name=f.getExcelValue("createcustomermodule", 1, 2);
		t.getCustomernametxbox().sendKeys(name);
		t.getCusdescbox().sendKeys(f.getExcelValue("createcustomermodule", 1, 3));
		t.getDropdownlistbtn().click();
		t.getOurcustomer().click();
		t.getCreatecustbtn().click();
		Thread.sleep(3000);
		Assert.assertEquals(t.getCreatecustomermsgdiv().getText(), name);
	}
}