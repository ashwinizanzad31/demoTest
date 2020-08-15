package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
	WebDriver driver;

	@FindBy(xpath="(//a[@title='T-shirts'])[2]")
    WebElement tshirtButton; 
	

    public AccountPage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }   

        
        public void clickOnCategoryButton(String category){
        	if(category.equalsIgnoreCase("tshirt")) {
        	tshirtButton.click();
        	}

           }
}
