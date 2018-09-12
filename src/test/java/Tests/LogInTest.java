package Tests;

import Data.UsersData;
import Pages.LogInPageElements;
import org.junit.Assert;
import org.junit.Test;

public class LogInTest extends LogInMain{


    @Test
    public void userLogin() {

        LogInPageElements logInPageElements = new LogInPageElements(driver);
        UsersData data = new UsersData();

        logInPageElements.fillLogin();
        logInPageElements.fillPassword();
        logInPageElements.clickLoginBtn();

        Assert.assertEquals(logInPageElements.getUserEmail(), data.USER_EMAIL);
    }
}
