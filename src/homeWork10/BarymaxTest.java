package homeWork10;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class BarymaxTest {
    WebDriver driver;

    @Before
    public void beforeTest(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://bayramix.com.ua/");

    }

    @After
    public void afterTest(){
        driver.quit();
    }


    @Test
    public void testAmountOfImages(){
        Actions actions = new Actions(driver);

        WebElement notebookTab = driver.findElement(By.xpath("//*[@data-title='Ноутбуки и компьютеры']"));
        actions.pause(3000).moveToElement(notebookTab).pause(3000).perform();

        WebElement asusTab = driver.findElement(By.xpath("//*[@href='https://rozetka.com.ua/notebooks/asus/c80004/v004/']"));
        actions.moveToElement(asusTab).click().perform();
    }

}
