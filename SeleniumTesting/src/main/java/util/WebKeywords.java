package util;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.log4testng.Logger;

import AutomationTesting.SeleniumTesting.BaseClass;


public class WebKeywords {
	
	
	static int count = 0;
	public void sendKeys(WebDriver driver,WebElement element,String data) {
		
		try {
			//fluentWait(driver,element,20,5);
		element.sendKeys(data);
		}catch(Exception e) {
			count++;
			if(count<3) {
				if(count == 2) {
					driver.navigate().refresh();
				}
				
			sendKeys(driver,element,data);}
			else {
				throw e;
			}
		}
	}
	public void WebDriverWait(WebDriver driver,WebElement element,String elementto, int MaxTime) {
	 WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(MaxTime));
	 //JavascriptExecutor js =  (JavascriptExecutor) driver;
	 if(elementto.equals("elementToBeClickable")) {
	 w.until(ExpectedConditions.elementToBeClickable(element));
	 }else if(elementto.equals("visibilityOfElementLocated")) {
		// w.until(ExpectedConditions.visibilityOfElementLocated(element)); 
	 }
	}
	public void fluentWait(WebDriver driver,WebElement element,int maxTime,int polling) {
		
	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(maxTime))
			.pollingEvery(Duration.ofSeconds(polling)).ignoring(NoSuchElementException.class);
	WebElement f = wait.until(new Function<WebDriver,WebElement>(){
		public WebElement apply(WebDriver driver) {
			if(element.isDisplayed()) {
			return element;}else {return null;}
		} 
	});}
	public void click(WebDriver driver,WebElement element) {
		try {
		element.click();}
catch(Exception e) {
			
		}
		
	}
	
	
}
