package com.ws.utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.ws.base.DriverScipt;

public class Helper extends DriverScipt {
	
	//this method is used to capture screenshot
	
	public static String captureScreen(WebDriver driver)
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		/*
		 *  have to typecast this driver reference to the TakesScreenshot interface and 
		 *  you have to call one method called getScreenshotAs with File type output
		 */
		//String screenpath = "C:/WorkSpace/BATCH28/FRAMEWORK/com.qa.demowebshop/reports/screenshots/scren.png";
		/*
		 *  this approach will be only suitable for this fixed path, but in real time, 
		 *the team lead is making proptotype so his path may be different than our computer
		 */
		String screenpath = System.getProperty("user.dir") + "./reports/screenshots/screen.png";
		 /* this is dynamic path, so we can use for any computer path
		  * this statement will define your destination location of the screenshots
		 */
		try {
			FileHandler.copy(src, new File(screenpath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return screenpath;
	}

}
