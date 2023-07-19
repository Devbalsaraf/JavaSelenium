package ninjaPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(id="input-email") private WebElement email;
	@FindBy(id="input-password") private WebElement password;
	@FindBy(xpath="//input[@value='Login']") private WebElement login;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	public void enterEmailID(String emailID)
	{
		email.sendKeys(emailID);
	}
	
	public void enterPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	

	public void clickOnLoginButton()
	{
		login.click();
	}


}
