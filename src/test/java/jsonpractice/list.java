package jsonpractice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class list implements ITestListener{
	ExtentSparkReporter sparkreporter;
	ExtentReports reports;
	ExtentTest test;

	public void onTestStart(ITestResult result) {
		String methodname = result.getMethod().getMethodName(); //to capture the method
		test=reports.createTest(methodname);
		
	}

	public void onTestSuccess(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		System.out.println("test cases pass");
		test.log(Status.PASS, "Pass");
		test.log(Status.INFO, "INFO");

	}
	public void onTestFailure(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		test.log(Status.FAIL, "Fail");
	}

	
	public void onTestSkipped(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		test.log(Status.SKIP, "Skip");
	}

	
	public void onStart(ITestContext context) {
		sparkreporter= new ExtentSparkReporter("C:\\Users\\ImranMohd-Kairos\\EclipseFolder\\Seleniumpractice\\Extents\\Reports.html");
		sparkreporter.config().setDocumentTitle("insta");
		sparkreporter.config().setTheme(Theme.STANDARD);
		sparkreporter.config().setReportName("IMRAN");
		
		reports = new ExtentReports();
		reports.attachReporter(sparkreporter);
		reports.setSystemInfo("URL", "https://www.instagram.com");
		reports.setSystemInfo("OPERATING SYSTEM", "Windows");
		reports.setSystemInfo("BROWSER", "Chrome");
		
		
		
	}

	
	public void onFinish(ITestContext context) {
		reports.flush();
		
	}

}
// for generating the file automatically : - System.getProperty("user.dir")+"/Extents/Report1.html"
