package different_pomtechniques;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Pom1stMethod {
	WebDriver driver;
	Pom1stMethod(WebDriver driver){
		this.driver=driver;
	}
	
	

	By registerlink = By.linkText("REGISTER");
	By firstname = By.xpath("//input[@name='firstName']");
	By lastname = By.xpath("//input[@name='lastName']");
	By phonenumber = By.xpath("//input[@name='phone']");
	By email = By.xpath("//input[@id='userName']");
	By address = By.xpath("//input[@name='address1']");
	By city = By.xpath("//input[@name='city']");
	By state = By.xpath("//input[@name='state']");
	By postalcode = By.xpath("//input[@name='postalCode']");
	By country = By.xpath("//select[@name='country']");
	By username = By.xpath("//input[@name='email']");
	By password = By.xpath("//input[@name='password']");
	By confirmpassword = By.xpath("//input[@name='confirmPassword']");
	By submit=By.xpath("//input[@name='submit']");
	
	public void clickRegisterlink() {
		driver.findElement(registerlink).click();
	}
	public void firstName(String fname) {
		driver.findElement(firstname).sendKeys(fname);
	}
	public void lastName(String lname) {
		driver.findElement(lastname).sendKeys(lname);
	}
	public void phoneNumber(String pnum) {
		driver.findElement(phonenumber).sendKeys(pnum);
	}
	public void emailId(String emailid) {
		driver.findElement(email).sendKeys(emailid);
	}
	public void addresS(String addre) {
		driver.findElement(address).sendKeys(addre);
	}
	public void citY(String cit) {
		driver.findElement(city).sendKeys(cit);

		
	}
	public void statE(String st) {
		driver.findElement(state).sendKeys(st);
	}
	public void postalCode(String code) {
		driver.findElement(postalcode).sendKeys(code);
	}
	public void countrY(String co) {
		WebElement coun=driver.findElement(country);
		Select sele = new Select(coun);
		sele.selectByVisibleText(co);
		
	}
	public void userName(String uname) {
		driver.findElement(username).sendKeys(uname);
	}
	public void passWord(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	public void confirmPassword(String cpass) {
		driver.findElement(confirmpassword).sendKeys(cpass);
	}
	public void submiT() {
		driver.findElement(submit).click();
	}










}
