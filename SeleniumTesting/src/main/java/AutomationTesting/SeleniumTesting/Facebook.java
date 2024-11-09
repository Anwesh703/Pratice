package AutomationTesting.SeleniumTesting;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import POM.FacebookLogin;
import util.ExcelDataDriven2;
import util.ReadPropertyFile;

public class Facebook extends BaseClass{
WebDriver driver;
String url;
@Test
public void Facebook() throws IOException, InterruptedException {
//	driver = InitailizeBrowser();
//	ReadPropertyFile rp= new ReadPropertyFile();
//	 url=rp.getDataFromProperty("URL");

	 
	 ExcelDataDriven2 excel = new ExcelDataDriven2();
		
//		ArrayList<Hashtable<String, String>> al= excel.Run("C:\\Users\\anwreddy\\ExcelData\\FacebookLogin.xlsx","FacebookLogin","TestCases","AnweshLogin");
//		for(Hashtable<String, String> i : al) {
//		System.out.println(i);}
//	driver.get(url);
//	ArrayList<WebElement> al= new ArrayList<>(driver.findElements(By.xpath("//table[@class='confluenceTable']/tbody/tr/td[3]")));
//	for(int i=0;i<al.size();i++) {
//		System.out.println(al.get(i).getText());
//	}
//	FacebookLogin fb = new FacebookLogin(driver);
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	fb.PerformFacebookLogin("AnweshLogin");
//	fb.LNK_ForgottenPassword.click();
	
}
//@AfterClass
//public void QuitBrowser() {
//driver.quit();
//}

}
