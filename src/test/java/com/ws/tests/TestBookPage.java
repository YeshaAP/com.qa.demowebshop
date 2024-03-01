package com.ws.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBookPage extends BaseTest {
	
	public void testHomePageTitle() 
	{
		logger = report.createTest("validating Homepage title");
		String title = homepage.getHomePageTitle();
		logger.pass("got the homepage title");
		Assert.assertTrue(title.contains("Demo Web"));
		System.out.println(title);
		logger.pass("verified homepage title successfully");
	}
	
	@Test
	public void TestBookPageTitle()
	{
		logger = report.createTest("Validating BookPage Title");
		homepage.clickBooksMenu();
		logger.pass("clicked Bookslink");
		String title = bookspage.getBookPageTitle();
		System.out.println(title);
		logger.pass("got the Books Page Title");
		Assert.assertTrue(title.contains("Books"));
		logger.pass("Verified Bookspage Title succesfully");
		
	}	

}
