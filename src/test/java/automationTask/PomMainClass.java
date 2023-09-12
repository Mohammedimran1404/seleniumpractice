package automationTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PomMainClass {
     public  WebDriver driver;
      @BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
      @Test
      public void googleHomePageTest() {
    	  GoogleHomePage ghp= new GoogleHomePage(driver);
    	  ghp.clickOnSettings();
    	  ghp.clickOnAdvancedSearch();
    	  ghp.valiDation();
    	  ghp.allTheseWords("ahahshs");
    	  ghp.thisExactWords("asfdhhs");
    	  ghp.anyOfThisWords("agsfsf");
    	  ghp.noneOfTheseWords("z");
    	  ghp.numberRangingFrom("1");
    	  ghp.numberRangingTo("5");
    	  ghp.lanGuage();
    	  ghp.reGion();
    	  ghp.lastUpdate();
    	  ghp.siteOrDomain("https://www.google.com");
    	  ghp.termsAppearing();
    	  ghp.usageRights();
    	  ghp.advancedSearchButton();
      }
}
