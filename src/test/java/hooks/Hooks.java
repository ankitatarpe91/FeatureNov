package hooks;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Reporter;

import com.coverFox.DriverConfig.Driverfactory;
import com.coverFox.utils.Utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	@Before
	public void launchBrowser() throws IOException
	{
		Driverfactory.initBrowser(Utility.readDataFromProperties("browser"));
	}
	
	@After(order=1)
	public void tearDown()
	{
	 Driverfactory.getDriver().quit();
	 Reporter.log("Closing Browser",true);
	}
	@After(order=2)
	public void takeScreenShot(Scenario scenario)
	{
		boolean result = scenario.isFailed();
		if(result)
		{
			byte[] ss=((TakesScreenshot)Driverfactory.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(ss, "image/png", scenario.getName());
			Reporter.log("Taking Screenshot",true);
		}

	}
}

