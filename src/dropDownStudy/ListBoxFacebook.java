package dropDownStudy;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxFacebook {

	public static void main(String[] args) throws InterruptedException {
		// To handle drop down first we need to identify drop down that need to be handled.
		// synatax-  webElement Element=driver.findElement(By.locators type)
        // Create object of select class which accept webelement as an argument
		// Select s=new Select(webelement);
		//Using one of select class method we can select option from listbox
		// s.selectByVisibleText(), s.selectByIndex(), s.SelectByValue()
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.id("day"));
		Select s=new Select(day);
		s.selectByVisibleText("12");
		
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.id("month"));
		Select s1=new Select(month);
		s1.selectByValue("8");
		Thread.sleep(1000);
		
		
		WebElement year = driver.findElement(By.id("year"));
		Select s2=new Select(year);
		s2.selectByVisibleText("1992");
		
	    Thread.sleep(500);
	    s2.selectByVisibleText("1990");
	    Thread.sleep(500);
	    System.out.println(s2.getFirstSelectedOption().getText());
	    System.out.println(s2.isMultiple());
	    
		
		List<WebElement> dayoptions = s.getOptions();
		System.out.println(dayoptions.size());
		Thread.sleep(500);
		TreeSet<String> ts = new TreeSet<String>();
		List<WebElement> availableMonths = s1.getOptions();
		Thread.sleep(1000);
		for(WebElement m:availableMonths)
		{
			String text = m.getText();
			ts.add(text);
		}
		System.out.println(ts);
		Thread.sleep(1000);
		
		driver.close();
		
		
		
	}

}
