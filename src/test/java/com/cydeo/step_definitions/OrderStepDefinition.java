package com.cydeo.step_definitions;

import com.cydeo.pages.OrderPage;
import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class OrderStepDefinition {


    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();
    OrderPage orderPage = new OrderPage();


    @Given("user is already logged in to web table app")
    public void user_is_already_logged_in_to_web_table_app() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
        webTableLoginPage.username.sendKeys("Test");
        webTableLoginPage.password.sendKeys("Tester");
        webTableLoginPage.loginButton.click();
        orderPage.orderButton.click();

    }
    @When("user select product type {string}")
    public void userSelectProductType(String arg0) {
        Select select = new Select(orderPage.product);
        select.selectByVisibleText(arg0);

    }

    @And("user enters Quantity {string}")
    public void userEntersQuantity(String arg0) {
        orderPage.quantity.sendKeys(arg0);
    }

    @And("user enters Customer name {string}")
    public void userEntersCustomerName(String arg0) {
        orderPage.name.sendKeys(arg0);
    }

    @And("user enters Street {string}")
    public void userEntersStreet(String arg0) {
        orderPage.street.sendKeys(arg0);
    }

    @And("user enters City {string}")
    public void userEntersCity(String arg0) {
        orderPage.city.sendKeys(arg0);
    }

    @And("user enters State {string}")
    public void userEntersState(String arg0) {
        orderPage.state.sendKeys(arg0);
    }

    @And("user enters  Zip {string}")
    public void userEntersZip(String arg0) {
        orderPage.zip.sendKeys(arg0);
    }



    @And("user selects credit card type {string}")
    public void userSelectsCreditCardType(String expectedCardType) {
        List<WebElement> allCard = orderPage.cardType;

        for (WebElement each : allCard) {

            if (each.getAttribute("value").equalsIgnoreCase(expectedCardType)){
                each.click();

            }

        }

    }


    @And("user enters credit card number {string}")
    public void userEntersCreditCardNumber(String arg0) {
        orderPage.cardNo.sendKeys(arg0);
    }

    @And("user enters expiry date {string}")
    public void userEntersExpiryDate(String arg0) {
        orderPage.ExpiryDate.sendKeys(arg0);
    }

    @And("user clicks to Process Order button")
    public void userClicksToProcessOrderButton() {
        orderPage.processOrder.click();
    }

    @Then("user should see {string} in first row of the web table")
    public void userShouldSeeInFirstRowOfTheWebTable(String arg0) {


        Assert.assertEquals(orderPage.verify.getText(), arg0);

    }
}
