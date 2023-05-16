package PomPractice;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PomMainClass {
	public static WebDriver driver;
	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://www.rediff.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().deleteAllCookies();
	}
	@AfterClass
	public void teardown() {
		driver.close();
	}
	@Test(dataProvider="pomfacebookdata",dataProviderClass=Pomdatasending.class)
	public void callingMethods(String data) throws InterruptedException {
		Pom obj = new Pom(driver);	
		//try {
		String users[]=data.split(",");
		obj.sign.click();
		Thread.sleep(2000);
		obj.user.sendKeys(users[0]);
		obj.pass.sendKeys(users[1]);
		obj.actions.click();
		//driver.navigate().back();
//		}
//		}
//		catch(NoSuchElementException e) {
//			System.out.println("exception is throwing");
//	}
}}

