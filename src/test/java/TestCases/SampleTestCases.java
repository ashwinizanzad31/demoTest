package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;

import Pages.AccountPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.ProductDetailsPage;
import Utils.BrowserLaunch;

public class SampleTestCases {

	WebDriver driver;
    LoginPage lp;
    HomePage hp;
    AccountPage ap;
    ProductDetailsPage pg;

  // @BeforeTest
   public void browserlaunch()
   {
	   			  System.out.println("Open Browser");
                  driver = BrowserLaunch.openBrowser("Chrome", "http://Automationpractice.com/");
                  System.out.println("wait");
                  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
                  System.out.println("Create objects");
                  lp = new LoginPage(driver);
                  hp = new HomePage(driver);
                  ap= new AccountPage(driver);
                  pg= new ProductDetailsPage(driver);
    }
   
  //@Test
  public void Login() throws InterruptedException
   {
	  Assert.assertEquals(hp.getHomePageTitle(), "My Store");
	  hp.clickOnLoginButton();
	  lp.loginToSite("jetblue@grr.la","jetblue");
	  lp.clickSubmit();
	  ap.clickOnCategoryButton("tshirt");
	  pg.selectProduct("Faded Short Sleeve T-shirts");
	  pg.addProductToCartButton();

	  Thread.sleep(1000);
	  
   }
  
  //@AfterTest
  public void closeBrowser()
  {
	   				driver.quit();
   }
  
  @Test
  public void test()
   {
	  System.out.println("Hello Ashwini");
	  
   }
  
}
