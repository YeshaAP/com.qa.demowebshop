package com.ws.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLoginPage extends BaseTest{
	
	
	@Test(priority = 5)
	public void testInValidEmailErrMsg()
	{
		logger = report.createTest("Validating Invalid Email Error Message");
		homepage.clicklogin();
		logger.pass("clicked Loginlink");
		loginpage.enterEmail("ye");
		logger.pass("Entered invalid email");
		loginpage.clickLoginButton();
		logger.pass("clicked loginbutton");
		String invaliderrmsg = loginpage.getinValidEmailErrMsg();
		Assert.assertTrue(invaliderrmsg.contains("dshfhf"));
		logger.pass("Verified InValid Error Message");
		
	}
	
	@Test(priority = 1,enabled = true)
	public void testHomePageTitle() 
	{
		logger = report.createTest("validating Homepage title");
		String title = homepage.getHomePageTitle();
		logger.pass("got the homepage title");
		Assert.assertTrue(title.contains("Demo Web"));
		System.out.println(title);
		logger.pass("verified homepage title successfully");
	}
	
	@Test(priority = 2, enabled = true)
	public void testLoginFunction()
	{
		logger = report.createTest("validating Login Function");
		homepage.clicklogin();
		logger.pass("clicked loginlink");
		String loginpagetitle = loginpage.getLoginPageTitle();
		logger.pass("got the loginpage title");
		System.out.println(loginpagetitle);
		Assert.assertTrue(loginpagetitle.contains("Login"));
		logger.pass("validating login page title");
		loginpage.enterEmail("selauto2@test.com");
		logger.pass("entered username");
		loginpage.enterPassword("Password@123");
		logger.pass("entered password");
		loginpage.clickLoginButton();
		logger.pass("clicked loginbutton");
		String title = homepage.getHomePageTitle();
		Assert.assertTrue(title.contains("Demo Web"));
		logger.pass("verified homepage title successfully");
		homepage.clickLogout();
		logger.pass("clicked logoutbutton");
	}
	
	@Test(priority = 3, enabled = true)
	public void ForgotPasswordLinkPresent()
	{
		logger = report.createTest("Validating ForgotPasswordlink");
		homepage.clicklogin();
		logger.pass("clicked loginlink");
		boolean ispresent = loginpage.IsForgotPasswordLinkPresent();
		System.out.println(ispresent);
		logger.pass("Validating ForgotPasswordlinkpresent successfully");

	}
	
	@Test(priority = 4, enabled = true)
	public void ForgotPasswordFunction() throws InterruptedException
	{
		logger = report.createTest("Validating ForgotPasswordFunction");
		homepage.clicklogin();
		logger.pass("clicked loginlink");
		String loginpagetitle = loginpage.getLoginPageTitle();
		System.out.println(loginpagetitle);
		Assert.assertTrue(loginpagetitle.contains("Login"));
		logger.pass("got the loginpage title");
		loginpage.clickForgotPasswordLink();
		logger.pass("clicked forgotpasswordlink");
		String PRP_title = PRPage.getPasswordRecoveryPageTitle();
	    Assert.assertTrue(PRP_title.contains("Password Recovery"));
	    logger.pass("validating Password Recovery page title successfully");
	    System.out.println(PRP_title);
	    Thread.sleep(2000);
	}
	
	

}
