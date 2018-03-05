package webDriverTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class WebDriverTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ukr.net/");

        WebElement element;
         element = driver.findElement(By.xpath("my xpath"));

        List<WebElement> elements = driver.findElements(By.xpath("xpath"));

        System.out.println(driver.getPageSource());

        System.out.println(driver.getWindowHandle());
        

        Thread.sleep(2000);

        driver.quit();
    }
}
