package dropDownStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelection {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(1000);
		WebElement mul = driver.findElement(By.id("multiselect1"));
		Thread.sleep(500);
		Select s=new Select(mul);
		System.out.println(s.isMultiple());
		s.selectByIndex(0);
		Thread.sleep(500);
		s.selectByValue("Hyundaix");
		Thread.sleep(500);
		s.selectByVisibleText("Audi");
		Thread.sleep(500);
		//System.out.println(s.getAllSelectedOptions());

		List<WebElement> all = s.getAllSelectedOptions();
		for(WebElement op:all)
		{
			System.out.println(op.getText());
		}
		Thread.sleep(2000);
		s.deselectAll();
	}

}
