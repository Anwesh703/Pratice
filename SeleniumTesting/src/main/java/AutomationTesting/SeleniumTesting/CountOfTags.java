package AutomationTesting.SeleniumTesting;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import util.ReadPropertyFile;

public class CountOfTags extends BaseClass {
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
	System.out.println(driver.findElements(By.tagName("a")).size());	
	WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
	System.out.println(footerdriver.findElements(By.tagName("a")).size());
	WebElement Columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	System.out.println(Columndriver.findElements(By.tagName("a")).size());
	for(int i=1;i<Columndriver.findElements(By.tagName("a")).size();i++) {
		String ClickonNewLinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
		Columndriver.findElements(By.tagName("a")).get(i).sendKeys(ClickonNewLinkTab);
		Thread.sleep(2000);
	}//open all the tabs
	Set<String> s = driver.getWindowHandles();
	Iterator<String> i = s.iterator();
	
	while(i.hasNext()) {
		driver.switchTo().window(i.next());
		System.out.println(driver.getTitle());
	}

	
	
}
}