package AutomationTesting.SeleniumTesting;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

import org.apache.commons.collections4.Put;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import util.ReadPropertyFile;

public class DTE extends BaseClass{
	WebDriver driver;
	String url;        	
		
	@BeforeClass
	public void intailization() throws IOException, InterruptedException {
		driver = InitailizeBrowser();	
		
	}
	
	@Test
	public void Run() throws IOException, InterruptedException {
		Map<Integer, String> map2 =  new HashMap<Integer,String>(){{put(2,"anwesh");put(4,"hello");}};
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://saucelabs.com/resources/blog/selenium-4-new-windows-and-tab-utilities");
		driver.switchTo().newWindow(WindowType.TAB);
		
		for (Integer iterable: map2.keySet()) {
			System.out.println(map2.get(iterable));
		}
		
		
		for (Entry<Integer, String> iterable: map2.entrySet()) {
			int keys = iterable.getKey();
			String values = iterable.getValue();
			System.out.println(keys+" "+values);
		}
		Stream.of(map2.keySet().toArray())
        .forEach(System.out::println);
		Stream.of(map2.entrySet().toArray())
         .forEach(System.out::println);
		 
		 Map<Integer, String> map1 =  Map.of(1, "value1", 2, "value2",3, "value3", 4, "value5");
		 	
		 for(int i=1;i<=map1.size();i++ ) {
		 	 System.out.println(map1.get(i));}
/*
    driver.get("https://dte.deloitte.com/te/ExpenseSummary.aspx");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("anwreddy@deloitte.com");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
//	Alert Windowalert = driver.switchTo().alert() ;
//	//((Object) Windowalert).authenticateUsing(new UsernameAndPassword(_user_name,_password));
//	driver.switchTo().defaultContent() ;
	Thread.sleep(30000);
	String Url = driver.getCurrentUrl();
	String uname = "anwreddy@deloitte.com";
	String pwd = "Royal@8138";
	 String URL =  uname + ":" + pwd + "@" + Url;//"http://" +
	 driver.get(URL);
	 
	 
	 ArrayList<String> ar = new ArrayList<String>();
	 //ar.add("anwesh","kish");
	 Collections.addAll(ar, "anwesh","kish");
	 

	 //	 HashMap<String,Integer> hash = new HashMap<String,Integer>(){{put("Brussels", 1139000);}};
//	 hash.put("", null)
	 
	//((HasAuthentication) driver).register(UsernameAndPassword.of("anwreddy@deloitte.com", "Royal@8138"));
	int time = Integer.parseInt(driver.findElement(By.xpath("(//span[@class='TotalHoursColumn gridItemStyle linkBlue'])[2]/u")).getText());
	System.out.println(time);
	if (time<40){
		driver.findElement(By.xpath("//a[@title='Click to go to the timesheet for this period'])[3]")).click();}
		else {
			System.out.println("Skipped time charging");
		}
	driver.findElement(By.xpath("//button[@aria-label='Expand Tax Jurisdiction']//span[@class='icon-standard-simple-arrow-right-special']")).click();
	driver.findElement(By.xpath("//input[@aria-label='Attendance Hours entry for Tuesday']")).sendKeys("9");
	System.out.println("Clicked on save button");
*/
}
}