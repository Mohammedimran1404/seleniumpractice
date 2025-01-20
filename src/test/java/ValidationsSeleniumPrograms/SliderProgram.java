package ValidationsSeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SliderProgram {
	static WebDriver driver;
	
public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.get("https://fitpeo.com/revenue-calculator");
		 driver.manage().window().maximize();

        
         WebElement slider = driver.findElement(By.xpath("//input[@type='range']"));
         Actions actions = new Actions(driver);
         actions.clickAndHold(slider).moveByOffset(93, 0).release().perform();
		
	}

}
