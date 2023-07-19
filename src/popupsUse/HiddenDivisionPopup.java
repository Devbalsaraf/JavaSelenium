package popupsUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopup {

	public static void main(String[] args) throws InterruptedException {
		// popups are small or separate window which will be displayed when we perform any action on componant present on the webpage
		// HDP--this popup is colorful and we can inspect the element present in the popup
		// as we can inspect the element present in this popup we can use selenium dirctly to handle this popup
		//No need to switch
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

	}

}
