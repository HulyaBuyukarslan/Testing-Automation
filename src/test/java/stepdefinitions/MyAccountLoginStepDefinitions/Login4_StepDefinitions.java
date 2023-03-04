package stepdefinitions.MyAccountLoginStepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.MyAccountLoginPage;
import utilities.ConfigReader;

public class Login4_StepDefinitions {
    MyAccountLoginPage myAccountLoginPage = new MyAccountLoginPage();

    @Then("user enter empty username in username-textbox")
    public void user_enter_empty_username_in_username_textbox() {
        myAccountLoginPage.username_login.sendKeys(" ");

    }
    @Then("user enter valid password in the password textbox")
    public void user_enter_valid_password_in_the_password_textbox() {
       myAccountLoginPage.password_login.sendKeys(ConfigReader.getProperty("password"));
    }


    @Then("user must verify error message \\(Invalid username)")
    public void userMustVerifyErrorMessageInvalidUsername() {
        Assert.assertTrue(myAccountLoginPage.error_message1.isDisplayed());
    }
}
