package dataDrivenUsingExcell;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import java.time.Duration;

public class DatePickerWithStingMonths {
	 static WebDriver driver;
	public static void main(String[] args)throws InterruptedException {

		   
		        WebDriverManager.edgedriver().setup();
		        driver = new EdgeDriver();
		        
		        driver.manage().window().maximize();
		        driver.get("https://jqueryui.com/datepicker/");
		        
		        By exampleL =By.cssSelector("div.demo-list>h2");
				WebElement example=driver.findElement(exampleL);
				JavascriptExecutor javascriptexecutor= (JavascriptExecutor)driver;
				javascriptexecutor.executeScript("arguments[0].scrollIntoView(true)",example );
		        
		        driver.switchTo().frame(0);  
		        
		        By datepickerSearchbarL = By.id("datepicker");
		        WebElement datepickerSearchbar = driver.findElement(datepickerSearchbarL);
		        
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.visibilityOf(datepickerSearchbar));
		        datepickerSearchbar.click(); 
		        
		       
		        String targetDateStr = "27,January,2024"; 
		        
		   
		        String newDate[]=targetDateStr.split(",");
		        
		        System.out.println(newDate[1]);
		        
		        
		        
		        
		        
		        By expMonthL = By.cssSelector(".ui-datepicker-month");
		        By expYearL = By.cssSelector(".ui-datepicker-year");
		        
		        while (true) {
//		       
		            String displayedMonth = driver.findElement(expMonthL).getText();
		          System.out.println(displayedMonth);
		            String displayedYear = driver.findElement(expYearL).getText();
		           

		            if (displayedMonth.equalsIgnoreCase(newDate[1]) && displayedYear.equalsIgnoreCase(newDate[2])) {
		                break;
		                
		            } else if (!displayedMonth.equalsIgnoreCase(newDate[1]) || !displayedYear.equalsIgnoreCase(newDate[2])) {
//		                By nextButtonL = By.cssSelector(".ui-icon-circle-triangle-e");
		                By prevButtonL = By.cssSelector(".ui-icon-circle-triangle-w");
		                Thread.sleep(1000);
		                driver.findElement(prevButtonL).click();
		            }    
		           
		            Thread.sleep(2000); 
		        }
		        
		        By monthL=By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td");
				List<WebElement> month= driver.findElements(monthL);
				 for(WebElement element :month) {
				   if(element.getText().equals(newDate[0])) {
					   element.click();
					   break;
				   }
		        }
		        
//		        driver.quit();  // Close the browser
		    }
}
		

	


