package AutomationTesting.SeleniumTesting;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import util.ReadPropertyFile;

public class ActionsExample extends BaseClass {

//Actions:
//	How to mouseOver on object with selenium?
//	performing mouse & keyboard interactions with selenium
// Context[right] click on element
//Double click on element.
	//drag and dropping the element.
	WebDriver driver;
	String url;
	@Test(groups= {"Smoke"})
	public void Run() throws IOException, InterruptedException {
	driver = InitailizeBrowser();
	ReadPropertyFile rp= new ReadPropertyFile();
	 url=rp.getDataFromProperty("URL");
	 driver.get(url);
	Actions a = new Actions(driver);
	WebElement slider = driver.findElement(By.id("mySlider"));
	a.dragAndDropBy(slider, -15, 100).build().perform();
	System.out.println(driver.findElement(By.id("placeholderText")).getAttribute("placeholder"));
	
//	WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
//	String hyperLinkname = "Account";
//	WebElement GenericYourAccount=driver.findElement(By.xpath("//a[@class='nav-link nav-item']/span[contains(text(),'"+hyperLinkname+"')]"));
//	a.moveToElement(driver.findElement(By.xpath("//h2[contains(text(),'Electronics')]"))).build().perform();
//	Thread.sleep(1000);
//	//a.moveToElement(searchBox).click().sendKeys("iphone 14 pro").keyDown(Keys.ENTER).build().perform();
//	//a.contextClick(searchBox).build().perform();
//	a.click(searchBox).sendKeys("iphone 14 pro").keyDown(Keys.ENTER).build().perform();
	
	//a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
//a.moveToElement(GenericYourAccount).click().build().perform();
}
}
