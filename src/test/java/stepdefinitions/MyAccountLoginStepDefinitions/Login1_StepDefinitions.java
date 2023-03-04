package stepdefinitions.MyAccountLoginStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.MyAccountLoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Login1_StepDefinitions {
    MyAccountLoginPage myAccountLoginPage = new MyAccountLoginPage();

    @Given("user go to {string}")
    public void user_go_to(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("url"));

    }
    @When("user click on My Account Menu")
    public void user_click_on_my_account_menu() {
        ReusableMethods.clickByJS(myAccountLoginPage.myAccount);

    }
    @Then("user enter registered username in username textbox")
    public void userEnterRegisteredUsernameInUsernameTextbox() {
        myAccountLoginPage.username_login.sendKeys(ConfigReader.getProperty("email"));
    }

    @Then("user enter password in password textbox")
    public void userEnterPasswordInPasswordTextbox() {
        myAccountLoginPage.password_login.sendKeys(ConfigReader.getProperty("password"));
    }

    @Then("user click on login button")
    public void user_click_on_login_button() {
       ReusableMethods.clickByJS(myAccountLoginPage.loginbutton);

    }
    @Then("user must successfully login to the web page")
    public void user_must_successfully_login_to_the_web_page() {
        Assert.assertTrue(myAccountLoginPage.signout_text.isDisplayed());

    }

    @And("user close driver")
    public void userCloseDriver() {
        Driver.closeDriver();
    }



}
