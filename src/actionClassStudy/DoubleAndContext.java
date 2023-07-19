package actionClassStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleAndContext {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act=new Actions(driver);
		//act.contextClick(rightClickButton).perform();
		act.moveToElement(rightClickButton).contextClick().build().perform();
		
		WebElement doubleClick = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me')]"));
		act.doubleClick(doubleClick).perform();

	}

}
