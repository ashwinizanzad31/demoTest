package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	@FindBy(partialLinkText="automationpractice")
    WebElement homepageLogo; 
	@FindBy(css="a.login")
    WebElement loginButton;

    public HomePage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }   


        public String getHomePageTitle(){
         return    driver.getTitle();

        }
        
        public void clickOnLoginButton(){
            loginButton.click();

           }
}
