package StepsDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import drivers.Driver;
import org.junit.Assert;


public class stepsDef {


    @Given("^I open browser (\\w*)")
    public void iOpenBrowserChrome(String browser) throws Throwable {
//        if (browser.equals("Chrome")) {
//            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe/");
//            driver = new ChromeDriver();
//        } else if (browser.equals("Firefox")) {
//            System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
//            driver = new FirefoxDriver();
//        }
    }

    @When("^I open i.ua site$")
    public void iOpenGoogleSite() throws Throwable {
        Driver.myDriver.get("https://www.i.ua/");
    }

    @Then("^I see (\\w*) site$")
    public void iSeeIUASite(String title) throws Throwable {
        Assert.assertEquals(title, Driver.myDriver.getTitle());
    }

}
