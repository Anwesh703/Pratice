package AutomationTesting.SeleniumTesting;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import util.ReadPropertyFile;

public class WindowsHandleConcept extends BaseClass {
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
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		driver.navigate().to("https://www.flipkart.com/");
	driver.findElement(By.className("_2doB4z")).click();
	driver.switchTo().window(tabs.get(0));
	Actions a = new Actions(driver);
	WebElement slider = driver.findElement(By.id("mySlider"));
	a.dragAndDropBy(slider, -15, 100).build().perform();
	
	System.out.println(driver.findElement(By.id("placeholderText")).getAttribute("placeholder"));
	
	 
	 
	}
	@AfterClass
	public void quitBrowser() {
		driver.quit();
	}
}
