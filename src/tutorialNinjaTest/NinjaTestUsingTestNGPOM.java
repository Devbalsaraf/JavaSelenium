package tutorialNinjaTest;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import tutorialNinjaPOM.NinjaHomePage;
import tutorialNinjaPOM.NinjaLoginPage;
import tutorialNinjaPOM.NinjaValidatePage;

public class NinjaTestUsingTestNGPOM {
	WebDriver driver;
	NinjaHomePage page1;
	NinjaLoginPage page2;
	NinjaValidatePage page3;
	String EID;
	String PID;
	String UID; 
	Sheet mysheet;
	
	@BeforeClass
	public void lauchBrowser() throws EncryptedDocumentException, IOException
	{
		//Read data from excel file
		File myfile=new File("D:\\Selenium\\PracticeSheet.xlsx");
		mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
		Reporter.log("chrome browser is launching");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		page1=new NinjaHomePage(driver);
		page2=new NinjaLoginPage(driver);
		page3=new NinjaValidatePage(driver);
				
	}
	
	@BeforeMethod
	public void loginNinjaApp()
	{
		
		EID = mysheet.getRow(1).getCell(0).getStringCellValue();
		
		PID = mysheet.getRow(2).getCell(0).getStringCellValue();
		
		UID = mysheet.getRow(2).getCell(1).getStringCellValue();
		
		Reporter.log("User is logging to application");
		page1.clickOnLoginOption();
		page2.enterEmailID(EID);
		page2.enterPassword(PID);
		page2.clickOnLoginButton();
		
	}
	
  @Test
  public void validateUser() 
  {
	  Reporter.log("User validation test is running");
	  String ActualResult = page3.validateUser();
	  String ExpectedResult = UID;
	  Assert.assertEquals(ActualResult, ExpectedResult, "Result isn't matching");
	  Reporter.log("Results are matched, Test case passed");
	  
  }
  
  @AfterMethod
  public void logoutApp()
  {
	  Reporter.log("Logged out of the application");
  }
  
  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("Close the browser");
	  driver.close();
  }
  
}
