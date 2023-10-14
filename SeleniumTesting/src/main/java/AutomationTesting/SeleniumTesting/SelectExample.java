package AutomationTesting.SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectExample {
	public static void main(String [] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("start-maximized");
		//co.addArguments("--incognito");
		//co.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
		 co.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
		WebDriver driver = new ChromeDriver(co);
		
//		driver.get("https://seleniumbase.io/demo_page");
//		WebElement staticDropdown = driver.findElement(By.id("mySelect"));
//		Select dropdown = new Select(staticDropdown);
//		dropdown.selectByIndex(2);
//		dropdown.selectByVisibleText("Set to 50%");
//		dropdown.selectByVisibleText("Set to 75%");
//		dropdown.selectByValue("25%");
//	
//		System.out.println(dropdown.getFirstSelectedOption().getText());
//		
//		for(int i =0;i<dropdown.getOptions().size();i++) {
//		System.out.println(dropdown.getOptions().get(i).getText().contains("Set to 25"));
//		}
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		WebElement dayDropdown = driver.findElement(By.id("day"));
		WebElement monthDropdown = driver.findElement(By.id("month"));
		WebElement yearDropdown = driver.findElement(By.id("year"));
		Select daydropdown = new Select(dayDropdown);
		Select monthdropdown = new Select(monthDropdown);
		Select yeardropdown = new Select(yearDropdown);
		daydropdown.selectByVisibleText("17");
		monthdropdown.selectByVisibleText("Feb");
		yeardropdown.selectByVisibleText("1998");
		String str = "Benagaluru";
		driver.findElement(By.id("day")).sendKeys(args);
		driver.findElement(By.id("text()='"+str+"'")).click();
		
	}
}
