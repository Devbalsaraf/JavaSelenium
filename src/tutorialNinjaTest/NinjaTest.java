package tutorialNinjaTest;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import tutorialNinjaPOM.NinjaHomePage;
import tutorialNinjaPOM.NinjaLoginPage;
import tutorialNinjaPOM.NinjaValidatePage;

public class NinjaTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File myfile=new File("D:\\Selenium\\PracticeSheet.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		String EID = mysheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println(EID);
		String PID = mysheet.getRow(2).getCell(0).getStringCellValue();
		System.out.println(PID);
		String UID = mysheet.getRow(2).getCell(1).getStringCellValue();
		System.out.println(UID);
		
		
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("incognito");
		
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));


		NinjaHomePage page1=new NinjaHomePage(driver);
		page1.clickOnLoginOption();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		NinjaLoginPage page2=new NinjaLoginPage(driver);
		page2.enterEmailID(EID);
		page2.enterPassword(PID);
		page2.clickOnLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		NinjaValidatePage page3=new NinjaValidatePage(driver);
		page3.validateUser(UID);
		
		
		
		
		

	}

}
