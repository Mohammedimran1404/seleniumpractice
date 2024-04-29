package ValidationsSeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidatingFirstRowPresent {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		driver.manage().window().maximize();
		
		
		
		WebElement table =driver.findElement(By.id("countries"));
		WebElement scroll=driver.findElement(By.xpath("//*[text()='List of Countries, Capitals, Currencies and Languages']"));
		 JavascriptExecutor js =(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(true)", scroll);
		 boolean isFirstRowPresent = isRowPresent(table, 0); 
		

	        if (isFirstRowPresent) {
	            System.out.println(isFirstRowPresent+ "The first row is present in the table.");
	        } else {
	            System.out.println("The first row is not present in the table.");
	        }
	}
		 
		 private static boolean isRowPresent(WebElement table, int rowIndex) {
		        try {
		            WebElement row = table.findElements(By.tagName("tr")).get(rowIndex);
		            return true;
		        } catch (IndexOutOfBoundsException e) {
		            return false;
		        }
		        
		        
		    }
		 
		 
		
		

}
