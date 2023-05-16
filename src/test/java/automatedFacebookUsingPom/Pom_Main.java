package automatedFacebookUsingPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pom_Main {
	public WebDriver driver;
	@BeforeClass
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
	}
@Test(dataProvider="pomdata",dataProviderClass=PomUsingJson.class)
public void test(String data) {
	String users[] = data.split(",");	
	Pom p = new Pom(driver);
	p.emailAddress(users[0]);
	p.passWord(users[1]);
	p.logIn();
		
}
@AfterClass
public void logOut() {
	driver.close();
}
}
//p.Emailaddress.clear();
//p.Emailaddress.sendKeys(users[0]);
//p.Password.clear();
//p.Password.sendKeys(users[1]);
//p.login.click();
