package extentsReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportsPractice {
	ExtentSparkReporter sparkreporter;
	ExtentReports reports;
	ExtentTest test;
	public void extendsre() {
	sparkreporter = new ExtentSparkReporter(System.getProperty(".\\Reports"+".html"));
	sparkreporter.config().setDocumentTitle("Google");
	sparkreporter.config().setReportName("imran");
	sparkreporter.config().setTheme(Theme.STANDARD);
	
	reports = new ExtentReports();
	reports.attachReporter(sparkreporter);
	reports.setSystemInfo("url", "https://www.google.com");
	reports.setSystemInfo("platform", "window");
	 
	test=reports.createTest("create report");
	test.log(Status.PASS, "PASS");
	
	reports.flush();

}
}
