package AutomationTestingTraining.ProgramsAndCollections;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.xml.sax.Locator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitExample {
public static void main(String [] args) {
	WebDriver driver = null;
	WebElement element = null;
	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
			.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
	wait.until(new Function<WebDriver,WebElement>() {
		public WebElement apply(WebDriver driver) {
			if(element.isDisplayed()) {
			return element;}
			else {
				return null;
			}
		}
	});
	WebDriverWait wait2= new WebDriverWait(driver,Duration.ofSeconds(5));
	wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
	wait2.until(ExpectedConditions.alertIsPresent());
	driver.switchTo().alert().getText();
	driver.switchTo().alert().accept();
	driver.switchTo().alert().dismiss();
	Actions a = new Actions(driver);
	a.moveToElement(element).perform();
	a.click();
	a.scrollToElement(element).perform();
	a.doubleClick();
	a.contextClick();
	a.keyDown(Keys.SHIFT);
	String Click = Keys.chord(Keys.CONTROL,Keys.ENTER);
	
	a.sendKeys(args);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].setAttribute('value','namasthe Anna');",element);
	js.executeScript("arguments[0].click();",element);
	js.executeScript("arguments[0].scrollIntoView(true);",element);
	js.executeScript("window.open()"); //to open new window
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.switchTo().frame("name/id");
	driver.switchTo().frame(0);
	driver.switchTo().frame(element);
	driver.switchTo().defaultContent();
}
}
