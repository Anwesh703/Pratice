package AutomationTesting.SeleniumTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class Testing {
	
	public static void main(String [] args) {
		//Invoking the browser
		// chrome - chromedriver
		// Edge - edgedriver
		//ChromeDriver driver1 = new ChromeDriver();
		
		// driver object has access to all methods of chrome driver
		//WebDriver driver1 = new EdgeDriver();
		//driver
		
//driver object here has access to the methids of chrome driver which are defined in web driver interface
//WebDriver is an interface which has all the method name declared but not declarations/implementation of it.
		
//by default chromedriver don't have access to invoke chrome browser. for that we need to download chromedriver.exe
		WebDriver driver = null ;
		String browser = "chrome";
		
		if(browser.equalsIgnoreCase("Chrome")) {
			
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("start-maximized");
		co.addArguments("--incognito");
		 driver = new ChromeDriver(co);
		}
		if(browser.equalsIgnoreCase("Edge")) {
		System.setProperty("webdriver.edge.driver", "C:\\SeleniumDrivers\\msedgedriver.exe");
		
		 driver = new EdgeDriver();
		}
		driver.get("https://www.google.com/");
		
		driver.quit();
		
		
	}
	
	
}
