package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectmodel {

WebDriver driver;

PageObjectmodel(WebDriver driver){
	this.driver=driver;
}


public WebElement email() {
	WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
	return email;
}
public void setdata(String value) {
	
	email() .sendKeys(value);
	
}

public WebElement password() {
	WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
	return pass;
}
public void setpW(String value) {
	
	password() .sendKeys(value);
	
}

public WebElement login() {
	WebElement log=driver.findElement(By.xpath("//button[@name='login']"));
	return log;
}

public void clicking() {
	login().click();
}
}
