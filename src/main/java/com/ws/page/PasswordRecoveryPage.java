package com.ws.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ws.base.DriverScipt;

public class PasswordRecoveryPage extends DriverScipt{

	//************************************Page Elements***********************************
	
	@FindBy(xpath = "//input[@data-val-required='Enter your email']") WebElement recoveryEmailtextfield;
	@FindBy(xpath = "//input[@name='send-email']") WebElement recoverbutton;
		
    //***********************************Page Initialization*******************************
	
	public PasswordRecoveryPage()
	{
		PageFactory.initElements(driver, this);
	}

//***************************Page Actions/Methods********************************************	
	
	//order doesn't matter in methods
	
	public void enterRecoveryEmail(String email)
	{
		recoveryEmailtextfield.clear();
		recoveryEmailtextfield.sendKeys(email);
	}
	
	public void clickRecoverButton()
	{
		recoverbutton.click();
	}
	
	public String getPasswordRecoveryPageTitle()
	{
		return driver.getTitle();
	}
}
