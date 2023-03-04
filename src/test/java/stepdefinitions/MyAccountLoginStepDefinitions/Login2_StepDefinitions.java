package stepdefinitions.MyAccountLoginStepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.MyAccountLoginPage;

public class Login2_StepDefinitions {

    MyAccountLoginPage myAccountLoginPage = new MyAccountLoginPage();

    @Then("user enter incorrect username in username textbox")
    public void userEnterIncorrectUsernameInUsernameTextbox() {
        myAccountLoginPage.username_login.sendKeys("mümtaz");

    }
    @Then("user enter incorrect password in password textbox")
    public void userEnterIncorrectPasswordInPasswordTextbox() {
        myAccountLoginPage.password_login.sendKeys("12345");

    }
    @Then("user must verify error message Invalid username")
    public void userMustVerifyErrorMessageInvalidUsername() {
        Assert.assertTrue(myAccountLoginPage.error_message.isDisplayed());
    }
}
