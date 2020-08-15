package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	static WebDriver driver;

	public static WebDriver openBrowser(String browser, String baseUrl) {

			System.out.println("Inside loop");
			System.setProperty("webdriver.chrome.driver", "/Users/Ashwini/Downloads/chromedriver");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(baseUrl);
			return driver;
	}

}
