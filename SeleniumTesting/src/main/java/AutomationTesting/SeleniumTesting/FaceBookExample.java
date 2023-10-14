package AutomationTesting.SeleniumTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookExample {
	@Test
	public  void FaceBookExample() throws InterruptedException  {
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("start-maximized");
//		//co.addArguments("--incognito");
//		//co.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
//		 co.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
//		WebDriver driver = new ChromeDriver(co);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	//https://www.facebook.com/r.php?locale=en_GB&display=page
		//https://www.facebook.com/login.php
	//Facebook helps you connect and share with the people in your life.
	//Thread.sleep(10000);
	//String str = driver.findElement(By.className("_8eso")).getText();
//	System.out.println(str);
//	System.out.println(str.equals("Facebook helps you connect and share with the people in your life."));
	Assert.assertEquals(driver.findElement(By.className("_8eso")).getText(), "Facebook helps you connect and share with the people in your life.");
	Assert.assertNotEquals(driver.findElement(By.className("_8eso")).getText(), "facebook helps you connect and share with the people in your life.");
	driver.findElement(By.id("email")).sendKeys("anwesh@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("anweshreddy");
	//driver.findElement(By.name("login")).click();
	//sibilng child to parent transverse
	//div[@id='birthday_wrapper']/div[2]/span/span/select/following-sibling::select/../../../..
	
			driver.findElement(By.xpath("(//*[contains(text(),'Facebook')])[3]")).click();
			
			String placeholder = "Surname";
			String placeholder1 = "First name";
			
			driver.findElement(By.xpath("//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']/input[@aria-label='"+placeholder1+"']")).sendKeys("hello");
			driver.findElement(By.xpath("//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']/input[@aria-label='"+placeholder+"']")).sendKeys("world");
			
			
			//driver.findElement(By.linkText("Forgotten password?")).click();
	
	
	
	System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Wrong')]")).getText());
	
	
}
}
