package com.ws.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ws.base.DriverScipt;

public class PasswordRecoveryPage extends DriverScipt{

	//************************************Page Elements***********************************
	
	@FindBy(xpath = "//input[@data-val-required='Enter your email']") WebElement recoveryEmail;
	
	
	

    //***********************************Page Initialization*******************************
	
	public PasswordRecoveryPage()
	{
		PageFactory.initElements(driver, this);
	}

//***************************Page Actions/Methods********************************************	
	
	//order doesn't matter in methods
}
