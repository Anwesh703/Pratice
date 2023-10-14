package AutomationTesting.SeleniumTesting;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJet {
	static WebDriver  driver;
	
public static WebDriver browser() {
	WebDriverManager.chromedriver().setup();
	ChromeOptions co = new ChromeOptions();
	co.addArguments("start-maximized");
	co.addArguments("--disable-notifications");
	//co.addArguments("--incognito");
	//co.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
	 co.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
	 driver = new ChromeDriver(co);
	return driver;
	}

	public static void main(String [] args) throws InterruptedException {
		
		//driver.get("https://www.spicejet.com/");
		browser().get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
	//	http://demo.guru99.com/test/delete_customer.php
//		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-zso239'])[2]")).click();
//		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'] //input[@autocapitalize='sentences' and @autocorrect='on']")).sendKeys("Hy");
//		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'] //input[@autocapitalize='sentences' and @autocorrect='on'])[2]")).sendKeys("Beng");
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		  LocalDate localDate = LocalDate.now();
		//Selecting the date 
		
	//	driver.findElement(By.xpath("//div[@data-testid='departure-date-dropdown-label-test-id']")).sendKeys(dtf.format(localDate));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath("//p[@data-cy='departureDate']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
//		
	
		//driver.findElement(By.xpath("")).click();
		Thread.sleep(2000);

//		Date d = new Date(5);
//		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
//		String date = formatter.format(d);
//		String splitter[] = date.split("-");
//		String month_year = splitter[1];
//		String day = splitter[0]; 
//		System.out.println(month_year);
//		System.out.println(day);
//

		selectDate("March","20"); 
		Thread.sleep(3000);

	}
		public static void selectDate(String month_year, String select_day) throws InterruptedException
		{ 
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='DayPicker-Caption']"));
		
		for (int i=0; i<elements.size();i++)
		{
		System.out.println(elements.get(i).getText());
		//Selecting the month
		if(elements.get(i).getText().contains(month_year))
		{
			//Selecting the date
			List<WebElement> days = driver.findElements(By.xpath("//div[contains(text(),'"+month_year+"')]/following::div//p[1]"));

			for (WebElement d:days)
			{ 
			System.out.println(d.getText());
			if(d.getText().contains(select_day))
			{
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click();", d);
				
			//d.click();
			Thread.sleep(10000);
			return;
			}
			} 

			} 

			}
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//div[@class='DayPicker-NavBar']/span[2]")));
			selectDate(month_year,select_day);
//
			}//circle[@fill-rule='evenodd']
	//(//div[@class='css-1dbjc4n r-zso239'])[2]
}


