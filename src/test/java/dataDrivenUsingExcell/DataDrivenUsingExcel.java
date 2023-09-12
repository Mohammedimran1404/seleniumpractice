package dataDrivenUsingExcell;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenUsingExcel {
	WebDriver driver;
	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
		
		@Test(dataProvider="logindatas")
		public void login(String user, String pass,String result) throws InterruptedException {
				
		By emailtextboxL=By.xpath("//div[@class='inputs']/child::label/following-sibling::input[@id='Email']");
		WebElement emailtextbox =driver.findElement(emailtextboxL);
		emailtextbox.clear();
		emailtextbox.sendKeys(user);
		
		By passwordtextboxL =By.xpath("//input[@id='Email']/following::div/child::span/preceding-sibling::input");
		WebElement passwordtextbox = driver.findElement(passwordtextboxL);
		passwordtextbox.clear();
		passwordtextbox.sendKeys(pass);
		
		By loginbtnL = By.xpath("//button[text()='Log in']");
		WebElement loginbtn = driver.findElement(loginbtnL);
		loginbtn.click();
		
		String expected_title="Dashboard / nopCommerce administration";
	    String actual_title=driver.getTitle();   
	    if(result.equals("valid")) {
	    	if(expected_title.equals(actual_title)) {
	    		Thread.sleep(3000);
	    		By lbtnL=By.xpath("//div[@id='navbarText']/descendant::li[3]/child::a");
	    	     WebElement lbtn=driver.findElement(lbtnL);
	    	     
	    		lbtn.click();
	    		Assert.assertTrue(true);
	    	}
	    else {
	    	Assert.assertTrue(false);
	    }
	    
	    }
	    	else if(result.equals("invalid")) {
	    		if(expected_title.equals(actual_title)) {
	    			
		    		driver.findElement(By.xpath("//div[@id='navbarText']/descendant::li[3]/child::a")).click();
		    		
	    			Assert.assertTrue(false);
	    		}
	    		else {
	    			Assert.assertTrue(true);
	    		}
	    	}
		}
	
		
		@AfterClass
		public void tearDown() {
			driver.close();
		}
		
		@DataProvider(name="logindatas")
		public String[][] logindata() throws IOException {
			
			String path=".\\excelldatafiles\\datadrivenexcellsheet.xlsx";
			
			ExcelUtility eu = new ExcelUtility(path);
		int totalrows=eu.getRowCount("sheet1");
		int totalcols=eu.getColumnCount("sheet1", 1);
			String getdata[][]=new String[totalrows][totalcols];
			
			for(int r=1;r<=totalrows;r++) {
				for(int c=0;c<totalcols;c++) {
					getdata[r-1][c]=eu.getCellData("sheet1", r, c);	
					eu.setCellData("sheet1", r, 3, "pass");				
				}
				
			}
			return getdata;
			
		}
	}


/*	String[][] data= {{"admin@yourstore.com","admin","valid"},
{"admin@yourstore.com","adm","invalid"},
{"adm@yourstore.com","admin","invalid"},
{"am@yourstore.com","admi","invalid"}
}; */