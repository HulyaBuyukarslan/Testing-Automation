package stepdefinitions.MyAccountLoginStepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.MyAccountLoginPage;
import utilities.ConfigReader;

public class Login3_StepDefinitions {
    MyAccountLoginPage myAccountLoginPage = new MyAccountLoginPage();

    @Then("user enter correct username in username textbox")
    public void userEnterCorrectUsernameInUsernameTextbox() {
        myAccountLoginPage.username_login.sendKeys(ConfigReader.getProperty("email"));

    }
    @Then("user enter empty password in the password textbox")
    public void user_enter_empty_password_in_the_password_textbox() {
        myAccountLoginPage.password_login.sendKeys(" ");

    }

    @Then("user must verify error message \\(Invalid password)")
    public void userMustVerifyErrorMessageInvalidPassword() {
    }
}
