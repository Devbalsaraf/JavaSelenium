package ninjaTestBaseUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility1 {
	
	//capture screenshot
	
	public static void captureScreenShot(WebDriver driver,int TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\Software Testing course\\ScreenShot\\Testcase"+TCID+".png");
		FileHandler.copy(src, dest);
	}
	
	// Read data from properties files

	public static String getDataFromPropertiesFiles(String key) throws IOException {
		Properties obj=new Properties();
		//File myFile=new File("/JavaPractice/TutorialNinjaCredential.properties");
		FileInputStream myfile=new FileInputStream("C:\\Users\\Deva\\eclipse-workspace\\JavaPractice\\TutorialNinjaCredential.properties");
		obj.load(myfile);
		String value = obj.getProperty(key);
		return value;
	}
	

}
