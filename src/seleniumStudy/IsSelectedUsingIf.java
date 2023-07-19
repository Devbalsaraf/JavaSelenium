package seleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedUsingIf {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(3000);
		WebElement female = driver.findElement(By.xpath("//input[@value='1']"));
		boolean result = female.isSelected();
		if(result==true)
		{
			System.out.println("Redio button is already selected");
		}
		else
		{
			System.out.println("Radio button isn't selected");
			
		}
			female.click();
			Thread.sleep(500);
			boolean result1 = female.isSelected();
		
		
		if(result1==true)
		{
			System.out.println("Radio button is now selected");
		}
		
		else
		{
			System.out.println("Please select radio button");
		}
		
		driver.quit();
		

	}

}
