package Pages;

import Data.UsersData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPageElements {
    UsersData data = new UsersData();

    @FindBy(xpath = "/html/body/div[3]/div[3]/div[3]/div[2]/div[1]/div[3]/form/ul/li[1]/p[2]/input")
    WebElement loginField;

    @FindBy(name = "pass")
    WebElement passwordField;

    @FindBy(xpath = "//input[@value='Войти']")
    WebElement loginBtn;

    @FindBy(className = "sn_menu_title")
    WebElement userEmailOnPage;

    public LogInPageElements(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void fillLogin() {
        loginField.click();
        loginField.sendKeys(data.USER_NAME);
    }

    public void fillPassword() {
        passwordField.sendKeys(data.USER_PASSWORD);
    }

    public void clickLoginBtn()
    {
        loginBtn.click();
    }

    public String getUserEmail () {
        return userEmailOnPage.getText();
    }

}

