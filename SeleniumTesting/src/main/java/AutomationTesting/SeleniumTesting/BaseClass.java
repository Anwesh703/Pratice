package AutomationTesting.SeleniumTesting;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.ReadPropertyFile;

public class BaseClass  {
	public BaseClass() {
		
	}
	public WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}
//	public void setDriver(WebDriver driver) {
//		 this.driver = driver;
//	}
	
	
 public WebDriver InitailizeBrowser() throws IOException {
//	 ReadPropertyFile rp= new ReadPropertyFile();
//		String browser=rp.getDataFromProperty("Browser");
	 System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
 	ChromeOptions options= new ChromeOptions();    	
 	
 	options.setAcceptInsecureCerts(true);
 	options.addArguments("start-maximized"); // open Browser in maximized mode
 	//options.addArguments("--start-fullscreen");
 	//options.addArguments("--incognito");
 	options.addArguments("disable-infobars"); // disabling infobars
 	options.addArguments("--disable-extensions"); // disabling extensions
 	options.addArguments("--disable-gpu"); // applicable to windows os only
 	options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
 	options.addArguments("--no-sandbox"); // Bypass OS security model 
 	options.addArguments("--remote-allow-origins=*");
 	WebDriverManager.chromedriver().setup();
 	WebDriver driver= new ChromeDriver(options);
 	driver.manage().deleteAllCookies();
 	
 	return driver;
//       if(browser.equalsIgnoreCase("Chrome")) {
//			
//		//System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("start-maximized");
//		co.addArguments("--incognito");
//		WebDriverManager.chromedriver().setup();
//		
//    	 driver= new ChromeDriver(co);
//    	 driver.manage().deleteAllCookies();
//    	}
//		if(browser.equalsIgnoreCase("Edge")) {
//		System.setProperty("webdriver.edge.driver", "C:\\SeleniumDrivers\\msedgedriver.exe");
//		
//		 driver = new EdgeDriver();
//		}
//		return driver;
//	
 }
 
 public String takesScreenshot(String ScreenshotName,WebDriver driver) throws IOException {
	 
 File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 String path = "C:\\Users\\anwreddy\\ScreenshotsSelenium\\"+ScreenshotName+".png";
	FileUtils.copyFile(ss, new File(path));
	return path;
}
 
 public String takesWebElementScreenshot(WebElement element,String ScreenshotName) throws IOException {
	 
 File ss = element.getScreenshotAs(OutputType.FILE);
 String path = "C:\\Users\\anwreddy\\ScreenshotsSelenium\\"+ScreenshotName+".png";
	FileUtils.copyFile(ss, new File(path));
	return path;
}
 
}
