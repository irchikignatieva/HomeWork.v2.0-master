package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver{
    public static WebDriver myDriver;
    public static void create(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe/");
        myDriver = new ChromeDriver();
    }

    public static void quit(){
        myDriver.quit();
    }
}