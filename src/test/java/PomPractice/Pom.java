package PomPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {
	WebDriver driver;
	Pom(WebDriver driver){
		this.driver=driver;
	
		PageFactory.initElements(driver,this);
	}

		@FindBy(xpath="//a[text()='Sign in']")public WebElement sign;
		@FindBy(xpath="//input[@id='login1']")WebElement user;
		@FindBy(xpath="//input[@id='password']")WebElement pass;
		@FindBy(xpath="//input[@name='proceed']")WebElement actions;
		

		
	}


