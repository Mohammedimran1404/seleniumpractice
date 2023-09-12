package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JsonParserPractice {
	public WebDriver driver;
	public Properties pro;
	
	@DataProvider(name="data")
	public Object[] json() throws IOException, ParseException {
		String path = ".\\Reader\\practice.json";
		JSONParser jsonparser = new JSONParser();
		FileReader reader = new FileReader(path);
		Object obj = jsonparser.parse(reader);
		JSONObject jobj = (JSONObject) obj;
		JSONArray jarray =(JSONArray)jobj.get("users");
		
		Object []array=new Object[jarray.size()];
		
		for(int i=0;i<jarray.size();i++) {
			JSONObject jsobj=(JSONObject)jarray.get(i);
			Object user=(Object) jsobj.get("usersname");
			Object pass=(Object) jsobj.get("password");
			System.out.println(user);
			System.out.println(pass);
			array[i]=user+","+pass;
		}
		return array;
	}
	
	@Test(dataProvider = "data")
	public void facebook(String data) {
		String users[] = data.split(",");
				
		By usernameL=By.xpath("//input[@id='email']");
		WebElement username=driver.findElement(usernameL);
		username.sendKeys(users[0]);
		
		By passL=By.xpath("//input[@id='pass']");
		WebElement pass=driver.findElement(passL);
		pass.sendKeys(users[1]);
		
		

		By btnL=By.xpath("//button[@name='login']");
		WebElement btn=driver.findElement(btnL);
		btn.click();
		
	}
	@BeforeClass
	public void setUp() throws IOException {
		property();
	   String baseurl=prop();
	    
	 
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	


public void property() throws IOException {
	File file = new File(".\\Reader\\prope.properties");
	FileInputStream inputstream = new FileInputStream(file);
	 pro = new Properties();
	pro.load(inputstream);
}
	public String  prop() {
	String Url=pro.getProperty("url");
	System.out.println(Url);
	return Url;
}
	
}
		


