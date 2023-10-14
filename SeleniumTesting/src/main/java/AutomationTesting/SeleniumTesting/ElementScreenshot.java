package AutomationTesting.SeleniumTesting;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import util.ReadPropertyFile;

public class ElementScreenshot extends BaseClass{
	WebDriver driver;
	String url;
	@BeforeClass
	public void intailization() throws IOException, InterruptedException {
		driver = InitailizeBrowser();
		ReadPropertyFile rp= new ReadPropertyFile();
		 url=rp.getDataFromProperty("URL");
		 driver.get(url);
	}
	@Test
	public void Run() throws IOException, InterruptedException {
		takesWebElementScreenshot(driver.findElement(By.xpath("//button[text()='Home']")),"HomeElement");
		
		
}
}
