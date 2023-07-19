package miscelenious;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderList {

	public static void main(String[] args) throws InterruptedException {
		// How to select dropdown elements when we don't have select tag
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		driver.findElement(By.name("q")).sendKeys("honda");
		Thread.sleep(1000);
		
		List<WebElement> results = driver.findElements(By.xpath("//ul[@class='G43f7e']//li"));
		
		for(WebElement op:results)
		{
			String exp = "honda shine";
			String act = op.getText();
			if(exp.equals(act))
			{
				op.click();
				break;
			}
			Thread.sleep(1000);
			
			
		}
		
		
		

	}

}
