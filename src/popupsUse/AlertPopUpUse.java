package popupsUse;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpUse {

	public static void main(String[] args) throws InterruptedException {
		// Alert Popup-->This pop up does not have color
		// THis popup will contain text,cancel and ok button
		// UnhandledAlertExeption-->without handling popup, if we tried to take next action
		// we can not inspect the element present in this popup
		// we need to switch selenium focus to the alert popup
		// we can switch focus by using syntax-->driver.switchto().alert();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(2000);
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(1000);
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//button[text()='Click me'])[2]")).click();
		Thread.sleep(6000);
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		Thread.sleep(1000);
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(1000);
		Alert alt2 = driver.switchTo().alert();
		Thread.sleep(1000);
		System.out.println(alt2.getText());
		Thread.sleep(1000);
		alt2.dismiss();
		
		

	}

}
