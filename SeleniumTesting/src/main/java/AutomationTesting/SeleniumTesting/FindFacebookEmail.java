package AutomationTesting.SeleniumTesting;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import POM.FacebookLogin;
import POM.FindYourAccount;
import util.ReadPropertyFile;

public class FindFacebookEmail  extends BaseClass{
WebDriver driver;
String url;
@Test
public void FacebookLoginAndFindFacebookEmail() throws IOException, InterruptedException {
	driver = InitailizeBrowser();
	ReadPropertyFile rp= new ReadPropertyFile();
	 url=rp.getDataFromProperty("URL");

	driver.get(url);
	FacebookLogin fb = new FacebookLogin(driver);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	fb.PerformFacebookLogin("");
	fb.LNK_ForgottenPassword.click();
	FindYourAccount fy = new FindYourAccount(driver);
	fy.performFindYourAccount("anwesh.reddy81@gmail.com");
	
}
@AfterClass
public void QuitBrowser() {
driver.quit();
}
}
