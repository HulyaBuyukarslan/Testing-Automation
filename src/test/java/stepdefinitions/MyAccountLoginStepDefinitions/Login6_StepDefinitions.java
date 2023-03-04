package stepdefinitions.MyAccountLoginStepDefinitions;

import io.cucumber.java.en.Then;
import pages.MyAccountLoginPage;
import utilities.ReusableMethods;

import java.io.IOException;

public class Login6_StepDefinitions {
    MyAccountLoginPage myAccountLoginPage = new MyAccountLoginPage();

    @Then("user enter the password field with some characters.")
    public void user_enter_the_password_field_with_some_characters() {
        myAccountLoginPage.password_login.sendKeys("abshsussg");

    }
    @Then("The password field should display the characters in asterisks")
    public void thePasswordFieldShouldDisplayTheCharactersInAsterisks() throws IOException {
        ReusableMethods.takeScreenShotOfPage();
    }
}
