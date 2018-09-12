package Tests;

import Data.UsersData;
import Pages.LogInPageElements;
import org.openqa.selenium.By;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LogInMain {

    public static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);

        driver.get("https://www.i.ua/");
    }

    @Test
    public void userLogin() {

        LogInPageElements logInPageElements = new LogInPageElements(driver);
        UsersData data = new UsersData();

        logInPageElements.fillLogin();
        logInPageElements.fillPassword();
        logInPageElements.clickLoginBtn();

        Assert.assertEquals(logInPageElements.getUserEmail(), data.USER_EMAIL);
    }


    @AfterClass
    public static void tearDown()
    {
        WebElement menuUser = driver.findElement(By.className("ho_logo"));
        menuUser.click();
        WebElement logoutButton = driver.findElement(By.linkText("Выход"));
        logoutButton.click();
        driver.quit();
    }
}