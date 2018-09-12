package stepsdef;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import drivers.Driver;

public class SetUp {


    @Before
    public void setUpScenario() {
        drivers.Driver.create();

        System.out.println("set Up");
    }

    @After
    public void tearDownScenario() {
        drivers.Driver.quit();
    }
}
