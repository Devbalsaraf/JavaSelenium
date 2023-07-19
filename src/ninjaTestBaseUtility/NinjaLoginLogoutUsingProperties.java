package ninjaTestBaseUtility;

import org.testng.annotations.Test;

import tutorialNinjaPOM.NinjaHomePage;
import tutorialNinjaPOM.NinjaLoginPage;
import tutorialNinjaPOM.NinjaValidatePage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.bouncycastle.jcajce.provider.symmetric.ChaCha.BaseCC20P1305;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class NinjaLoginLogoutUsingProperties extends Base1 {
	NinjaHomePage p1;
	NinjaLoginPage p2;
	NinjaValidatePage p3;
	
	
	
  @BeforeClass
  public void beforeClass() throws IOException 
  {
	  Reporter.log("Launching browser", true);
	  browserInitialize();
	  p1=new NinjaHomePage(driver);
	  p2=new NinjaLoginPage(driver);
	  p3=new NinjaValidatePage(driver);
	  
	  
   }

  @BeforeMethod
  public void beforeMethod() throws IOException, InterruptedException 
  {
	  Reporter.log("Logging in", true);
	  p1.clickOnLoginOption();
	  p2.enterEmailID(Utility1.getDataFromPropertiesFiles("EID"));
	  p2.enterPassword(Utility1.getDataFromPropertiesFiles("PID"));
	  p2.clickOnLoginButton();
	  Thread.sleep(1000);
	  
  }

  @Test
  public void varifyUser() throws IOException 
  {
	  int TCID=123;
	  Reporter.log("Validating user",true);
	  String actID = p3.validateUser();
	  String ExpID = Utility1.getDataFromPropertiesFiles("EID");
	  Assert.assertEquals(actID, ExpID, "Username isn't matching");
	  Reporter.log("test case passed",true);
	  Utility1.captureScreenShot(driver, TCID);
  }
  

  @AfterMethod
  public void logoutfromApp(ITestResult result) throws IOException, InterruptedException 
  {
	  int TCID=555;
	  if(result.getStatus()==ITestResult.FAILURE)
	  {
		  Utility1.captureScreenShot(driver, TCID);
	  }
	  
	  Thread.sleep(2000);
	  Reporter.log("logging out",true);
  }

  

  @AfterClass
  public void afterClass() 
  {
	  Reporter.log("close browser",true);
	  driver.close();
  }

}
