package AutomationTesting.SeleniumTesting;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import util.ReadPropertyFile;

public class Frames extends BaseClass {
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
		
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("drop1"))).dragAndDrop(driver.findElement(By.id("logo")), driver.findElement(By.id("drop2"))).build().perform();
		//a.dragAndDropBy(driver.findElement(By.id("logo")),100,100);
//		
//		System.out.println(driver.findElement(By.tagName("h2")).getText());
//		String tag = driver.findElement(By.tagName("h2")).getText().split("helps")[1].split("the")[1].trim().split(" ")[0];
//		System.out.println(tag);
		
		
//		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='myFrame3']")));
//		driver.findElement(By.id("checkBox6")).click();
//		driver.switchTo().defaultContent();
//		driver.switchTo().frame(1);
//		System.out.println(driver.findElement(By.tagName("h4")).getText());
//		driver.switchTo().defaultContent();
//		driver.findElement(By.id("radioButton2")).click();
//		
		
	}
}
