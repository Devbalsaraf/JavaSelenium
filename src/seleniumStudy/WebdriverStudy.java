package seleniumStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverStudy {

	public static void main(String[] args) throws InterruptedException {
		// Webdriver-->is an interface use to perform action of browser
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		// This method is use to open application or enter url in browser
		
		Thread.sleep(1000);
		
		
		driver.manage().window().maximize();
		// Maximized the browser
		
		//driver.close(); // use to close current tab of browser opened by selenium tool
		
		//driver.quit(); // use to close all current tabs of browser opened by selenium tool
		
		System.out.println(driver.getCurrentUrl()); // use to get url of webpage and return type is  string
		
		System.out.println(driver.getTitle());  // use to get title of webpage and return type is string
		
		//Navigate(): use to open an application, move forward and backward, refresh the page
		
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(500);
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		

	}

}
