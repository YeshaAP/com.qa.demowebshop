package com.ws.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLoginPage extends BaseTest{
	
	@Test(priority = 1, enabled = false)
	public void testHomePageTitle() 
	{
		String title = homepage.getHomePageTitle();
		Assert.assertTrue(title.contains("Demo Web"));
		System.out.println(title);
	}
	
	@Test(priority = 2,enabled = false)
	public void testLoginFunction()
	{
		homepage.clicklogin();
		String loginpagetitle = loginpage.getLoginPageTitle();
		System.out.println(loginpagetitle);
		Assert.assertTrue(loginpagetitle.contains("Login"));
		loginpage.enterEmail("selauto2@test.com");
		loginpage.enterPassword("Password@123");
		loginpage.clickLoginButton();
		String title = homepage.getHomePageTitle();
		Assert.assertTrue(title.contains("Demo Web"));
		homepage.clickLogout();
	}
	
	@Test(priority = 3, enabled = true)
	public void ForgotPasswordLinkPresent()
	{
		homepage.clicklogin();
		boolean ispresent = loginpage.IsForgotPasswordLinkPresent();
		System.out.println(ispresent);
	}
	
	@Test(priority = 4, enabled = true)
	public void ForgotPasswordFunction() throws InterruptedException
	{
		homepage.clicklogin();
		String loginpagetitle = loginpage.getLoginPageTitle();
		System.out.println(loginpagetitle);
		Assert.assertTrue(loginpagetitle.contains("Login"));
		loginpage.clickForgotPasswordLink();
		String PRP_title = PRPage.getPasswordRecoveryPageTitle();
	    Assert.assertTrue(PRP_title.contains("Password Recovery"));
	    System.out.println(PRP_title);
	    Thread.sleep(2000);
	}
	
	

}
