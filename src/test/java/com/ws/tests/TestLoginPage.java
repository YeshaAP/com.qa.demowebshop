package com.ws.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.ws.base.DriverScipt;
import com.ws.page.HomePage;
import com.ws.page.LoginPage;

public class TestLoginPage extends DriverScipt{
	
	@Test(enabled = false)
	public void testHomePageTitle() 
	{
		initApplication();
		HomePage homepage = new HomePage();
		String title = homepage.getHomePageTitle();
		Assert.assertTrue(title.contains("Demo Web"));
		System.out.println(title);
		quitDriver();
	}
	
	@Test(enabled = false)
	public void testLoginFunction()
	{
		initApplication();
		HomePage homepage = new HomePage();
		homepage.clicklogin();
		LoginPage loginpage = new LoginPage();
		String loginpagetitle = loginpage.getLoginPageTitle();
		System.out.println(loginpagetitle);
		Assert.assertTrue(loginpagetitle.contains("Login"));
		loginpage.enterEmail("selauto2@test.com");
		loginpage.enterPassword("Password@123");
		loginpage.clickLoginButton();
		String title = homepage.getHomePageTitle();
		Assert.assertTrue(title.contains("Demo Web"));
		homepage.clickLogout();
		quitDriver();
		
	}
	
	@Test(enabled = true)
	public void ForgotPasswordLinkPresent()
	{
		initApplication();
		HomePage homepage = new HomePage();
		homepage.clicklogin();
		LoginPage loginpage = new LoginPage();
		boolean ispresent = loginpage.isForgotPasswordLinkPresent();
		System.out.println(ispresent);
		quitDriver();

	}
	
	public void ForgotPasswordFunction()
	{
		initApplication();
		HomePage homepage = new HomePage();
		homepage.clicklogin();
		LoginPage loginpage = new LoginPage();
		loginpage.clickForgotPasswordLink();
		
		
	}

}
