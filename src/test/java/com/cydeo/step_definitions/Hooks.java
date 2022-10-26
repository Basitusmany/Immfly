package com.cydeo.step_definitions;


import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.apache.hc.core5.reactor.Command;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    //import from io.cucumber.java
    @Before(order = 1)
    public void setupScenarios(){
        System.out.println("====setting up browser using cucumber @Before");
    }

    @Before(value = "@login", order = 2)
    public void setupScenariosForLogins(){
        System.out.println("====this will only apply to scenario with @login");
    }
    @Before(value= "@db", order = 0)
    public void setupScenariosForDataBase(){
        System.out.println("====this will only apply to scenario with @db");
    }

    @After
    public void teardownScenario(Scenario scenario){

        if (scenario.isFailed()){

            byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }

        //BrowserUtils.sleep(1);
        Driver.closeDriver();

    }

    @BeforeStep
    public void setup(){
        System.out.println("--------> applying setup using @BeforeStep");

    }

    @AfterStep
    public void afterStep(){
        System.out.println("--------> applying teardown using @AfterStep");
    }




}
