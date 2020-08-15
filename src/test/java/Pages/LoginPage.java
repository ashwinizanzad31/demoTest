package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(id="email")
	WebElement userId; 
	
	@FindBy(id="passwd")
	WebElement password; 
	
	@FindBy(id="SubmitLogin")
    WebElement submitbutton; 

	public LoginPage(WebDriver driver)
	{
		  this.driver = driver;
	        PageFactory.initElements(driver, this);
	}
	public void loginToSite(String Username, String Password)
	{
		userId.sendKeys(Username);
		password.sendKeys(Password);
	}


	public void clickSubmit()
	{
		submitbutton.click();
	}

}
