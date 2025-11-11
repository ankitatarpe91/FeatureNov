package com.coverFox.DriverConfig;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

import com.coverFox.utils.Utility;

public class Driverfactory {
		
		static WebDriver driver;

		public static WebDriver initBrowser(String BrowserNmae) throws IOException
		{
			if(BrowserNmae.equalsIgnoreCase("chrome"))
	       {
	    	   driver=new ChromeDriver();
	    	   Reporter.log("Setting browser as "+BrowserNmae,true);
		    }
			else if(BrowserNmae.equalsIgnoreCase("edg"))
		       {
		    	   driver=new EdgeDriver();
		    	   Reporter.log("Setting browser as "+BrowserNmae,true);
			    }
			else if(BrowserNmae.equalsIgnoreCase("firefox"))
		       {
		    	   driver=new FirefoxDriver();
		    	   Reporter.log("Setting browser as "+BrowserNmae,true);
			    }
			
			driver.manage().window().maximize();
			driver.get(Utility.readDataFromProperties("url"));
			return driver;
			
		}
		public static  WebDriver getDriver()
		{
			return driver;
			
		}

	}


