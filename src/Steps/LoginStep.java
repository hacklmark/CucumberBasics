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

    @Then("^user entered \"([^\"]*)\" username$")
    public void user_entered_valid_username(String username) throws Throwable {

        System.out.println("@Then -- User entered "+username+" username");
    }

    @Then("^user entered \"([^\"]*)\" password$")
    public void user_entered_valid_password(String password) throws Throwable {

        System.out.println("@And -- User entered "+password+" password");
    }

    @Then("^user \"([^\"]*)\" successfully logged in$")
    public void user_shouldbe_successfully_logged_in(String validateLogin) throws Throwable {

        System.out.println("@Then -- User "+validateLogin+" successfully logged in");
    }

}
