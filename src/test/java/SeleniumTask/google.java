package SeleniumTask;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class google {

	public static void main(String[] args) throws AWTException, InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		By searchBoxL= By.xpath("//textarea[@id='APjFqb']");
		WebElement searchbox = driver.findElement(searchBoxL);
		searchbox.sendKeys("Gmail");
		 
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		By signinMailL= By.xpath("//a[text()='Sign in to Gmail']");
		WebElement signinMail = driver.findElement(signinMailL);
		signinMail.click();
		
		
		By signintoMailL= By.xpath("//a[@class='action-button']");
		WebElement signintoMail = driver.findElement(signintoMailL);
		signintoMail.click();
		Set<String> window=driver.getWindowHandles();
		List<String> tabs=new ArrayList<>(window);
		driver.switchTo().window(tabs.get(1));
		
		
		By emailTextBoxL= By.xpath("//input[@type='email']");
		WebElement emailTextBox = driver.findElement(emailTextBoxL);
         emailTextBox.sendKeys("imranmohammed1525@gmail.com");
		
		
		By buttonL= By.xpath("//span[text()='Next']");
		WebElement button = driver.findElement(buttonL);
		button.click();
		
		

	}

}
