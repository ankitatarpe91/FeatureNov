package com.coverfox_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxResultPage {

	//variable
		
	
		
		@FindBy(xpath = "//div[contains(text(),'Insurance Plans')]") private WebElement matchingResult;
		//constructor
		
		public CoverFoxResultPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public String getmatchingResultNumber()
		{
			String result = matchingResult.getText();
			System.out.println("Maching result:-"+result);
			String[] temp = result.split(" ");
			String finalResult = temp[0];
			return finalResult;
		}
}
