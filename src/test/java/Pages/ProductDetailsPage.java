package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage {

	WebDriver driver;

	@FindBy(css="a[title='Faded Short Sleeve T-shirts']")
    WebElement tshirtButton; 
	@FindBy(id="add_to_cart")
    WebElement addToCartButton;
	

    public ProductDetailsPage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }   

        
        public void selectProduct(String product){
        	
        	Actions action = new Actions(driver);
        	if(product.equalsIgnoreCase("Faded Short Sleeve T-shirts")) {
        		action.moveToElement(tshirtButton).click().build().perform();	
        	}

           }
        
     public void addProductToCartButton(){
        	
    	 addToCartButton.click();

           }
}
