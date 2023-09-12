package SeleniumTask;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ex {
public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.amazon.in");
	By todaysDealL = By.xpath("//*[contains(text(),'Today')and contains(text(),'Deals')]");
	WebElement todaysDeal = driver.findElement(todaysDealL);
	Actions action = new Actions(driver);
	action.contextClick(todaysDeal).build().perform(); // for right click
	Robot rob=new Robot();
	Thread.sleep(3000);
	rob.keyPress(KeyEvent.VK_DOWN);
	rob.keyRelease(KeyEvent.VK_DOWN);

	rob.keyPress(KeyEvent.VK_ENTER);
	rob.keyRelease(KeyEvent.VK_ENTER);
} 
}
