package automationTask;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CopyPasteURl {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver =new EdgeDriver();
		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(7000);
		
		
		String url = driver.getCurrentUrl();
		 // Find the element you want to copy the URL from (e.g., a link)
        

        // Open the URL in a new tab
        ((JavascriptExecutor)driver).executeScript("window.open()");
        
        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        
        driver.get(url);


        // Wait for the new tab to open
        // You might need to handle the switch to the new tab here

        // Close the WebDriver instance
        driver.quit();
    }
	}


