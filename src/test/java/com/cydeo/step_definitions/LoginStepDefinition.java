package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println("user Enter");

    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("user Enter");

    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("user see");

    }
    @When("user enters student username")
    public void user_enters_student_username() {
        System.out.println("user Enter");

    }
    @When("user enters student password")
    public void user_enters_student_password() {
        System.out.println("user Enter");

    }
    @When("user enters admin username")
    public void user_enters_admin_username() {
        System.out.println("user Enter");

    }
    @When("user enters admin password")
    public void user_enters_admin_password() {
        System.out.println("user Enter");

    }
    @Given("user is on the library login page")
    public void userIsOnTheLibraryLoginPage() {
        System.out.println("user is on the library page");
    }
}


