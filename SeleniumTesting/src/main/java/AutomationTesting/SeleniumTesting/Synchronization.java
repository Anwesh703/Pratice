package AutomationTesting.SeleniumTesting;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import POM.FacebookLogin;
import POM.FindYourAccount;
import util.ReadPropertyFile;
import java.util.function.*;

public class Synchronization extends BaseClass{
//Implicit Wait : Hey wait for "5" number of seconds before throwing exception.
// It is defined globally(each element will have some wait time before throwing exception)
	WebDriver driver;
	String url;
	@Test
	public void Run() throws IOException {
	driver = InitailizeBrowser();
	ReadPropertyFile rp= new ReadPropertyFile();
	 url=rp.getDataFromProperty("URL");
	 driver.get(url);
	// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 //advantage : code looks readable because we mention it only once.
	 //Disadvantage : It hides the performance issue.
//		FacebookLogin fb = new FacebookLogin(driver);
//		fb.PerformFacebookLogin("anwesh.reddy12@gmail.com", "Anwesh121@");
//		fb.LNK_ForgottenPassword.click();
//		FindYourAccount f = new FindYourAccount(driver);
	 
//	/*	Explicit Wait : It is applicable to only 1 element .
//		WebDriver Wait
//		Fulent Wait
//		*/
//		f.performFindYourAccount("anwesh.reddy81@gmail.com");
//		System.out.println(f.TXT_PleaseEnter.getText());
	 WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
	 //JavascriptExecutor js =  (JavascriptExecutor) driver;
	 w.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='start']/button")));
	driver.findElement(By.xpath("//div[@id='start']/button")).click();
//	w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']/h4")));
//	System.out.println(driver.findElement(By.xpath("//div[@id='finish']/h4")).getText());
//	
	//System.out.println(driver.findElement(By.xpath("//div[@id='finish']/h4")).getText().contains("Hello World!"));
	/*Fluent Wait: In fluent you can provide polling time
	Fluent wait finds the webelement repeatedly at regular intervals of time until the timeout or till the object gets found.
	Unlike Webdriver wait, we need to build customized wait methods based on condition.
	Both webdriverWait & Fluent Wait classes implement wait interface.
	*/
	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
			.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
	WebElement f = wait.until(new Function<WebDriver,WebElement>(){
		public WebElement apply(WebDriver driver) {
			return driver.findElement(By.xpath("//div[@id='finish']/h4"));
		} 
	});
	System.out.println(f.getText());
	
	
//Explicit Wait :
//Thread.sleep(1000)
	}
	
}
