package Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {

    @Given("^user navigates to facebook website$")
    public void user_navigates_to_facebook_website() throws Throwable {

        System.out.println("@Given -- User navigates to Facebook.com");
    }

    @When("^user validates the homepage title$")
    public void user_validates_the_homepage_title() throws Throwable {

        System.out.println("@When -- User validates the home page title");
    }

    @Then("^user enter the username$")
    public void user_enter_the_username() throws Throwable {

        System.out.println("@Then -- User enter the username");
    }

    @Then("^user enter the password$")
    public void user_enter_the_password() throws Throwable {

        System.out.println("@And -- User enter the password");
    }

    @Then("^user should be succesfully logged in$")
    public void user_should_be_succesfully_logged_in() throws Throwable {

        System.out.println("@Then -- User should be succesfully logged in");
    }
}
