package com.cydeo.step_definitions;

import com.cydeo.pages.Googlepage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class GoogleStepDefinition {

    Googlepage googlepage =new Googlepage();

    @When("user types {string} and clicks enter")
    public void user_types_and_clicks_enter(String string) {
        googlepage.googleSearchInput.sendKeys(string +Keys.ENTER);


    }
    @Then("user sees {string} in the google title")
    public void user_sees_in_the_google_title(String string) {

        String actualTitle2 = Driver.getDriver().getTitle();
        String expected1 = string;

        Assert.assertTrue(actualTitle2.contains(expected1));

    }

    @When("user is on Google search page")
    public void user_is_on_google_search_page() {

        Driver.getDriver().get("https://www.google.com");
        Googlepage Googlepage = new Googlepage();
        Googlepage.acceptAlert.click();


    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        String actualTitle = Driver.getDriver().getTitle();
        String expected = "Google";

        Assert.assertEquals(actualTitle,expected);
    }

    @When("user types apple and clicks enter")
    public void userTypesAppleAndClicksEnter() {
        Googlepage GooglePage = new Googlepage();
        GooglePage.googleSearchInput.sendKeys("apple"+ Keys.ENTER);

    }
    @Then("user sees apple in the google title")
    public void userSeesAppleInTheGoogleTitle() {
        String actualTitle1 = Driver.getDriver().getTitle();
        String expected1 = "apple";

        Assert.assertTrue(actualTitle1.contains(expected1));

    }




}
