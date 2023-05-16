package locators;

import org.apache.maven.shared.utils.Os;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelectors {

	public static void main(String[] args) {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.facebook.com");
	//	driver.findElement(By.cssSelector("input#email")).sendKeys("imran"); //tag and id
		//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("imran"); // taga and class
	//	driver.findElement(By.cssSelector("input.inputtext[type=text]")).sendKeys("imran"); // tag class and attribute
		//driver.findElement(By.cssSelector("input[type=text]")).sendKeys("imran"); //tag and attribute
          System.out.println(Os.OS_NAME);
          System.out.println(Os.OS_VERSION);
          System.out.println(Os.OS_ARCH);
          System.out.println(System.getProperty("java.version"));
         
	}

}
