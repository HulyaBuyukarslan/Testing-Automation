package stepdefinitions.MyAccountLoginStepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.MyAccountLoginPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class Login8_StepDefinitions {
    MyAccountLoginPage myAccountLoginPage = new MyAccountLoginPage();

    @Then("Once user logged in, sign out of the site")
    public void once_user_logged_in_sign_out_of_the_site() {
        ReusableMethods.clickByJS(myAccountLoginPage.signout_text);

    }
    @Then("user press back button")
    public void user_press_back_button() {
        Driver.getDriver().navigate().back();

    }
    @Then("user shouldn’t be signed in to his account rather a general webpage must be visible")
    public void user_shouldn_t_be_signed_in_to_his_account_rather_a_general_webpage_must_be_visible() {
        Assert.assertTrue(myAccountLoginPage.login_title.isDisplayed());

    }

}
