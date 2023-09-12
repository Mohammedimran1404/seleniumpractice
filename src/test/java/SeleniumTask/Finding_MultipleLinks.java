package SeleniumTask;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Finding_MultipleLinks {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:www.amazon.com");
		
		By alllinksL = By.tagName("a");
		List<WebElement> alllinks= driver.findElements(alllinksL);
		for(WebElement ele:alllinks) {
			
			if(ele.isDisplayed()) {
				System.out.println(ele.getText());
				Actions action = new Actions(driver);
				action.contextClick(ele).build().perform();
				//Thread.sleep(1000);
				Robot robo = new Robot();
				robo.keyPress(KeyEvent.VK_DOWN);
				robo.keyRelease(KeyEvent.VK_DOWN);
				
				robo.keyPress(KeyEvent.VK_ENTER);
				robo.keyRelease(KeyEvent.VK_ENTER);
				
				String currentwindowID=driver.getWindowHandle();
				Set<String>allwindowID=driver.getWindowHandles();
				for(String wind:allwindowID) {
					if(!wind.equals(currentwindowID)) {
						driver.switchTo().window(wind);
						Thread.sleep(3000);
						driver.close();
					}
				}
				    Thread.sleep(2000);
					driver.switchTo().window(currentwindowID);	
			}
		}
	
		
	}

}
