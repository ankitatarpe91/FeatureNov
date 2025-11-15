package coverfoxrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {
				
		"C:\\Users\\Hii\\eclipse-workspace\\11_Oct\\src\\test\\resources\\FeatureFile\\CoverfoxHealthplan.feature"
		}
		,glue= {"StepDefination","hooks"}
		,plugin = {"pretty","html:target/Cucumber-reports/reports.html"}, publish = true,
				dryRun=false)


public class HealthInsuranceRunner extends AbstractTestNGCucumberTests {
	
}