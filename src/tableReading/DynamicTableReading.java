package tableReading;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableReading {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(2000);
		
		//Total row count
		int rowCount = driver.findElements(By.xpath("//table[@class='dataTable']//tr[1]/th")).size();
		int columCount=driver.findElements(By.xpath("//table[@class='dataTable']//tr")).size();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		for(int i=1;i<=rowCount-1;i++)
		{
			for(int j=1;j<=columCount;j++)
			{
			if(i==1)
			{
				WebElement thData = driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]/th["+j+"]"));
				System.out.print(thData.getText()+"  ");
			}
			
			else
			{
				WebElement tdData = driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]/td["+j+"]"));
				System.out.print(tdData.getText());
			}
		}
			System.out.println();
		
		

	}

}
}
