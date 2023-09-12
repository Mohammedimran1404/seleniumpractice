package ValidationsSeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidatingDropDowns {
	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seletech.in/practice/");
		
		
		By dropdownL= By.cssSelector("select#dropdown-class-example");
		 WebElement dropdown=driver.findElement(dropdownL);
		 
		 // Validating single value in the dropdown
		 String expected ="Option3";
		 Select sele = new Select(dropdown);
		 sele.selectByIndex(3);
		 // this will store the selected dropdown value
		String actual= sele.getFirstSelectedOption().getText();
		System.out.println(actual);
		Assert.assertEquals(actual, expected);
		 
		
		 
		 
		 
		 
		 // validatiing all the values in the dropdown
//		 String expected[]= {"Select","Option1","Option2","Option3"};
//		 
//		 Select sele = new Select(dropdown);
//		List<WebElement> options= sele.getOptions();
//		   
//		  for(int i=0;i<options.size();i++) {
//			  options.get(i).getSize();
//			  
//			  
//			  Assert.assertEquals(options.get(i).getText(), expected[i]);
//		  }
		  System.out.println("PASSED");
		  driver.close();
		  
		
		
	}

}
