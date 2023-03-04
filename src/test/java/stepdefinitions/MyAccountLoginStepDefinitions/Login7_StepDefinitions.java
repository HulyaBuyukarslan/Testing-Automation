package stepdefinitions.MyAccountLoginStepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.MyAccountLoginPage;

public class Login7_StepDefinitions {

    MyAccountLoginPage myAccountLoginPage = new MyAccountLoginPage();

    @Then("user the case changed username in username textbox")
    public void user_the_case_changed_username_in_username_textbox() {
        myAccountLoginPage.username_login.sendKeys("MUMTAZ_NURAN@GMAİL.COM");

    }
    @Then("the case chenged password in the password tetxbox")
    public void the_case_chenged_password_in_the_password_tetxbox() {
        myAccountLoginPage.password_login.sendKeys("hUZUR123*");

    }
    @Then("login must fail saying incorrect username and password.")
    public void loginMustFailSayingIncorrectUsernameAndPassword() {
        Assert.assertTrue(myAccountLoginPage.error_message.isDisplayed());
    }
}
