package com.cydeo.step_definitions;

import com.cydeo.pages.DropDownPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MonthDropDownStepDefinition {

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown ");



    }

    DropDownPage dropDownPage = new DropDownPage();

    @Then("User should see below info in month dropdown")
    public void userShouldSeeBelowInfoInMonthDropdown(List<String> expectedMonths) {


        Select select = new Select(dropDownPage.monthDropdown);
        List<WebElement> actual =  select.getOptions();
        List<String> actualAsString = new ArrayList<>();

        for (WebElement each : actual) {
            actualAsString.add(each.getText());

        }

        Assert.assertEquals(expectedMonths, actualAsString);

    }




}
