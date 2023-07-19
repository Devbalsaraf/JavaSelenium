package tutorialNinjaPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NinjaHomePage {
	
	@FindBy(xpath="//span[text()='My Account']") private WebElement myaccount;
	@FindBy(linkText="Login") private WebElement loginOption;
	
	
	public NinjaHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnLoginOption()
	{
		myaccount.click();
		loginOption.click();
	}

}
