package ValidationsSeleniumPrograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DifferentTypesOfWindows {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		Robot robot = new Robot();
		System.out.println("About to zoom in");
		for (int i = 0; i < 3; i++) {			
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ADD);
			robot.keyRelease(KeyEvent.VK_ADD);
			robot.keyRelease(KeyEvent.VK_CONTROL); 
			Thread.sleep(2000);
			
			System.out.println("About to zoom out");
			for (int i1 = 0; i1 < 2; i1++) {
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_SUBTRACT);
				robot.keyRelease(KeyEvent.VK_SUBTRACT);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				Thread.sleep(3000);
			
		}
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
	}
	}
