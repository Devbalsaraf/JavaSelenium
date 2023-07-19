package tableReading;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableRead1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(1000);
		
		for(int i=1;i<=5;i++)
		{
			WebElement data = driver.findElement(By.xpath("//table[@class='dataTable']//tr[1]/th[i]"));
			System.out.print(data.getText());
		}
		System.out.println();
		
		for(int i=1;i<=26;i++)
		{
			for(int j=1;j<=5;j++)
			{
				 WebElement data = driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]/td["+j+"]"));
				 System.out.print(data.getText()+" ");
			}
			System.out.println();
		}
		
		
		
		



	}

}
