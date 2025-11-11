package com.coverfox_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHealthPlanPage {
	
	//variable
		@FindBy(className = "next-btn") private WebElement nextButton; 
		
		
		
		//constructor
		public CoverFoxHealthPlanPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//method
		public void nextbutton()
		{
			nextButton.click();
			
		}


}
