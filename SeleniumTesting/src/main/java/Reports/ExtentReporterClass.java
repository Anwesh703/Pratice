package Reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterClass {
	
	public static ExtentReports getReportObject() {
		String path = System.getProperty("user.dir")+"\\results\\reportgenerated2.html";
		ExtentSparkReporter report = new ExtentSparkReporter(path);
		report.config().setReportName("Automation Result");
		report.config().setDocumentTitle("Test Report");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("Tester", "Anwesh");
		extent.setSystemInfo("Tester", "tazeer");
		return extent;
	}
	
	
}
