package AutomationTesting.SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
	public static void main(String [] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeOptions co = new ChromeOptions();
	co.addArguments("start-maximized");
	co.addArguments("--incognito");
	//co.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
	 co.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
	WebDriver driver = new ChromeDriver(co);
	
//	driver.get("http://omayo.blogspot.com/");
//	driver.findElement(By.id("radio1")).click();
//
//	driver.findElement(By.name("q")).sendKeys("Hello");
//	driver.findElement(By.className("classone")).sendKeys("naveen");
//	driver.findElement(By.tagName("input")).sendKeys("hi");
//	
//	driver.findElement(By.xpath("(//*[contains(text(),'User')]/input)[2]")).sendKeys("password");		
//	
//	driver.findElement(By.xpath("//textarea[@cols='80']")).sendKeys("hello nice to meet you");
//	
	driver.get("https://seleniumbase.io/demo_page");
//	driver.findElement(By.id("myTextInput")).sendKeys("naveen");
//	driver.findElement(By.className("radioClass1")).click();
	driver.findElement(By.cssSelector("#myTextInput")).sendKeys("naveen");
	driver.findElement(By.cssSelector("#myTextInput")).clear();
	driver.findElement(By.cssSelector(".radioClass1")).click();
	driver.findElement(By.tagName("textarea")).sendKeys("hello world");
	driver.findElement(By.name("preText2")).clear();
	driver.findElement(By.name("preText2")).sendKeys("blue");
	//driver.findElement(By.xpath("//button[@onclick='buttonFunction1()']")).click();
	//CSS selector
//	className -> tagname.classname   .classname
//	Id -> tagename#id                 #id
//	tagname[attribute='value'] = 
	driver.findElement(By.cssSelector("button[onclick='buttonFunction1()']")).click();
	
	
}
}
