package Reports;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import AutomationTesting.SeleniumTesting.BaseClass;
import POM.FacebookLogin;
import util.ReadPropertyFile;

public class ExtentReport extends BaseClass{
	WebDriver driver;
	String url;
	ExtentReports extent;
	@BeforeClass
	public void reports() {
		//ExtentReports , ExtentSparkReporter
		String path = System.getProperty("user.dir")+"\\results\\reportgenerated1.html";
		ExtentSparkReporter report = new ExtentSparkReporter(path);
		report.config().setReportName("Automation Result");
		report.config().setDocumentTitle("Test Report");
		
		 extent = new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("Tester", "Anwesh");
		extent.setSystemInfo("Tester", "tazeer");
	}
	
	@Test
	public void intitialFacebookdemo() throws IOException, InterruptedException {
	ExtentTest test	= extent.createTest("Initial Test case");
		driver = InitailizeBrowser();
		ReadPropertyFile rp= new ReadPropertyFile();
		 url=rp.getDataFromProperty("URL");
		 driver.get(url);
		FacebookLogin fb = new FacebookLogin(driver);
	//	ExcelDataDriven excel = new ExcelDataDriven();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//ArrayList<String> al= excel.Run("NaveenLogin");
		test.fail("Test case failed");
		fb.PerformFacebookLogin_Default("ExtentReport");

		
		
	}
	
	@AfterClass
	public void end() {
		driver.quit();
		extent.flush();
	}
	
}
