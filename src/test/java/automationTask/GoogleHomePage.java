package automationTask;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class GoogleHomePage {
	public WebDriver driver;
	public GoogleHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	// click on settings
	@FindBy(xpath="//div[text()='Settings']") WebElement settings;
	//click on advancedsearch
	@FindBy(linkText = "Advanced search")WebElement advancedsearch;
	// all these word send keys
	@FindBy(xpath = "//input[@id='xX4UFf']")WebElement allthesewords;
	//sendkeys
	@FindBy(xpath = "//input[@id='CwYCWc']")WebElement thisexactwords;
	//sendkeys
	@FindBy(xpath = "//input[@id='mSoczb']")WebElement anyofthiswords;
	//sendkeys
	@FindBy(xpath = "//input[@id='mSoczb']/following::input[1]")WebElement noneofthesewords;
	//sendkeys
	@FindBy(xpath = "//input[@id='LK5akc']")WebElement numberrangingfrom;
	//sendkeys
	@FindBy(xpath ="//input[@name='as_nhi']")WebElement numberrangingto;
	//click or dropdown
	@FindBy(xpath="//div[@id='lr_button']")WebElement language;
	@FindBy(xpath = "//li[@id=':d']/child::div")WebElement clickonparticularlanguage;
	
	@FindBy(xpath="//div[@id='cr_button']")WebElement region;
	@FindBy(xpath="//li[@id=':44']/child::div")WebElement particularregion;
	
	@FindBy(xpath = "//div[@id='as_qdr_button']")WebElement lastupdate;
	@FindBy(xpath = "//li[@id=':80']/child::div")WebElement particularlastupdate;
	//sendkeys
	@FindBy(xpath = "//input[@id='NqEkZd']")WebElement siteordomain;
	
	@FindBy(xpath="//div[@id='as_occt_button']")WebElement termsappearing;
	@FindBy(xpath="//li[@id=':85']/child::div")WebElement particulartermsappearing;
	
	@FindBy(xpath = "//div[@id='as_rights_button']")WebElement usagerights;
	@FindBy(xpath = "//li[@id=':8d']/child::div")WebElement particularusagerights;
	//click
	@FindBy(xpath="//div[@id='as_rights_button']/following::div[5]/child::input[2]")WebElement advancedsearchbtn;
	
	
	public void clickOnSettings() {
		settings.click();
	}
	public void clickOnAdvancedSearch() {
		advancedsearch.click();
	}
	public void valiDation() {
		if("Google Advanced Search".equals(driver.getTitle())) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	public void allTheseWords(String allwords) {
		allthesewords.sendKeys(allwords);
	}
	public void thisExactWords(String exactwords) {
		thisexactwords.sendKeys(exactwords);
	}
	public void anyOfThisWords(String thiswords) {
		anyofthiswords.sendKeys(thiswords);
	}
	public void noneOfTheseWords(String nonewords) {
		noneofthesewords.sendKeys(nonewords);
	}
	public void numberRangingFrom(String numberrange) {
		numberrangingfrom.sendKeys(numberrange);
	}
	public void numberRangingTo(String numberto) {
		numberrangingto.sendKeys(numberto);
	}
	public void lanGuage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "language");
		language.click();
		clickonparticularlanguage.click();
	}
	public void reGion() {
		region.click();
		particularregion.click();
	}
	public void lastUpdate() {
		lastupdate.click();
		particularlastupdate.click();
	}
	public void siteOrDomain(String site) {
		siteordomain.sendKeys(site);
	}
	public void termsAppearing() {
		termsappearing.click();
		particulartermsappearing.click();
	}
	public void usageRights() {
		usagerights.click();
		particularusagerights.click();
	}
	public void advancedSearchButton() {
		advancedsearchbtn.click();
	}
	
	
	
}
