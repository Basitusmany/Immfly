package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.awt.dnd.DragGestureEvent;
import java.util.Map;

public class WebTableLoginStepDefinition {


    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();


    @Given("user is on the login page of web table app")
    public void user_is_on_the_login_page_of_web_table_app() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
    }
    @When("user enters username {string}")
    public void userEntersUsername(String username) {
        webTableLoginPage.username.sendKeys(username);

    }

    @And("user enters password {string}")
    public void userEntersPassword(String password) {
        webTableLoginPage.password.sendKeys(password);
    }

    @When("user click to login button")
    public void user_click_to_login_button() {
        webTableLoginPage.loginButton.click();

    }
    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {
    }

    @Then("user should see url contains {string}")
    public void userShouldSeeUrlContains(String urlContains) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(urlContains));


    }
    @When("User enters below credentials")
    public void user_enters_below_credentials(Map<String,String> credential) {
        webTableLoginPage.username.sendKeys(credential.get("username"));
        webTableLoginPage.password.sendKeys(credential.get("password"));
        webTableLoginPage.loginButton.click();

    }

}
