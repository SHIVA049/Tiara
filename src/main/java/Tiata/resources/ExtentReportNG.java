package Tiata.resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNG {

	public static ExtentReports getReportObject() {
		
		String reportFiles=System.getProperty("user.dir"+"//reports"+"index.html");
		ExtentSparkReporter reporter=new ExtentSparkReporter("reportFiles");
		reporter.config().setReportName("Tiara Execution Reports");
		reporter.config().setDocumentTitle("Test Results");
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Shivaling Neralagi");
		return extent;
	}
	
}
