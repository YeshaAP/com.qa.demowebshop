package com.ws.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.ws.base.DriverScipt;
import com.ws.page.HomePage;
import com.ws.page.LoginPage;
import com.ws.page.PasswordRecoveryPage;

public class TestLoginPage extends DriverScipt{
	
	@Test(priority = 1, enabled = false)
	public void testHomePageTitle() 
	{
		initApplication();
		HomePage homepage = new HomePage();
		String title = homepage.getHomePageTitle();
		Assert.assertTrue(title.contains("Demo Web"));
		System.out.println(title);
		quitDriver();
	}
	
	@Test(priority = 2,enabled = false)
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
	
	@Test(priority = 3, enabled = true)
	public void ForgotPasswordLinkPresent()
	{
		initApplication();
		HomePage homepage = new HomePage();
		homepage.clicklogin();
		LoginPage loginpage = new LoginPage();
		boolean ispresent = loginpage.IsForgotPasswordLinkPresent();
		System.out.println(ispresent);
		quitDriver();

	}
	@Test(priority = 4, enabled = true)
	public void ForgotPasswordFunction()
	{
		initApplication();
		HomePage homepage = new HomePage();
		homepage.clicklogin();
		LoginPage loginpage = new LoginPage();
		String loginpagetitle = loginpage.getLoginPageTitle();
		System.out.println(loginpagetitle);
		Assert.assertTrue(loginpagetitle.contains("Login"));
		loginpage.clickForgotPasswordLink();
		PasswordRecoveryPage PRPage = new PasswordRecoveryPage();
	    String PRP_title = PRPage.getPasswordRecoveryPageTitle();
	    Assert.assertTrue(PRP_title.contains("Password Recovery"));
	    System.out.println(PRP_title);
	    quitDriver();
		
	}

}
