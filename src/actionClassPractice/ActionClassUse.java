package actionClassPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassUse {

	public static void main(String[] args) throws InterruptedException {
		// Action class--> click(webelement), Doubliclick(),contextclick(), draganddrop()
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(1000);
//		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
//		WebElement seleniumButton = driver.findElement(By.linkText("Selenium"));
		Actions act=new Actions(driver);
		//act.click(seleniumButton).perform();
		
		//act.moveToElement(rightClick).contextClick().build().perform();
		
		WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement dest = driver.findElement(By.id("bank"));
		act.dragAndDrop(src, dest).perform();
		
		WebElement src1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement dest1 = driver.findElement(By.id("amt7"));
//		act.dragAndDrop(src1, dest1).perform();
		act.clickAndHold(src1).moveToElement(dest1).release().build().perform();
		
		
		
		
		
		
		

	}

}
