package ValidationsSeleniumPrograms;

import java.time.Duration;
import java.time.Month;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerWithConvertingMonthToNumber {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");

		By exampleL = By.cssSelector("div.demo-list>h2");
		WebElement example = driver.findElement(exampleL);
		JavascriptExecutor javascriptexecutor = (JavascriptExecutor) driver;
		javascriptexecutor.executeScript("arguments[0].scrollIntoView(true)", example);

		driver.switchTo().frame(0);

		By datepickerSearchbarL = By.id("datepicker");
		WebElement datepickerSearchbar = driver.findElement(datepickerSearchbarL);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(datepickerSearchbar));
		datepickerSearchbar.click();

		String targetDateStr = "20,March,2025";
		String[] newDate = targetDateStr.split(",");

		int targetDay = Integer.parseInt(newDate[0]);
		int targetMonth = Month.valueOf(newDate[1].toUpperCase()).getValue(); // 1 for Jan, 2 for Feb
		int targetYear = Integer.parseInt(newDate[2]);

		By expMonthL = By.cssSelector(".ui-datepicker-month");
		By expYearL = By.cssSelector(".ui-datepicker-year");

		while (true) {
		    String displayedMonth = driver.findElement(expMonthL).getText();
		    int displayedMonthNum = Month.valueOf(displayedMonth.toUpperCase()).getValue();

		    String displayedYear = driver.findElement(expYearL).getText();
		    int displayedYearNum = Integer.parseInt(displayedYear);

		    // Break if the target month and year match
		    if (displayedMonthNum == targetMonth && displayedYearNum == targetYear) {
		        break;
		    }

		    By navigationButton;
		    if (displayedYearNum < targetYear || 
		       (displayedYearNum == targetYear && displayedMonthNum < targetMonth)) {
		        navigationButton = By.cssSelector(".ui-icon-circle-triangle-e"); // Next button
		    } else {
		        navigationButton = By.cssSelector(".ui-icon-circle-triangle-w"); // Previous button
		    }

		    Thread.sleep(1000);
		    driver.findElement(navigationButton).click();
		}

		By monthL = By.xpath(
		    "//table[@class='ui-datepicker-calendar']//tbody//tr//td[not(contains(@class, 'ui-datepicker-other-month'))]"
		);
		List<WebElement> days = driver.findElements(monthL);
		for (WebElement day : days) {
		    if (day.getText().equals(String.valueOf(targetDay))) {
		        day.click();
		        break;
		    }
		}

//			        driver.quit(); 
	}
}
