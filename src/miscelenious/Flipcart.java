package miscelenious;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("oneplus mobile");
		Thread.sleep(1000);
		driver.findElement(By.className("L0Z3Pu")).click();
		
		Thread.sleep(500);
		WebElement rating = driver.findElement(By.xpath("((//div[@class='col col-7-12'])[1]//span)[4]"));
		System.out.println("Rating of product"+rating.getText());

	}

}
