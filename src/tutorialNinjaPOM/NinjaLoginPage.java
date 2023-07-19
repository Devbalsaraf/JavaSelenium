package tutorialNinjaPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NinjaLoginPage {
	@FindBy(id="input-email") private WebElement email;
	@FindBy(id="input-password") private WebElement password;
	@FindBy(xpath="//input[@value='Login']") private WebElement login;
	
	public NinjaLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
//	public void enterEmailID()
//	{
//		email.sendKeys("balsarafdev@gmail.com");
//	}
	
	public void enterEmailID(String emailID)
	{
		email.sendKeys(emailID);
	}
	
	public void enterPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
//	public void enterPassword()
//	{
//		password.sendKeys("@Brand123");
//	}
//	
	public void clickOnLoginButton()
	{
		login.click();
	}

}
