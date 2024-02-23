package com.ws.base;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverScipt {
	
	/*
	 * public driver reference which can be accessed across the (entire) project
	 */
	
	public static WebDriver driver;
	
	Properties prop;
	
	/*
	 * This constructor is responsible for loading the properties file
	 */
	
	public DriverScipt()
	{
		try 
		{
			File file = new File("./src/test/resources/config/config.properties");
			FileInputStream fis = new FileInputStream(file);
			prop = new Properties();
			prop.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("unable to load properties file, Please check");
			e.printStackTrace();
		}
	}
	
	/*
	 * this method is used to launch the browser and apply all the time wait setting and also navigate to 
	 * the application
	 */
	
	
	public void initApplication()
	{
		String browser = prop.getProperty("browser");
		
		if(browser.trim().equalsIgnoreCase("Chrome")) {
		    System.out.println("Browser inuse : "+ browser);
			driver = new ChromeDriver();
		}
		else if(browser.trim().equalsIgnoreCase("firefox")) {
			System.out.println("Browser inuse : "+ browser);
			driver = new FirefoxDriver();
		}
		else if(browser.trim().equalsIgnoreCase("edge")) {
		    System.out.println("Browser inuse : "+ browser);
			driver = new EdgeDriver();
		}
		else {
			System.out.println("unsupported browser type! Please check config file");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		getUrl();
	}
		
	/* 
	 * this method is used to get Url of an application from properties file	
	 */
		
	public void getUrl() {
		String url = prop.getProperty("url");
		driver.get(url);
	}
	
	/*
	 * this method is used to quit the driver instance
	 */
	public static void quitDriver() {
		driver.quit();
	}
		

}

