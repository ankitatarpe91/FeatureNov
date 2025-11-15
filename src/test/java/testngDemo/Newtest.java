package testngDemo;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Newtest {
  //@Test
//  public void f() {
//	  
//	  String actual="Test";
//	  String expected="Test1";
//	  Assert.assertEquals(actual,expected,"TC FAILED");
//	  Reporter.log("TC PASSED",true);
//	Assert.assertNotNull(actual);
//  }
	SoftAssert softAssert=new SoftAssert();
  @Test
  public void f1() {
	  
	  String actual="Test";
	  String expected="Test1";
	  softAssert.assertEquals(actual,expected,"TC FAILED");
	 // Assert.assertEquals(actual,expected,"TC FAILED");
	  softAssert.assertNotNull(expected);
	  
	//Assert.assertNotNull(actual);
	  softAssert.assertAll();
	  Reporter.log("TC PASSED",true);
  }
}
