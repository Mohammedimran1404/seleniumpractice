package framework;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class listen implements ITestListener {
	
	ExtentTest test;
	ExtentReports report;
      

	
	public void onTestStart(ITestResult result) {
	String methodName = result.getMethod().getMethodName();
	test=report.createTest(methodName);
	
		
		
	}

	public void onTestSuccess(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		test.log(Status.PASS, "PASS");
	}

	
	public void onTestFailure(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		test.log(Status.FAIL, "FAIL");
	}

	
	public void onTestSkipped(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		test.log(Status.SKIP, "SKIP");
	}


	
	public void onStart(ITestContext context) {
	ExtentSparkReporter htmlreport= new ExtentSparkReporter("C:\\Users\\ImranMohd-Kairos\\EclipseFolder\\Seleniumpractice\\Reports"+".html");

    htmlreport.config().setDocumentTitle("team tested");

	htmlreport.config().setTheme(Theme.STANDARD);

	htmlreport.config().setReportName("team");

		report=new ExtentReports();

		report.setSystemInfo("base-browser", "chrome");

	    report.setSystemInfo("base-window", "window11");

		report.setSystemInfo("theme", "standard");
		
		
		
	}

	
	public void onFinish(ITestContext context) {
		report.flush();
		
	}
     
}
