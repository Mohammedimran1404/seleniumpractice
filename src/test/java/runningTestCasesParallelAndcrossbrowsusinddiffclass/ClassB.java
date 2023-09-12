package runningTestCasesParallelAndcrossbrowsusinddiffclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassB {
	@Test(priority=2)
	public void launchurl1() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("imran");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("imran");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		System.out.println("the thread of m2 is :"+Thread.currentThread().getId());

		driver.close();
	}
}
