package ValidationsSeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Resizable {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
	    driver.manage().window().maximize();
	    driver.get("https://jqueryui.com/datepicker/");
	    
	    driver.findElement(By.linkText("Resizable")).click();
	    
	  WebElement scroll=  driver.findElement(By.cssSelector("p.desc"));
	  
	    JavascriptExecutor js =(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollIntoView(true)", scroll);
		
	    driver.switchTo().frame(0);
	    
	   WebElement resizable= driver.findElement(By.cssSelector("div#resizable div:last-child"));
	   Actions action = new Actions(driver);
	   action.dragAndDropBy(resizable, 300, 100).build().perform();
	   
	}

}
