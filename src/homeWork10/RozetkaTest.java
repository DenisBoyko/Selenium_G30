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



public class RozetkaTest {
    WebDriver driver;

    @Before
    public void beforeTest(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://rozetka.com.ua/");

    }

    @After
    public void afterTest(){
        driver.quit();
    }


    @Test
    public void testChoseAsusNotebook(){
        Actions actions = new Actions(driver);

        WebElement notebookTab = driver.findElement(By.xpath("//*[@data-title='Ноутбуки и компьютеры']"));
        actions.pause(3000).moveToElement(notebookTab).pause(3000).perform();

        WebElement asusTab = driver.findElement(By.xpath("//*[@href='https://rozetka.com.ua/notebooks/asus/c80004/v004/']"));
        actions.moveToElement(asusTab).click().perform();
    }

    @Test
    public void outOfTextWishList(){
        Actions actions = new Actions(driver);

        WebElement wishList = driver.findElement(By.cssSelector("#wishlist"));
        actions.moveToElement(wishList).pause(1000).perform();

        String textInWishList = driver.findElement(By.xpath("//*[@class='header-popup header-popup-wishlist-empty sprite-side']")).getText();
        System.out.println(textInWishList);




    }


}
