package AutomationTestingTraining.ProgramsAndCollections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowRootExample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anwreddy\\Desktop\\TrainingSelenium\\ChromeDriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("disable-extensions");
		co.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(co);
		//driver.get("https://www.google.com/intl/en-US/gmail/about/");
		driver.findElement(By.tagName("ntp-app")).getShadowRoot()
		.findElement(By.cssSelector("#realbox")).getShadowRoot()
		.findElement(By.xpath("//input[@type='search']")).sendKeys("hello");
	Thread.sleep(10000);
//	driver.findElement(By.xpath("//ntp-app[@realbox-width-behavior_='wide']")).getShadowRoot()
//	.findElement(By.cssSelector("#realbox")).getShadowRoot().findElement(By.xpath(""));
	}
}
