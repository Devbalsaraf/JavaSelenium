package ninjaPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage 
{
@FindBy(linkText="Logout") private WebElement logoutbutton;
	
	public AccountPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	
	public String validateUser()
	{
		String actualResult = logoutbutton.getText();
		return actualResult;
		
	}
	
	public void clickOnLogout()
	{
		logoutbutton.click();
	}
	


}
