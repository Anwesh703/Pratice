package AutomationTestingTraining.ProgramsAndCollections;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportsExtent {

	public static void main(String[] args) {
		ExtentReports ex = new  ExtentReports();
		 String path = System.getProperty("user.dir")+"\\reports.html";
		 System.out.println(path);
		 ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		 reporter.config().setReportName("Anwesh Reddy");
		 ex.attachReporter(reporter);
		 ExtentTest test = ex.createTest("1st Test");
		 ex.flush();
	}

}
