package iframeUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe1 {

	public static void main(String[] args) throws InterruptedException {
		// Iframe-->Displaying a webpage as a part of another webpage
		// To handle iframe--> First we need to switch to iframe from main page
		// driver.switchTo().Frame(String ID or name)
		// we can switch to frame by 3 ways-->ID or name, Index, webelement
		// once we switch to iframe and perform some actions on frame, selenium will not switch to main page by default
		// to switch to main page we can use 
		// driver.switchto().defaultcontent()-->To switch main page
		// driver.switchto().parentframe()-->to switch parent frame
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(2000);
		
		driver.switchTo().frame("iframeResult");
		WebElement button = driver.findElement(By.xpath("//button[@type='button']"));
		button.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
		
		
		
		
		
		

	}

}
