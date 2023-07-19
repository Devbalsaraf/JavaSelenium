package tutorialNinjaPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NinjaValidatePage {
	@FindBy(linkText="Logout") private WebElement logoutbutton;
	
	public NinjaValidatePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//	public void validateUser()
//	{
//		String actualResult = logoutbutton.getText();
//		String expectedResult = "Logout";
//		if(expectedResult.equals(actualResult))
//		{
//			System.out.println("Test case pass, User is validate");
//		}
//		else
//		{
//			System.out.println("Test case failed, user is not validate");
//		}
	
	public String validateUser()
	{
		String actualResult = logoutbutton.getText();
		return actualResult;
		
	}
	

}
