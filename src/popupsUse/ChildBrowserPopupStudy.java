package popupsUse;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopupStudy {

	public static void main(String[] args) throws InterruptedException {
		// window popup-->we can inspect the element present in this popup
		// It contains url field, maximized, minimized, close options
		//To handle selenium focus--> we need to switch selenium focus from main page to window popup
		// syntax-> driver.switchto().window(String window ID);
		// To get address of main page--> string IDOfMainPage=driver.getWindowHandle();
		// To get address of main and child browser we can use getwindowHandles()-->set<String>
		// NoSuchwindowExeption--> without switching to window if we ried to take action
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		Thread.sleep(1000);
		Set<String> windowIds = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<String>(windowIds);
		System.out.println(al.get(0));
		System.out.println(al.get(1));
	    String mainpageId = al.get(0);
	    String childpageId=al.get(1);
	    Thread.sleep(1000);
	    driver.switchTo().window(childpageId);
	    Thread.sleep(500);
		driver.findElement(By.xpath("//span[text()='Selenium']")).click();
		
		

	}

}
