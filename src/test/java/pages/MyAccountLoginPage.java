package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MyAccountLoginPage {
    public MyAccountLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='My Account']")
    public WebElement myAccount;

    @FindBy(id = "username")
    public WebElement username_login;

    @FindBy (xpath = "//*[@id='password']")
    public WebElement password_login;

    @FindBy (xpath = "//*[@name='login']")
    public WebElement loginbutton;

    @FindBy (xpath = "//*[text()='Sign out']")
    public WebElement signout_text;

    @FindBy (xpath = "//*[text()='Error']")
    public WebElement error_message;

    @FindBy(xpath = "//*[text()='Error:']")
    public WebElement error_message1;

    @FindBy(xpath = "//*[text()='Login']")
    public WebElement login_title;






}
