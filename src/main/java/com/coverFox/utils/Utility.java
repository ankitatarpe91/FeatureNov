package com.coverFox.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility {
	
	public static void getScreenShotuse(WebDriver driver,String screenShotName) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String timestamp = new SimpleDateFormat("dd-MM-yyyy-Hh-mm-ss").format(new Date());
		String path = System.getProperty("user.dir");
		File dest = new File(path+"\\Screenshot\\"+screenShotName+"_"+timestamp+".png");
		System.out.println("Taking ScreenShot and saving at location:-"+dest);
		org.openqa.selenium.io.FileHandler.copy(src, dest);
		
	}
	public static String readDataFromExcel(String sheetName,int row,int cell) 
			throws EncryptedDocumentException, IOException
	{
		FileInputStream myfile=new FileInputStream("E:\\Automation\\Excel_sheet\\TestData.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet(sheetName);
			
		//Sheet mySheet = WorkbookFactory.create(myfile).getSheet(sheetName);
		
		String testData = mySheet.getRow(row).getCell(cell).getStringCellValue();
		System.out.println("Readingng data from excel:-"+testData);
		return testData;
		
	}
	public static String readDataFromProperties(String key) throws IOException {
		Properties properties=new Properties();
	     FileInputStream myfile=new FileInputStream("C:\\Users\\Hii\\eclipse-workspace\\11_Oct\\src\\main\\resources\\config\\config.properties");
	     properties.load(myfile);
	    
		 String value = properties.getProperty(key);
		 System.out.println("Reading "+key+"and value is "+value);
		 return value;
	     
		
	}
	public static void handleDropDownVisibleText(WebElement element,String visibletext)
	{
		Select select=new Select(element);
		select.selectByVisibleText(visibletext);
		System.out.println("Handling drop down and value is "+visibletext);
	}

}
