package readDataFromExcell;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {
	
	
WebDriver driver;


@BeforeClass
public void setUp() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://admin-demo.nopcommerce.com/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
	
	@Test
	public void login() throws InterruptedException, IOException {
		String path=".\\excelldatafiles\\practiceexcel.xlsx";
		FileInputStream inputstream = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		
		String username=sheet.getRow(1).getCell(0).getStringCellValue();
		String password=sheet.getRow(1).getCell(1).getStringCellValue();
		
			
	By emailtextboxL=By.xpath("//div[@class='inputs']/child::label/following-sibling::input[@id='Email']");
	WebElement emailtextbox =driver.findElement(emailtextboxL);
	emailtextbox.clear();
	emailtextbox.sendKeys(username);
	
	By passwordtextboxL =By.xpath("//input[@id='Email']/following::div/child::span/preceding-sibling::input");
	WebElement passwordtextbox = driver.findElement(passwordtextboxL);
	passwordtextbox.clear();
	Thread.sleep(2000);
	passwordtextbox.sendKeys(password);
	
	By loginbtnL = By.xpath("//button[text()='Log in']");
	WebElement loginbtn = driver.findElement(loginbtnL);
	loginbtn.click();
	}
	@AfterClass
	public void teardown() {
		driver.close();
	}
}