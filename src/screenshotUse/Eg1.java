package screenshotUse;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Eg1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// To handle screenshot--> First type caste driver object into TakesScreenshot interface
		// syntax--driver(TakesScreenshot)
		// we need to call method getScreenshotAs(OUTPUTYPE.FILE)
		//   File src=driver(TakesScreenshot).getScreenshotAs(OUTPUTYPE.FILE); // store screenshot in temp memory
		// to store screenshot at desired location we can use FileHandler.copy(src, dest);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(1000);
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		 System.out.println(src);
		 
		 // to avoid overwriting of files we use randomstring.make();
		 String str = RandomString.make(3);
		 
		 File dest = new File("D:\\Software Testing course\\ScreenShot\\qafox"+str+".png");
		 
		 FileHandler.copy(src, dest);
		 
		 
		

	}

}
