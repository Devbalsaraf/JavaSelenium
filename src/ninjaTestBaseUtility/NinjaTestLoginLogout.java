package ninjaTestBaseUtility;

import org.testng.annotations.Test;

import tutorialNinjaPOM.NinjaHomePage;
import tutorialNinjaPOM.NinjaLoginPage;
import tutorialNinjaPOM.NinjaValidatePage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

public class NinjaTestLoginLogout extends Base {
	
	
	NinjaHomePage page1;
	NinjaLoginPage page2;
	NinjaValidatePage page3;
	
  @Test
  public void validateUser() throws EncryptedDocumentException, IOException 
  {
	  int TCID=123;
	  Reporter.log("Test case"+TCID +"is running", true);
	  String actualID = page3.validateUser();
	  String expectedID = Utility.getDataFromExcel(2,1);
	  Assert.assertEquals(actualID, expectedID, "Results isn't matching");
	  Reporter.log("TC is passed");
	  Utility.captureScreenshot(driver, TCID);
  }
  
  

  @BeforeMethod
  public void loginApplication() throws EncryptedDocumentException, IOException 
  {
	  Reporter.log("Application logged in", true);
	  
	  page1.clickOnLoginOption();
	  page2.enterEmailID(Utility.getDataFromExcel(1, 0));
	  page2.enterPassword(Utility.getDataFromExcel(2, 0));
	  page2.clickOnLoginButton();
  }

  @BeforeClass
  public void launchBrowser() 
  {
	  Reporter.log("browser is launching");
	  BrowserInitialize();
	  
	    page1=new NinjaHomePage(driver);
		page2=new NinjaLoginPage(driver);
		page3=new NinjaValidatePage(driver);
  }

  @AfterClass
  public void closeBrowser() 
  {
	  Reporter.log("close browser");
	  driver.close();
  }

  @AfterMethod
  public void logoutBrowser() {
	  Reporter.log("Logged out");
  }

}
