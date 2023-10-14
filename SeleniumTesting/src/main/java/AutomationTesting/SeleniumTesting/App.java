package AutomationTesting.SeleniumTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class App {
	@Test
  public void method1(int a) {
//	System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
    WebDriver driver;// = new ChromeDriver();
//    WebDriverManager.chromedriver().setup();
//    ChromeOptions co= new ChromeOptions();  
//    co.setAcceptInsecureCerts(true);
//    co.addArguments("start-maximized"); // open Browser in maximized mode
//    //co.addArguments("--start-fullscreen");
//	//options.addArguments("--incognito");
//    co.addArguments("disable-infobars"); // disabling infobars
//    co.addArguments("--disable-extensions"); // disabling extensions
//    co.addArguments("--disable-gpu"); // applicable to windows os only
//    co.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
//    co.addArguments("--no-sandbox"); // Bypass OS security model 
//    co.addArguments("--disable-notifications");
//	 co.setAcceptInsecureCerts(true);
   
    int arr[] = {212,312,312};
    try {
    	System.out.println(arr[a]);
    }
    catch (Exception e) {
    	method1(3);
	}
//    WebDriverManager.edgedriver().setup();
//	 EdgeOptions eo = new EdgeOptions();
//	 //eo.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
//	 eo.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
//	 driver = new EdgeDriver(eo);
//	// driver = new ChromeDriver(co);
//    driver.get("https://www.google.com/");
    
  }
}
