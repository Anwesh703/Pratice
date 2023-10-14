package AutomationTesting.SeleniumTesting;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import POM.FacebookLogin;

public class B extends BaseClass {
	WebDriver driver = null;
@Test
public void method() throws IOException {
	driver = InitailizeBrowser();
	FacebookLogin f = new FacebookLogin(driver);
	driver.get("https://seleniumbase.io/#");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement youtubeLink=driver.findElement(By.xpath("//a[contains(text(),'YouTube Link')]"));
	WebElement Test=driver.findElement(By.xpath("//*[contains(text(),'Generating Test Reports')]"));
	WebElement search= driver.findElement(By.className("md-search__input"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true);", youtubeLink);
	js.executeScript("arguments[0].scrollIntoView(true);", Test);
	js.executeScript("arguments[0].click();", youtubeLink);
	WebElement YoutubeSearch=driver.findElement(By.cssSelector("input#search.ytd-searchbox"));
	String text = "python";
	//YoutubeSearch.sendKeys("python");
	js.executeScript("arguments[0].setAttribute('value','" + text + "');", YoutubeSearch);
	
}
}
