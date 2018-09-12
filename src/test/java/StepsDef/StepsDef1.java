package StepsDef;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import drivers.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class StepsDef1 {
    @When("^I enter (\\w*)")
    public void iEnterName(String word) throws Throwable {
        Driver.myDriver.findElement(By.xpath("/html/body/div[3]/div[3]/div[3]/div[2]/div[1]/div[3]/form/ul/li[1]/p[2]/input")).sendKeys(word + Keys.ENTER);

    }
    @When("^I enter (\\w*)")
    public void iEnterPassword(String word) throws Throwable {
        Driver.myDriver.findElement(By.name("pass")).sendKeys(word + Keys.ENTER);

        }
    @Then("^I see result (\\w*)$")
    public void iSeeResultTable(String word) throws Throwable {
        WebDriverWait wait=new WebDriverWait(Driver.myDriver, 10);
        wait.until(ExpectedConditions.textToBe(By.id("irchikignatieva@i.ua"),word));
//        Assert.assertEquals(word, Driver.myDriver.findElement(By.id("lst-ib")).getText());
    }
}