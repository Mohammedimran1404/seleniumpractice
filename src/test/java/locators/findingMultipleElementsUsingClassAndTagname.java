package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class findingMultipleElementsUsingClassAndTagname {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
	List<WebElement> sliders=driver.findElements(By.tagName("a"));
	for(WebElement ele:sliders) {
		System.out.println(ele);
//		int sliders=driver.findElements(By.tagName("a")).size();
//		System.out.println(sliders);
	
	}
	}

	}

 
