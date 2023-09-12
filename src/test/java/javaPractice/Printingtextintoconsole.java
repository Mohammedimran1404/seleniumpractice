package javaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Printingtextintoconsole {
	public static void main(String[] args) {
		
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	By wholetableL =By.xpath("//div[@id='content']");
	WebElement wholetable=driver.findElement(wholetableL);
	System.out.println(wholetable.getText());
	driver.close();

}
}