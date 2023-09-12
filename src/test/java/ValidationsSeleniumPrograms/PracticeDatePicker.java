package ValidationsSeleniumPrograms;

import java.time.Duration;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeDatePicker {
	 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/datepicker/");
		
		By exampleL =By.cssSelector("div.demo-list>h2");
		WebElement example=driver.findElement(exampleL);
		JavascriptExecutor javascriptexecutor= (JavascriptExecutor)driver;
		javascriptexecutor.executeScript("arguments[0].scrollIntoView(true)",example );
		
		driver.switchTo().frame(0);
		By datepickerSearchbarL= By.cssSelector("input#datepicker");
		WebElement datepickerSearchbar=driver.findElement(datepickerSearchbarL);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(datepickerSearchbar));
		datepickerSearchbar.click();
		String Btn="backward";
		if(Btn.equalsIgnoreCase("forward")) {
		for(int i=1;i<=3;i++) {
			Thread.sleep(2000);
			By nextbuttonL=By.cssSelector("span.ui-icon.ui-icon-circle-triangle-e");
			WebElement nextbutton=driver.findElement(nextbuttonL);
			nextbutton.click();
		  }
		}
		else {
			for(int i=1;i<=3;i++) {
				Thread.sleep(2000);
				By backwardbuttonL=By.cssSelector("a[title='Prev']>span");
				WebElement backwardbutton= driver.findElement(backwardbuttonL);
				backwardbutton.click();
		}
	     	}
		  
		By monthL=By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td");
		List<WebElement> month= driver.findElements(monthL);
		 for(WebElement element :month) {
		   if(element.getText().equals("11")) {
			   element.click();
		   }
	
		 }
		 if(Btn.equalsIgnoreCase("forward")) {
		String actual= datepickerSearchbar.getAttribute("value");
		System.out.println(actual);
		String expected="11/11/2023";
		Assert.assertEquals(actual, expected);
		 }
		 else {
			 String actual= datepickerSearchbar.getAttribute("value");
				System.out.println(actual);
				String expected="05/11/2023";
				Assert.assertEquals(actual, expected);
		 }
		 
		 driver.quit();
	}
}
