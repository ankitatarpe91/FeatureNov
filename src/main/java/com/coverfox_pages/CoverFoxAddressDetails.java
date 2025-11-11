package com.coverfox_pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CoverFoxAddressDetails {
	//variable
		@FindBy(className ="mp-input-text") private WebElement pinCodeField;
		@FindBy(id ="want-expert") private WebElement mobileNumField;
		@FindBy(xpath ="//*[text()='Continue']") private WebElement continueButton;
		@FindBy(xpath="//div[contains(text(),'pincode')]") private WebElement pincodeErrormsg;
		@FindBy(xpath="//div[contains(text(),'mobile')]") private WebElement mobileErrormsg;
		
		//constructor
		public  CoverFoxAddressDetails(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
		}
		
		//methods
		public void enterPinColdfield(String pincode) throws EncryptedDocumentException, IOException
		{
			pinCodeField.sendKeys(pincode);
			System.out.println("entering pincode....value is "+pincode);
		}
		public void enterMobileNumberField(String mobNum) throws EncryptedDocumentException, IOException
		{
			mobileNumField.sendKeys(mobNum);
			System.out.println("entering mobile number....value is "+mobNum);
		}
			
		
		public void clickOnContinueButton()
		{
			continueButton.click();
			System.out.println("Clicking on Continue Button");
		}
		public String getPincodeErrormessage()
		{
			Reporter.log("getting pincode error msg ,msg is "+pinCodeField.getText(),true);
			return pincodeErrormsg.getText();
		}
		
		public String getMobileErrormessage()
		{
			Reporter.log("getting mobile error msg ,msg is "+mobileNumField.getText(),true);
			return mobileErrormsg.getText();
		}
}
