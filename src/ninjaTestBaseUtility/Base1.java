package ninjaTestBaseUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base1 {
	WebDriver driver;
	
	public void browserInitialize() throws IOException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Utility1.getDataFromPropertiesFiles("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	}

}
