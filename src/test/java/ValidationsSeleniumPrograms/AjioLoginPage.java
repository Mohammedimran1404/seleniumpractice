package ValidationsSeleniumPrograms;


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


public class AjioLoginPage {
	
	WebDriver driver;
	@BeforeClass
	public void launch() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com");
	}
	
	@Test(dataProvider = "tech")
	public void login(String number) throws InterruptedException {
		
		By signinBtnL= By.cssSelector("span.login-form.login-modal");
		WebElement signinBtn= driver.findElement(signinBtnL);
		signinBtn.click();
		
		By searchL= By.cssSelector("input[name='username']");
		WebElement search= driver.findElement(searchL);
		search.click();
		search.sendKeys(number);
		
		By continueBtnL= By.cssSelector("input.login-btn");
		WebElement continueBtn= driver.findElement(continueBtnL);
		continueBtn.click();
		
		if(driver.getPageSource().contains("Your mobile number should be of 10 digits. ")) {
			By crossBtnL= By.cssSelector("div.modal-content>div.ic-close-quickview");
			WebElement crossBtn= driver.findElement(crossBtnL);
			crossBtn.click();
			Assert.assertTrue(true);
		}
		else {
			
		
		 Thread.sleep(17000);
		 
		 By startshopingL = By.cssSelector("input[type='submit']");
		 WebElement startshoping=driver.findElement(startshopingL);
		 startshoping.click();
		}
	     	}
	
	
	 
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	
		@DataProvider(name="tech")
		 public static Object [][] ajio() {
			 Object [][] data = {{"9573"},{"957398"},{"9573987351"}};
				 
				 return data;
			 }
	}










//Thread.sleep(2000);

//By nameL= By.cssSelector("div>input[name='user-name']");
//WebElement name= driver.findElement(nameL);
//name.sendKeys("mohammedimran");
//
// By genderL= By.cssSelector("label.gender-opt:last-child");
//	WebElement gender= driver.findElement(genderL);
//	gender.click();
//
//By mailL= By.cssSelector("input[name='email-mob']");
//WebElement mail= driver.findElement(mailL);
//mail.sendKeys("imran957398@gmail.com");
//
//   
//  
//
//  By termsL= By.cssSelector("input.checkbox");
//	WebElement terms= driver.findElement(termsL);
//	terms.click();
//

//By otpL= By.cssSelector("input.login-form-inputs.login-btn");
//WebElement otp= driver.findElement(otpL);
//otp.click();