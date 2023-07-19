package ninjaTest;

import org.testng.annotations.Test;

import ninjaBase.Base;
import ninjaPOM.AccountPage;
import ninjaPOM.HomePage;
import ninjaPOM.LoginPage;
import ninjaUtility.Utility;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TN_TC_001_ValidateUserName extends Base
{
	HomePage p1;
	LoginPage p2;
	AccountPage p3;
	 @BeforeClass
	  public void openBrowser() throws EncryptedDocumentException, IOException, InterruptedException 
	 {
		 launchBrowser();
		 p1=new HomePage(driver);
		 p2=new LoginPage(driver);
		 p3=new AccountPage(driver);
		 
		 
	  }

  
	
  @BeforeMethod
  public void login() throws InterruptedException, EncryptedDocumentException, IOException 
  {
	  p1.clickOnLoginOption();
	  Thread.sleep(1000);
	  p2.enterEmailID(Utility.getDataFromExcel(0, 0));
	  Thread.sleep(1000);
	  p2.enterPassword(Utility.getDataFromExcel(1, 0));
	  Thread.sleep(1000);
	  p2.clickOnLoginButton();
	  
	  
	  
  }
  
  @Test
  public void Varifyuser() throws EncryptedDocumentException, IOException, InterruptedException 
  {
	  String ExpResult = Utility.getDataFromExcel(1,1);
	  String ActResult = p3.validateUser();
	  Assert.assertEquals(ActResult,ExpResult,"Actual and Expected results are not matching");
	  Thread.sleep(1000);
	  Utility.takeScreenshot(driver, ActResult);
	  
  }
  
  

  @AfterMethod
  public void logout() throws InterruptedException 
  {
	  p3.clickOnLogout();
	  Thread.sleep(1000);
  }


  @AfterClass
  public void closeBrowser() throws InterruptedException 
  {
	  driver.close();
	  Thread.sleep(1000);
  }

}
