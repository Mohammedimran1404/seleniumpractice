package ValidationsSeleniumPrograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import edu.emory.mathcs.backport.java.util.Arrays;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DifferentTypesOfWindows {
	
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		

		
		
		
		
//		
//		WebDriverManager.chromedriver().setup();
//		
//		 ChromeOptions options = new ChromeOptions();
//         options.addArguments("--disable-extensions"); // Disable extensions
//         options.addArguments("--start-maximized"); // Start maximized
//         options.addArguments("--disable-infobars"); // Disable infobars
//         options.addArguments("--disable-gpu"); // Applicable for Windows OS
//         options.addArguments("--no-sandbox"); // Bypass OS security model, for Linux OS
//         options.addArguments("--disable-dev-shm-usage"); // Overcome limited resource problems
//		WebDriver driver = new ChromeDriver(options);
//		
//		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_onbeforeunload");
//		driver.manage().window().maximize();
//		
//		Thread.sleep(5000);
//		
//		  
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.alertIsPresent());
//		
//		
//		Alert alert=driver.switchTo().alert();
//		alert.accept();
		
		
		
		
		
//		Thread.sleep(4000);
//		Robot robot = new Robot();
//		System.out.println("About to zoom in");
//		for (int i = 0; i < 3; i++) {			
//			robot.keyPress(KeyEvent.VK_CONTROL);
//			robot.keyPress(KeyEvent.VK_ADD);
//			robot.keyRelease(KeyEvent.VK_ADD);
//			robot.keyRelease(KeyEvent.VK_CONTROL); 
//			Thread.sleep(2000);
//			
//			System.out.println("About to zoom out");
//			for (int i1 = 0; i1 < 2; i1++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//				Thread.sleep(3000);
//			
//		}
		}
		
		
		// setting window size
//		driver.manage().window().setSize(new Dimension(2000, 1500));
		// used to set the position
//		driver.manage().window().setPosition(new Point(100, 200));
		// used to increase the size of full screen 
		
//		driver.manage().window().fullscreen();
		
		// used for switching to new window
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		
//		driver.get("https://www.flipkart.com");
//	}
	}
