package different_pomtechniques;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pom2ndMethodMainMethodby {
      WebDriver driver;
      @BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
	}
      @Test
      public void mercuryToursPage() {
    	  Pom2ndMethod pom = new Pom2ndMethod(driver);
    	  pom.registerLink();
    	  pom.firstName("Mohammed");
    	  pom.lastName("Imran");
    	  pom.phoneNumber("9573987351");
    	  pom.emailId("imran957398@gmail.com");
    	  pom.addresS("new hafeezpet,hyderabad");
    	  pom.citY("Hyderabad");
    	  pom.statE("Telangana");
    	  pom.postalCode("500049");
    	  pom.countrY("INDIA");
    	  pom.email("imran");
    	  pom.passwoerD("imran@123");
    	  pom.cpassword("imran@123");
    	  pom.sbtn();
      }
      @AfterClass
      public void tearDown() {
    	  driver.quit();
      }
		

}
