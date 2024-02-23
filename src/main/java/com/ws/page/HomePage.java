package com.ws.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ws.base.DriverScipt;

/*
 * Title : HomePage 
 * Description  :HomePage class which contains elements and its methods
 * Developed By : Yesha  Developed date : 02/22/2024
 * Verified / Approved By: john@gmail.com
 */

 public class HomePage extends DriverScipt {
	
	//************************************Page Elements***********************************
	
		@FindBy(xpath = "//a[@class='ico-login']")WebElement loginlink;
		@FindBy(linkText = "Log out")WebElement logoutlink;
	
	//***********************************Page Initialization*******************************
		
		public HomePage()
		{
			PageFactory.initElements(driver, this);
		}
	
	//***************************Page Actions/Methods********************************************	
		
		public void clickLogout() 
		{
			logoutlink.click();
		}
		
		public String getHomePageTitle()
		{
			return driver.getTitle();
		}
		
		public void clicklogin()
		{
			loginlink.click();
		}

}
