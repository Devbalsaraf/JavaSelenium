package seleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementMethod {

	public static void main(String[] args) throws InterruptedException {
		// Webelement- It is object or component present in the webpage
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
//		driver.findElement(By.id("email")).sendKeys("balsarafdevnand@gmail.com");
//		Thread.sleep(500);
//		driver.findElement(By.id("email")).clear();
//		Thread.sleep(500);
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("balsarafdevnand@gmail.com");
		Thread.sleep(500);
		email.clear();
		Thread.sleep(500);
		
		System.out.println(driver.findElement(By.xpath("//button[@type='submit']")).getText());
		
		System.out.println(driver.findElement(By.name("pass")).isEnabled());
		
		//driver.findElement(By.linkText("Forgotten password?")).click();
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(5000);
		
//		System.out.println(driver.findElement(By.xpath("//input[@value='1']")).isSelected());
//		
//		driver.findElement(By.xpath("//input[@value='1']")).click();
//		System.out.println(driver.findElement(By.xpath("//input[@value='1']")).isSelected());
		
		WebElement Female = driver.findElement(By.xpath("//input[@value='1']"));
		boolean Result = Female.isSelected();
		System.out.println("Female radio button "+Result);
		
		Thread.sleep(500);
		Female.click();
		Thread.sleep(1000);
		boolean Result1 = Female.isSelected();
		System.out.println("Female radio button "+Result1);
		
		
		//driver.close();
		
		
		

	}

}
