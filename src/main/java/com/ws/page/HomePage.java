package com.ws.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ws.base.DriverScipt;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

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
		@FindBy(xpath = "(//a[contains( text(), 'Books')])[1]")WebElement booksmenu;
		@FindBy(xpath = "(//a[contains( text(), 'Computers')])[1]")WebElement computersmenu;
	
	//***********************************Page Initialization*******************************
		
		public HomePage()
		{
			PageFactory.initElements(driver, this);
		}
	
	//***************************Page Actions/Methods********************************************	
		
		
			
		public String getHomePageTitle()
		{
			return driver.getTitle();
		}
		
		public void clicklogin()
		{
			loginlink.click();
		}
		public void clickLogout() 
		{
			logoutlink.click();
		}
					
		public void clickBooksMenu()
		{
			booksmenu.click();
		}
		public void clickComputersMenu()
		{
			computersmenu.click();
		}

}
