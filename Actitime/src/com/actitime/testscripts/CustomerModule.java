package com.actitime.testscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.generics.FileLib;
import com.actitime.pom.LoginPage;

public class CustomerModule extends BaseClass
{
	@Test
	public void testCreateCustomer() throws InterruptedException, IOException
	{
		LoginPage l=new LoginPage(driver);
		FileLib f=new FileLib();
		driver.get(f.getPropertyValue("url"));
		l.setLogin(f.getPropertyValue("username"),f.getPropertyValue("password"));
	}
}
