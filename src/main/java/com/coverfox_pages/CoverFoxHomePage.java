package com.coverfox_pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHomePage {
	//variable
	@FindBy(xpath = "//button[text()='Get Started']") private WebElement getStartedButton;
	
	
	//constructor
	public CoverFoxHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//method
	public void getStartedButton()
	{
		getStartedButton.click();
	}


	}


