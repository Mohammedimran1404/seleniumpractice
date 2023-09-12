package runningTestCasesParallelAndcrossbrowsusinddiffclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassC {
	@Test(priority=3)
	public void launchurl2() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("imran");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("imran");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		System.out.println("the thread of m3 is :"+Thread.currentThread().getId());

		driver.close();
}
}
