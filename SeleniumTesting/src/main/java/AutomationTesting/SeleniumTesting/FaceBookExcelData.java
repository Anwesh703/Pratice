package AutomationTesting.SeleniumTesting;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.FacebookLogin;
import io.opentelemetry.context.Context;
import util.ReadPropertyFile;
@Listeners(Reports.Listeners.class)
public class FaceBookExcelData extends BaseClass{
	String url;
	

	@BeforeClass
	public void intailization() throws IOException, InterruptedException {
		driver = InitailizeBrowser();
		
		ReadPropertyFile rp= new ReadPropertyFile();
		 url=rp.getDataFromProperty("URL");
		 driver.get(url);
	}
	
	
	@Test
	public void FacebookLoginDetails() throws IOException, InterruptedException {
	
		FacebookLogin fb = new FacebookLogin(driver);
	//	ExcelDataDriven excel = new ExcelDataDriven();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//ArrayList<String> al= excel.Run("NaveenLogin");
		//fb.PerformFacebookLogin_Default("FaceBookExcelData");
		ReadPropertyFile rp= new ReadPropertyFile();
//		url=rp.getDataFromProperty("URL");
//		driver.manage().deleteAllCookies();
//		driver.navigate().to(url);
		fb.PerformFacebookLogin("FaceBookExcelData");
//		driver.manage().deleteAllCookies();
//		driver.navigate().to(url);
//		fb.PerformFacebookLogin_Custom("FaceBookExcelData",1);
//		driver.manage().deleteAllCookies();
//		driver.navigate().to(url);
//		fb.PerformFacebookLogin_Custom("FaceBookExcelData",2);
//		driver.manage().deleteAllCookies();
//		driver.navigate().to(url);
//		fb.PerformFacebookLogin_Custom("FaceBookExcelData",3);
//		
		
		
		fb.LNK_ForgottenPassword.click();
	}
	@AfterClass
	public void QuitBrowser() {
	driver.quit();
	}

}
