package automatedFacebookUsingPom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {

	WebDriver driver;
	
	Pom(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements( driver, this);//if we are not give init elements it will return the null value. 
	}
	@FindBy(id="email")WebElement Emailaddress;
	@FindBy(xpath="//input[@id='pass']")WebElement Password;
	@FindBy(xpath="//button[@type='submit']")WebElement login;
	
	public void emailAddress(String eid) {
		Emailaddress.clear();
		Emailaddress.sendKeys(eid);
	}
	public void passWord(String pass) {
		Password.sendKeys(pass);
	}
	public void logIn() {
		login.click();
	}
	


}

