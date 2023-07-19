package testNGStudy;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardAssertStudy {
  @Test
  public void Test1() {
	  String actualResult = "VCTC";
	  String expectedResult = "VCTC ";
	  Assert.assertNotEquals(actualResult, expectedResult);
	  Reporter.log("Test1 not euqual is running", true);
		 
	 Assert.assertEquals(actualResult, expectedResult, "Result is not matching");
	 Reporter.log("Test1 is running", true);
	 
	 
  }
	 @Test
	 public void Test2()
	 {
		 int a=10;
		 int b=20;
		 Assert.assertNotEquals(a,b);
		 Reporter.log("Test2 is running", true);
		 
	 }
	 
	 @Test
	 public void test3()
	 {
		 boolean result = false;
		 Assert.assertTrue(result, "Result is false");
		 Reporter.log("Test3 is running",true);
		 
	 }
	 
	 @Test
	 public void test4()
	 {
		 boolean result = false;
		 Assert.assertFalse(result, "Result is true");
		 Reporter.log("Test4 is running",true);
		 
	 }
	 
	 
  }

