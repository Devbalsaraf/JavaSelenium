package actionClassStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropuse {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		WebElement src = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement dest = driver.findElement(By.id("bank"));
	
		
//		JavascriptExecutor j = ((JavascriptExecutor)driver);
//		j.executeScript("arguments[0].scrollIntoView(true)", dest);
		
		Actions act=new Actions(driver);
		act.scrollToElement(dest);
		act.dragAndDrop(src, dest).perform();
		
		Thread.sleep(1000);
		
		WebElement src1 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement dest1 = driver.findElement(By.id("amt7"));
		act.clickAndHold(src1).moveToElement(dest1).release().build().perform();
		
		
		

	}

}
