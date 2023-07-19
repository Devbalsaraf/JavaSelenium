package actionClassStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionClassUse {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		Actions act=new Actions(driver);
		WebElement menOptionButton = driver.findElement(By.xpath("(//span[contains(@class,'ui-menu-icon')])[1]"));
//		act.moveToElement(menOptionButton).perform();
//		act.click().perform();
		
		//act.click(menOptionButton).perform();
		
		act.moveToElement(menOptionButton).click().build().perform();

	}

}
