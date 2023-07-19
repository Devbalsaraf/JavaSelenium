package actionClassStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardKeysUse {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/signup/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		WebElement Day = driver.findElement(By.id("day"));
		Actions act=new Actions(driver);
		//act.click(Day).perform();
		Thread.sleep(1000);
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		Thread.sleep(1000);
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		Thread.sleep(1000);
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		Thread.sleep(500);
//		act.sendKeys(Keys.ENTER).perform();
		
		//act.sendKeys(Day,Keys.HOME,Keys.ENTER).perform();// select first option in the list
		
		act.click(Day).perform();
		Thread.sleep(500);

		for(int i=0;i<=5;i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(500);
		}
		
		act.sendKeys(Keys.ENTER).perform();
	}

}
