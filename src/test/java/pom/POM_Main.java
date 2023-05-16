package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class POM_Main {
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.facebook.com/");
    driver.manage().window().maximize();
	
    PageObjectmodel p=new PageObjectmodel(driver);
    p.setdata("imran@gmail.com");
    p.setpW("dghs@");
    p.clicking();
	
	
	
}
}
