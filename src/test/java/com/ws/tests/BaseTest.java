package com.ws.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.ws.base.DriverScipt;
import com.ws.page.HomePage;
import com.ws.page.LoginPage;
import com.ws.page.PasswordRecoveryPage;

public class BaseTest extends DriverScipt {
	
	HomePage homepage;
	LoginPage loginpage;
	PasswordRecoveryPage PRPage;
		
	@BeforeMethod
	public void SetUp()
	{
		initApplication();
		homepage = new HomePage();
		loginpage = new LoginPage();
		PRPage = new PasswordRecoveryPage();
	}
	
	@AfterMethod
	public void teardown()
	{
		quitDriver();
	}

}
