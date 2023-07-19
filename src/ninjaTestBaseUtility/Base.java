package ninjaTestBaseUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Base {
	WebDriver driver;
	
	public void BrowserInitialize()
	{
		Reporter.log("chrome browser is launching");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
	}

}
