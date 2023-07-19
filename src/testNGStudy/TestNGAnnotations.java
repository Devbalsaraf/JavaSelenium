package testNGStudy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class TestNGAnnotations {
	
	// @Test-Used for execution of test method or test case
  @Test
  public void validateUserID() {
	  //System.out.println("User ID is valid");
	  Reporter.log("User ID is valid", true);
  }
  
  @Test
  public void validatePin()
  {
	  Reporter.log("Pin is entered", true);
  }
  // Uses for execution of method before execution of every test method or tc with an annotation @Test 
  @BeforeMethod
  public void loginToApplication() {
	  //System.out.println("User is logged in Successfylly");
	  Reporter.log("User is logged in Successfylly", true);
  }
// use to execute method after execution of every Test method
  @AfterMethod
  public void logOutApplication() {
	  //System.out.println("User is logged out sucessfully");
     Reporter.log("User is logged out sucessfully", true);  
  }
  
  
 // Use to execute methods before execution of test class
  @BeforeClass
  public void launchBrowser() {
	 // System.out.println("Browser is launched");
	  Reporter.log("Browser is launched", true);
  }

  @AfterClass
  public void closeBrowser() {
	  //System.out.println("Close the browser");
	  Reporter.log("Close the browser",true);
  }

}
