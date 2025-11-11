package com.coverfox_pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.coverFox.utils.Utility;





public class CoverFoxMemberDetailspage {
	
	//variables
	@FindBy(id = "Age-You") private WebElement handleAgeDropDown;
	@FindBy(className = "next-btn") private WebElement nextButton;
	
	//constructor
	public CoverFoxMemberDetailspage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//methods
	
	public void handleAgedropDown(String age) throws EncryptedDocumentException, IOException
	{
		//Select select=new Select(handleAgeDropDown);
		//select.selectByVisibleText(CommonMethodUse.readDataFromExcel("coverFox", 0, 0));
		Utility.handleDropDownVisibleText(handleAgeDropDown," "+age+" years ");
	}
	public void nextButton()
	{
		nextButton.click();
	}
	

}