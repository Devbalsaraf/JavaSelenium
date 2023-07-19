package ninjaBase;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ninjaUtility.Utility;

public class Base 
{
	public WebDriver driver;
	public void launchBrowser() throws EncryptedDocumentException, IOException, InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Utility.getDataFromExcel(0,1));
		Thread.sleep(2000);
	}

}
