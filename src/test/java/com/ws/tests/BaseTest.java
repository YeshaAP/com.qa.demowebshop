package com.ws.tests;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.ws.base.DriverScipt;
import com.ws.page.BooksPage;
import com.ws.page.HomePage;
import com.ws.page.LoginPage;
import com.ws.page.PasswordRecoveryPage;
import com.ws.utils.Helper;

public class BaseTest extends DriverScipt {
	
	protected static ExtentHtmlReporter extent;
	protected static ExtentReports report;
	protected static ExtentTest logger;
	
	HomePage homepage;
	LoginPage loginpage;
	PasswordRecoveryPage PRPage;
	BooksPage bookspage;
	
	@BeforeSuite
	public void setupReport()
	{
		 extent = new ExtentHtmlReporter("./reports/ws_index.html");
		 report = new ExtentReports();
		 report.attachReporter(extent);
	}
		
	@BeforeMethod
	public void SetUp()
	{
		initApplication();
		homepage = new HomePage();
		loginpage = new LoginPage();
		PRPage = new PasswordRecoveryPage();
		bookspage = new BooksPage();
	}
	
	@AfterMethod
	public void teardown(ITestResult result)
	{
		if(result.getStatus() == ITestResult.FAILURE)
		{
			try 
			{
				logger.fail("Test Failed", MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreen(driver)).build());
			} catch (IOException e)
			{
				e.printStackTrace();
			}
		}	
		report.flush();
		quitDriver();
	}

}
