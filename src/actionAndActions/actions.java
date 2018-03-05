package actionAndActions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class actions {
    WebDriver driver;
    WebElement element;

    @Before
    public void beforeTest(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.ukr.net/");
    }

    @After
    public void afterTest(){
        driver.quit();
    }


    @Test
    public void testActions(){
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
        Action action = actions.moveToElement(element).click().build();
        action.perform();
    }

    @Test
    public void testUkrNet() throws InterruptedException {
        Actions actions = new Actions(driver);
        element = driver.findElement(By.id("search-input"));
        actions.sendKeys(element,"test").pause(3000).perform();

        Action action = actions.sendKeys(element,"test").pause(3000).build();


    }






}
