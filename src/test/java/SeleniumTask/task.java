package SeleniumTask;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task {

	public static void main(String[] args) throws AWTException, InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
	WebDriverManager.chromedriver().setup();
	// Launch Browser
	WebDriver driver = new ChromeDriver(options);
	driver.get("https://www.google.com");
	// maximizing window
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	// Entering text as "Outlook login"
	By searchBoxL= By.xpath("//textarea[@id='APjFqb']");
	WebElement searchbox = driver.findElement(searchBoxL);
	searchbox.sendKeys("Outlook login");
	 // robot class for keyboard action to click enter
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	// click on outlook mail link
	By outlookmailL= By.xpath("//h3[text()='Outlook – free personal email and calendar from Microsoft']");
	WebElement outlookmail = driver.findElement(outlookmailL);
	outlookmail.click();
	// click sign in button
		By signinL= By.linkText("Sign in");	
		WebElement signin = driver.findElement(signinL);
	signin.click();
	// Entering outlook mail in to email text box
	By mailL= By.xpath("//input[@name='loginfmt']")	;
	WebElement mail = driver.findElement(mailL);
    mail.sendKeys("imran.m@kairostech.com");
    // Clicking on nextbtn
    By nextbtnL = By.xpath("//input[contains(@class,'win-button')]");
    WebElement nextbtn = driver.findElement(nextbtnL);
    nextbtn.click();
 // Entering pass in to pass text box
    Thread.sleep(1000);
    By passL= By.xpath("//input[contains(@name,'passwd')]")	;
	WebElement pass = driver.findElement(passL);
    pass.sendKeys("Mohammed@7866");
    // clicking on signbtn
    By signbtnL = By.xpath("//input[contains(@class,'win-button')]");
    WebElement signbtn = driver.findElement(signbtnL);
    signbtn.click();
    // Clicking on textmsg
    By textmsgL = By.xpath("//div[contains(text(),'Text')]");
    WebElement textmsg = driver.findElement(textmsgL);
    textmsg.click();
   
    Thread.sleep(20000);
   
    // Clicking on verifybtn
    By verifybtnL = By.xpath("//input[contains(@id,'idSubmit')]");
    WebElement verifybtn = driver.findElement(verifybtnL);
    verifybtn.click();
    
    //Clicking on check box
    By checkboxL = By.xpath("//input[@id='KmsiCheckboxField']");
    WebElement checkbox = driver.findElement(checkboxL);
    checkbox.click();
    
    //Clicking on yesbtn
    By yesbtnL = By.xpath("//input[@id='idSIButton9']");
  WebElement yesbtn = driver.findElement(yesbtnL);
  yesbtn.click();
    // validating title
    String title= driver.getTitle();
   SoftAssert softassert = new SoftAssert();
   softassert.assertEquals(title,"Mail - Imran Mohd - Kairos - Outlook" );

   
    Thread.sleep(2000);
    //Clicking sentitems
    By sentitemsL = By.xpath("//span[text()='Sent Items']");
    WebElement sentitems = driver.findElement(sentitemsL);
    sentitems.click();
    // reteriving sent items subject
    By senditemsboxL = By.xpath("//div[@class='IjzWp XG5Jd gy2aJ Ejrkd']");
    List<WebElement> senditemsbox=driver.findElements(senditemsboxL);
    //for(WebElement ele :senditemsbox) {
    for(int i=0;i<10;i++) {
    	System.out.println(senditemsbox.get(i).getText());
    }
    // going back to window
    driver.navigate().to("https://www.google.com");
    By searchBox1L= By.xpath("//textarea[@id='APjFqb']");
	WebElement searchbox1 = driver.findElement(searchBox1L);
	searchbox1.sendKeys(" i am done");
	searchbox1.sendKeys(Keys.ENTER);
	System.out.println("program terminated");
	softassert.assertAll();
	// Closing the browser
	driver.close();
	}

}
