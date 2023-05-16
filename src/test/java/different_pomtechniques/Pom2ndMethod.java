package different_pomtechniques;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Pom2ndMethod {
	WebDriver driver;
	

	Pom2ndMethod(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "REGISTER")private WebElement registerlink;
	@FindBy(xpath = "//input[@name='firstName']")private WebElement firstname;
	@FindBy(xpath = "//input[@name='lastName']")private WebElement lastname;
	@FindBy(xpath = "//input[@name='phone']")private WebElement phonenum;
	@FindBy(xpath = "//input[@id='userName']")private WebElement emailid;
	@FindBy(xpath = "//input[@name='address1']")private WebElement address;
	@FindBy(xpath = "//input[@name='city']")private WebElement city;
	@FindBy(xpath = "//input[@name='state']")private WebElement state;
	@FindBy(xpath = "//input[@name='postalCode']")private WebElement postalcode;
	@FindBy(xpath = "//select[@name='country']")private WebElement country;
	@FindBy(xpath = "//input[@name='email']")private WebElement emailforconfirm;
	@FindBy(xpath = "//input[@name='password']")private WebElement password;
	@FindBy(xpath = "//input[@name='confirmPassword']")private WebElement cpassword;
	@FindBy(xpath = "//input[@name='submit']")private WebElement submitbtn;
	
	public void registerLink() {
		registerlink.click();
	}
	public void firstName(String fname) {
		firstname.sendKeys(fname);
	}
	public void lastName(String lname) {
		lastname.sendKeys(lname);
	}
	public void phoneNumber(String pnum) {
		phonenum.sendKeys(pnum);
	}
	public void emailId(String eid) {
		emailid.sendKeys(eid);
	}
	public void addresS(String add) {
		address.sendKeys(add);
	}
	public void citY(String cit) {
		city.sendKeys(cit);
	}
	public void statE(String st) {
		state.sendKeys(st);
	}
	public void postalCode(String postal) {
		postalcode.sendKeys(postal);
	}
	public void countrY(String coun) {
		Select sele = new Select(country);
		sele.selectByVisibleText(coun);	
	}
	public void email(String emailid) {
		emailforconfirm.sendKeys(emailid);
	}
	public void passwoerD(String pass) {
		password.sendKeys(pass);
	}
	public void cpassword(String cpass) {
		cpassword.sendKeys(cpass);
	}
	public void sbtn() {
		submitbtn.click();
	}


}
	
