package waitInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StaticAndDynamicWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/");
		Thread.sleep(1000);       // Static wait=wait time is fixed, irrespective of time. script will be hold for mensioned time
//		WebElement test = driver.findElement(By.xpath("//h2[text()='Testimonials']"));
//		// Dynamic wait--> Implicit and Explicit wait
//		// Imp. wait--> applicable for complete webpage.it will hold the script untill webpage is loaded. Onnce the page is loaded fully it will release time
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100)); // Once the page is loaded it timeouts before the mensioned time
//		
		//Explicit wait--> it is applicable for element
		// It will hold script till the element is loaded then release wait
		driver.findElement(By.className("react-responsive-modal-closeButton")).click();
		
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(100));
		WebElement course = driver.findElement(By.xpath("(//a[text()='View Courses'])[2]"));
		w.until(ExpectedConditions.visibilityOf(course));
		course.click();
	
	}

}
