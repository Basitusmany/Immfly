package com.immfly.step_definitions;


import com.immfly.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Hooks {



    @After
    public void teardownScenario(Scenario scenario){
        Driver.closeDriver();
    }




}
