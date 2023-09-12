package ValidationsSeleniumPrograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ReterivingDataFromWebTable {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().window().maximize(); 
		driver.get("https://www.imdb.com/chart/top/?ref_=nv_mv_250");
		
		By tableL=By.cssSelector("a.ipc-title-link-wrapper");
		
		List<WebElement> table =driver.findElements(tableL);
		
		String s1="230";
		
		int i1=Integer.parseInt(s1)-1;
		
		for(int i=0;i<table.size();i++) {
			
			if(i1==i) {
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
		        js.executeScript("arguments[0].scrollIntoView(true)",table.get(i));
		        
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.elementToBeClickable(table.get(i)));
		        
				table.get(i).click();
			}
			
			}
		}
	
}

//JavascriptExecutor js = (JavascriptExecutor)driver;
//WebElement ele=	driver.findElement(By.xpath("(//div[@class='ipc-lockup-overlay__screen'])[250]"));
//	js.executeScript("arguments[0].click()",ele );

