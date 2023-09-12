package automationTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signInFunctionality {
	public WebDriver driver;
	
	public signInFunctionality(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[text()='Sign in']")WebElement signbtn;
	@FindBy(xpath = "//input[@id='identifierId']")WebElement emaillogin;
	
	

}
