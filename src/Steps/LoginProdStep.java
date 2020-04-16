package Steps;

import cucumber.api.java.en.And;

public class LoginProdStep {


    @And("^user validates the captcha image$")
    public void user_validates_the_captcha_image() throws Throwable {

        System.out.println("@And -- user validates the captcha image");
    }
}
