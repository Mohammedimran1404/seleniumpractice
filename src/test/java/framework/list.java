package framework;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class list implements ITestListener{
	ExtentSparkReporter sparkreporter;
	ExtentReports reports;
	ExtentTest test;


	@Override
	public void onTestStart(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		test=reports.createTest(methodname);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		test.log(Status.PASS, "Pass");

	}
	@Override
	public void onTestFailure(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		test.log(Status.FAIL, "Fail");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		test.log(Status.SKIP, "Skip");
	}

	
	@Override
	public void onStart(ITestContext context) {
		sparkreporter= new ExtentSparkReporter(System.getProperty(("user.dir")+"/Extents/reports1.html"));
		sparkreporter.config().setDocumentTitle("Instagram");
		sparkreporter.config().setTheme(Theme.STANDARD);
		sparkreporter.config().setReportName("imran");
		
		reports = new ExtentReports();
		reports.setSystemInfo("URL", "https://www.instagram.com");
		reports.setSystemInfo("OPERATING SYSTEM", "Windows");
		reports.setSystemInfo("BROWSER", "Chrome");
		reports.setSystemInfo("VERSION", "11.08");
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		reports.flush();
		
	}

}
