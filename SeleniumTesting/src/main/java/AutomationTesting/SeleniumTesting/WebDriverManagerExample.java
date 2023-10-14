package AutomationTesting.SeleniumTesting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.CapabilityType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerExample {
public static void main(String [] args) {
	WebDriverManager.chromedriver().setup();
	ChromeOptions co = new ChromeOptions();
	co.addArguments("start-maximized");
	co.addArguments("--incognito");
	//co.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
	 co.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
	WebDriver driver = new ChromeDriver(co);
	driver.get("https://www.google.com/");
	System.out.println(driver.getTitle());
	driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("youtube");
	driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys(Keys.ENTER);
	System.out.println(driver.getCurrentUrl());
	
	
	
	
	
	
	
	
	
	ArrayList<String> al = new ArrayList<String>();
	Collections.addAll(al,"Selenium","Sele","Man");

	ArrayList<String> al2 = new ArrayList<String>();
	Collections.addAll(al2,"Automation","Deloitte","Hyderabad","Secunderabad");
	al.addAll(al2);
	al.addAll(1,al2);
	System.out.println(al);
	long countSize =al.stream().filter(f->f.startsWith("S")).count();
//	long countSize =al.stream().filter(s->{s.endsWith("S");
//			return false;}).count();
	System.out.println(countSize);
	
	
//	WebDriverManager.edgedriver().setup();
//	 EdgeOptions eo = new EdgeOptions();
//	 eo.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
//	 eo.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
//	driver = new EdgeDriver(eo);
//	driver.get("https://www.pinterest.com/lau3carol/pictures/");
//	System.out.println(driver.getTitle());
}
}
