package testNGStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	@Parameters("BrowserName")
  @Test
  public void BrowserTest(String BrowserName) throws InterruptedException 
{
		WebDriver driver = null;
		if(BrowserName.equals("Chrome"))
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
		}
		else if(BrowserName.equals("Firefox"))
		{
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			
		}
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		// provide username
		driver.findElement(By.id("input-email")).sendKeys("balsarafdev@gmail.com");
		Thread.sleep(1000);
		// provide password
		driver.findElement(By.id("input-password")).sendKeys("@Brand123");
		Thread.sleep(1000);
		
		//click on login button
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(1000);
		
		//validate user
		
		String actual = driver.findElement(By.linkText("Edit your account information")).getText();
		String expected = "Edit your account information";
		if(actual.equals(expected))
		{
			Reporter.log("Login successfull");
		}
		else
		{
			Reporter.log("Test case failed");
		}
  }
}
