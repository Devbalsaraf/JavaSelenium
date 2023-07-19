package miscelenious;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CountLink {

	public static void main(String[] args) {
		// Total no of links presents on webpage
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("start-maximized");
		
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		List<WebElement> aTag = driver.findElements(By.tagName("a"));
		System.out.println("Total no of links are "+aTag.size());
		
		Iterator<WebElement> it = aTag.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().getText());
		}

	}

}
