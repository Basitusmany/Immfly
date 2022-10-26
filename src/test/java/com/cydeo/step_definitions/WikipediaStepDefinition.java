package com.cydeo.step_definitions;

import com.cydeo.pages.WikipediaSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class WikipediaStepDefinition {


    WikipediaSearchPage wikipediaSearchPage = new WikipediaSearchPage();
    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org");
    }
    @When("User types {string} in the wiki search box")
    public void userTypesInTheWikiSearchBox(String arg0) {

        WebElement search = wikipediaSearchPage.searchInput;
        search.sendKeys(arg0 );

    }
    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikipediaSearchPage.searchButton.click();

    }

    @Then("User sees {string} is in the wiki title")
    public void userSeesIsInTheWikiTitle(String arg0) {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = arg0;
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    @Then("User sees {string} is in the main header")
    public void userSeesIsInTheMainHeader(String arg0) {
        String actualTitle = wikipediaSearchPage.headlineTitle.getText();
        String expectedTitle = arg0;
        Assert.assertEquals(expectedTitle, actualTitle);

    }

    @Then("User sees {string} is in the image header")
    public void userSeesIsInTheImageHeader(String arg0) {
        String actualTitle = wikipediaSearchPage.imageTitleName.getText();
        String expectedTitle = arg0;
        Assert.assertEquals(expectedTitle, actualTitle);

    }
}

