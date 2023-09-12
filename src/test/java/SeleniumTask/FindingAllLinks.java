package SeleniumTask;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindingAllLinks {
    public static void main(String[] args) throws AWTException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.ebay.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        By liL = By.xpath("(//div[@class='hl-image hl-image-js js-only hl-item__bg-image'])[6]");

        if (isElementDisplayed(driver, liL)) {
            scrollToElement(driver, liL);
        }

        By allLinksL = By.tagName("a");
        List<WebElement> allLinks = driver.findElements(allLinksL);
        for (WebElement link : allLinks) {
            if (link.isDisplayed()) {
                System.out.println(link.getText());

                Actions action = new Actions(driver);
                action.contextClick(link).build().perform();

                Robot robo = new Robot();
                robo.keyPress(KeyEvent.VK_DOWN);
                robo.keyRelease(KeyEvent.VK_DOWN);

                robo.keyPress(KeyEvent.VK_ENTER);
                robo.keyRelease(KeyEvent.VK_ENTER);
                String currentwindowid = driver.getWindowHandle();
                Set<String> allwindowhandleid = driver.getWindowHandles();
                for (String ele : allwindowhandleid) {
                    if (!ele.equals(currentwindowid)) {
                        driver.switchTo().window(ele);
                        Thread.sleep(2000);
                        driver.close();
                    }
                }
                driver.switchTo().window(currentwindowid);
            }
        }

        driver.quit();
    }
    
    private static boolean isElementDisplayed(WebDriver driver, By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
    
    private static void scrollToElement(WebDriver driver, By locator) {
        WebElement element = driver.findElement(locator);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'});", element);
    }
}