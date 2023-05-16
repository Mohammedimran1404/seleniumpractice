package different_pomtechniques;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pom1stmethodMainMethod {
	WebDriver driver;
	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
	}
	@Test
   public void mercuryToursRegPage() {
		Pom1stMethod pom = new Pom1stMethod(driver);
		pom.clickRegisterlink();
		pom.firstName("mohammed");
		pom.lastName("imran");
		pom.phoneNumber("95739873521");
		pom.emailId("imran957398@gmail.com");
		pom.addresS("hyderabad");
		pom.citY("hyderabad");
		pom.statE("Telangana");
		pom.postalCode("5000049");
		pom.countrY("INDIA");
		pom.userName("imran957398@gmail.com");
		pom.passWord("kairos@123");
		pom.confirmPassword("kairos@123");
		pom.submiT();
   }
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	
	

}
