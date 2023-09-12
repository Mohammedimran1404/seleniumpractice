package ValidationsSeleniumPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {
	 WebDriver driver;
		@Test
		public void dragAndDrop() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://seletech.in/practice/");
//		
//		By scrollL=By.xpath("//div[@class='cen-align']/child::fieldset/child::legend");
//		WebElement scroll=driver.findElement(scrollL);
//		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView(true)",scroll );
//		
//		By clickherelinkL=By.linkText("Click Here");
//		WebElement clickherelink=driver.findElement(clickherelinkL);
//		clickherelink.click();
//		
//		By dragL=By.xpath("//img[@id='drag1']");
//		WebElement drag=driver.findElement(dragL);
//		
//		By dropL=By.xpath("//div[@class='col']/following::div[4]");
//		WebElement drop=driver.findElement(dropL);
//		
//		
//		Actions action = new Actions(driver);
//		action.clickAndHold(drag)
//		.moveToElement(drop)
//		.release()
//		.build()
//		.perform();
		
		
//		driver.get("https://jqueryui.com/droppable/");
//		By scrollL=By.cssSelector("div.demo-list h2:first-child");
//		WebElement scroll =driver.findElement(scrollL);
//		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView(true)",scroll );
//		
//		driver.switchTo().frame(0);
//		
//		By dragL=By.cssSelector("div#draggable");
//		WebElement drag =driver.findElement(dragL);
//		
//		By dropL = By.cssSelector("div#droppable");
//		WebElement drop=driver.findElement(dropL);
//		
//		Actions action = new Actions(driver);
//		action.clickAndHold(drag)
//		.moveToElement(drop)
//		.release()
//		.build()
//		.perform();
		
		
	}
	
}

