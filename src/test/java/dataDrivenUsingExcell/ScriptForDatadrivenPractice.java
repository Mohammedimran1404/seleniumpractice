package dataDrivenUsingExcell;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScriptForDatadrivenPractice {
	
	WebDriver driver;
	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https:www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
	}
	@Test(dataProvider="dp")
	public void validatingLoginPage(String username, String pass) throws InterruptedException {
		
		By emailtextboxL=By.id("email");
		WebElement emailtextbox=driver.findElement(emailtextboxL);	
		emailtextbox.sendKeys(username);
		By passwordtextboxL=By.id("pass");
		WebElement passwordtextbox=driver.findElement(passwordtextboxL);
		passwordtextbox.sendKeys(pass);
		
		By loginbtnL=By.xpath("//button[text()='Log in']");
		WebElement loginbtn=driver.findElement(loginbtnL);
		loginbtn.click();
	}
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	@DataProvider(name="dp")
	public String[][] getData() throws IOException {
		String path =".\\excelldatafiles\\practicedatadriven.xlsx";
		Practicedatadriver pd = new Practicedatadriver(path);
		int totalrows=pd.getRowcount("sheet1");
	int totalcols=	pd.getcellcount("sheet1", 1);
	String data[][]=new String [totalrows][totalcols];
	    for(int r=1;r<=totalrows;r++) {
	    	for(int c=0;c<totalcols;c++) {
	    	data[r-1][c]=pd.getCellData("sheet1", r, c);
	    	
	    	
	    	}
	    }
	    return data;
	
		
	}

}
