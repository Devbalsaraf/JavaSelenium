package scrollingStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingEg {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		Thread.sleep(1000);
		driver.findElement(By.className("react-responsive-modal-closeButton")).click();
		Thread.sleep(1000);
		
		JavascriptExecutor j = ((JavascriptExecutor)driver);
		j.executeScript("window.scrollBy(80,200)");
		Thread.sleep(2000);
		
		j.executeScript("window.scrollBy(80,2000)");
		Thread.sleep(1000);
		
		j.executeScript("window.scrollBy(80,-2000)");
		Thread.sleep(1000);
		
		WebElement test = driver.findElement(By.xpath("//h2[text()='Testimonials']"));
		j.executeScript("arguments[0].scrollIntoView(true)",test);
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
