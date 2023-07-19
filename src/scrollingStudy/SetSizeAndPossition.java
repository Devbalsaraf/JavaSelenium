package scrollingStudy;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeAndPossition {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/");
		Thread.sleep(1000);
		System.out.println(driver.manage().window().getSize());
		Dimension d=new Dimension(700,1000);
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		System.out.println(driver.manage().window().getPosition());
		Point p=new Point(100,100);
		driver.manage().window().setPosition(p);
		System.out.println(driver.manage().window().getPosition());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
