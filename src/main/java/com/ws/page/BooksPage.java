package com.ws.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ws.base.DriverScipt;

public class BooksPage extends DriverScipt{
	

	//************************************Page Elements***********************************
	
	@FindBy(xpath = "//h1[text() = 'Books']")WebElement headingBookS;
			
		
	//***********************************Page Initialization*******************************
			
			public BooksPage()
			{
				PageFactory.initElements(driver, this);
			}
		
	//***************************Page Actions/Methods********************************************	
			
			//order doesn't matter in methods
			
			public String getBookPageTitle()
			{
				return driver.getTitle();
			}
			public String getBooksHeading()
			{
				return headingBookS.getText();
			}
	
}
