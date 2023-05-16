package jsonpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(list.class)
public class AutomatingInstaHomePageUsingDataProvider  {

	public static WebDriver driver;

	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		

	}
	@Test(priority=0,dataProvider="instagram",dataProviderClass = GivingDataToAutomClass.class)	
	public void UserName(String data) {
		String users[]=data.split(",");
		By userL = By.xpath("//input[@name='username']");
		WebElement user = driver.findElement(userL);
		user.clear();
		user.sendKeys(users[0]);
	
		By passwL = By.xpath("//input[@name='password']");
		WebElement passw = driver.findElement(passwL);
		passw.clear();
		passw.sendKeys(users[1]);
	
		By clickbL = By.xpath("//button[@class='_acan _acap _acas _aj1-']");
		WebElement clickb = driver.findElement(clickbL);
		clickb.click();
	}
	
	@AfterClass
	public void logOut(){
		driver.manage().window().minimize();
		driver.close();
	}

}




//ExtentSparkReporter sparkreporter;
//ExtentReports reports;
//ExtentTest test;
//sparkreporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/Extent/Report.html");
//sparkreporter.config().setDocumentTitle("Google Application");
//sparkreporter.config().setReportName("IMRAN");
//sparkreporter.config().setTheme(Theme.DARK);
//
//reports = new ExtentReports();
//reports.attachReporter(sparkreporter);
//reports.setSystemInfo("url", "https://www.instagram.com");
//reports.setSystemInfo("platform", "window");
//test=reports.createTest("creating report for instagram login page");
//test.log(Status.PASS, "PASS");
//
//reports.flush();