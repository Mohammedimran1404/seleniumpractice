package takescreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProgramsForScreenShot {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,900)");
		// ScreenShot for whole page
	/*	TakesScreenshot ts=(TakesScreenshot)driver;
		File f=ts.getScreenshotAs(OutputType.FILE);
		File fil = new File(".\\Screenshots\\hompage.png");
		FileUtils.copyFile(f, fil);   */
		// some page 
/*	  WebElement ele=	driver.findElement(By.xpath("//div[@class='page-body']"));
	TakesScreenshot ts=(TakesScreenshot)ele;
    File src=ts.getScreenshotAs(OutputType.FILE);
    File f = new File(".\\Screenshots\\somepage.png");
    FileUtils.copyFile(src, f);  */
		
		//particular webelement
		
		WebElement ele=driver.findElement(By.xpath("//h2[@class='title']/following::div/descendant::img[1]"));
		TakesScreenshot ts=(TakesScreenshot)ele;
		File f=ts.getScreenshotAs(OutputType.FILE);
		File fil = new File(".\\Screenshots\\particular.png");
		FileUtils.copyFile(f, fil);
		
		driver.close();  
	}

}
