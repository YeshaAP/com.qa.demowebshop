package com.ws.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ws.base.DriverScipt;

public class LoginPage extends DriverScipt{
	
	
	//************************************Page Elements***********************************
	
			@FindBy(id = "Email") WebElement emailtextfield;
			@FindBy(name = "Password")WebElement passwordtextfield;
			@FindBy(xpath = "//input[@class ='button-1 login-button']")WebElement loginbutton;
			@FindBy(linkText = "Forgot password?")WebElement forgotPasswordlink;
		
	//***********************************Page Initialization*******************************
			
			public LoginPage()
			{
				PageFactory.initElements(driver, this);
			}
		
	//***************************Page Actions/Methods********************************************	
			
			//order doesn't matter in methods
			
			public void enterEmail(String email)
			{
				emailtextfield.clear();
				emailtextfield.sendKeys(email);
			}
			
			public void enterPassword(String password)
			{
				passwordtextfield.sendKeys(password);
			}
			
			public void clickLoginButton()
			{
				loginbutton.click();
			}
			
			public boolean IsForgotPasswordLinkPresent()
			{
				return forgotPasswordlink.isDisplayed();
			}
			
			public void clickForgotPasswordLink()
			{
				forgotPasswordlink.click();
			}
			
			public String getLoginPageTitle()
			{
				return driver.getTitle();
			}

}
