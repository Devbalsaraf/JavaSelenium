package testNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel2 {
  @Test
  public void facebookLaunch() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  Thread.sleep(3000);
	  driver.close();
  }
}
