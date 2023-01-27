package com.cydeo.step_definitions;

import com.cydeo.pages.ProductListPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;


public class SortByDropDownStepDefinition {

    ProductListPage productListPage = new ProductListPage();

    @Given("The user is in the product list page")
    public void the_user_is_in_the_product_list_page() {

        Driver.getDriver().get("https://highlifeshop.com/speedbird-cafe");

    }
    @When("scroll down until the user see the Sort By dropdown")
    public void scrollDownUntilTheUserSeeTheSortByDropdown() {

        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", productListPage.sortBy_dropDown);

    }
    @Then("The user should see the page is sorted by position as a default")
    public void the_user_should_see_the_page_is_sorted_by_position_as_a_default() {

        Assert.assertTrue(productListPage.position.isSelected());

    }

    @When("click on Sort By dropdown")
    public void click_on_sort_by_dropdown() {

    }
    @Then("The user should see the following options: {string}, {string}, {string} and {string}")
    public void the_user_should_see_the_following_options_and(String string, String string2, String string3, String string4) {

        Select select = new Select(productListPage.sortBy_dropDown);

        List<String> expectedListOfOptions = new ArrayList<>();
        expectedListOfOptions.add(string);
        expectedListOfOptions.add(string2);
        expectedListOfOptions.add(string3);
        expectedListOfOptions.add(string4);


        List<String> actualListOfOptions = new ArrayList<>();
       List<WebElement> listOfOptions = select.getOptions();

        for (WebElement option : listOfOptions) {
           String options = option.getText();
           actualListOfOptions.add(options);

        }

        Assert.assertEquals(expectedListOfOptions,actualListOfOptions);


    }




}
