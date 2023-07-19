package testNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel1 {
  @Test
  public void vctcPuneLaunch() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://vctcpune.com/");
	  Thread.sleep(3000);
	  driver.close();
  }
}
