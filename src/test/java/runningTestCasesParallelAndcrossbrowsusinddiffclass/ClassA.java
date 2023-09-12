package runningTestCasesParallelAndcrossbrowsusinddiffclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassA {
	@Test(priority=1)
	public void launchUrl() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("imran");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("imran");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		System.out.println("the thread of m1 is :"+Thread.currentThread().getId());

		driver.close();
}
}
