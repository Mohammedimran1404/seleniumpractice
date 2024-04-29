package ValidationsSeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidatingTable {
	WebDriver driver;
	
	public void webTableValidating() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().window().maximize();
		String tableRowNumber="10";
		
   int tablePosition=Integer.parseInt(tableRowNumber.trim())-1;
   
  List<WebElement> lstCheckBoxes=driver.findElements(By.xpath("//*[@class='hasVisited']"));
  List<WebElement> countryName= driver.findElements(By.xpath("//table[@id='countries']/tbody/tr/td[2]"));
  
  
         for(int i=0;i<lstCheckBoxes.size();i++) {
        	 if(i==tablePosition) {
        		 JavascriptExecutor js =(JavascriptExecutor)driver;
        		 js.executeScript("arguments[0].scrollIntoView(true)", countryName.get(i));
        		 lstCheckBoxes.get(i).click();
        	 }
         }
         boolean value=false;
         for(int i1=0;i1<countryName.size();i1++) {
        	 if(countryName.get(i1).getText().equalsIgnoreCase("Austria")) {
        		 value=true;
        	 }
    	 }
         Assert.assertTrue(value);
        
   
		
		driver.close();
		
	}
	
	public static void main(String[] args) {
		ValidatingTable v= new ValidatingTable();
		v.webTableValidating();
	}

}
