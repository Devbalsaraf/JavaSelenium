package popupsUse;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandleeg {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);		
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(1000);
		
		Set<String> AllWindowIds = driver.getWindowHandles();
		System.out.println(AllWindowIds);
		Thread.sleep(1000);
		
		Iterator<String> it = AllWindowIds.iterator();
		String mainpageid = it.next();
		String childpageid = it.next();
		
		driver.switchTo().window(childpageid);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("the7-search")).sendKeys("Popup");
		Thread.sleep(1000);
		
		driver.switchTo().window(mainpageid);
		Thread.sleep(500);
		driver.findElement(By.name("home")).click();
		
		driver.close();

	}

}
