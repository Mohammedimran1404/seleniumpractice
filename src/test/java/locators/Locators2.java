package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.manage().window().maximize();
		//self x-path
	//	driver.findElement(By.xpath("//a[normalize-space(text())='Deccan Health Care']/self::a")).click();
		// descendent (grandchild and child comes under descendent
//List<WebElement >ele =driver.findElements(By.xpath("//a[normalize-space(text())='Jindal Saw']/ancestor::tr/child::td"));
//		System.out.println(ele.size());
//		driver.close();
		// ancestor means grand parent
//	WebElement ele=	driver.findElement(By.xpath("//tr/descendant::a[normalize-space(text())='Jindal Saw']"));
//	System.out.println(ele.getText());
//    ele.click();
//	WebElement ele=	driver.findElement(By.xpath("//a[normalize-space(text())='Jindal Saw']/parent::td/ancestor::tr/preceding-sibling::tr/descendant::a[normalize-space(text())='SecMark Consultancy']"));
//	System.out.println(ele.getText());
//	ele.click();
        driver.findElement(By.xpath("//div[@id='fullname_field']/child::div/descendant::div[3]/child::input")).sendKeys("mohammed");
        driver.findElement(By.xpath("//input[@name='firstname']/following::div[4]/child::input")).sendKeys("imran");
        driver.findElement(By.xpath("//div[@id='fullname_field']/following-sibling::div[1]/descendant::input")).sendKeys("imran957398@gmail.com");
        driver.findElement(By.xpath("//div[text()='Re-enter email address']/parent::div/child::input")).sendKeys("imran957398@gmail.com");
        driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("kairos@123");
        
       WebElement ele= driver.findElement(By.cssSelector("select#day"));
       Select sele = new Select(ele);
       sele.selectByVisibleText("14");
       
       
       WebElement ele1= driver.findElement(By.cssSelector("select#month"));
       Select sele1 = new Select(ele1);
       sele1.selectByVisibleText("Apr");
       
       WebElement ele2= driver.findElement(By.cssSelector("select#year"));
       Select sele2 = new Select(ele2);
       sele2.selectByValue("2000");
       
       driver.findElement(By.xpath("//input[@name='did_use_age']/following::div/descendant::span[3]/child::label")).click();
       
        
		driver.findElement(By.xpath("//div[@id='fullname_field']/following-sibling::div[10]/child::button")).click();

		
		
		
   // driver.close();
	}
	
}
