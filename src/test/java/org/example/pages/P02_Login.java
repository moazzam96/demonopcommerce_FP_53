package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepDefs.Hooks.driver;

public class P02_Login {

    @FindBy(className = "ico-login")
    public WebElement LoginPage;
    @FindBy(id = "Email")
    public WebElement email;
    @FindBy(id = "Password")
    public WebElement password;
    @FindBy(className = "login-button")
    public WebElement loginButton;
    public String loginLink = driver.getCurrentUrl();
    @FindBy(className = "ico-account")
    public WebElement myAccount;
    @FindBy(xpath = "//div[@class=\"message-error validation-summary-errors\"]")
    public WebElement unsuccessful;
    @FindBy(xpath = "//div[@class=\"message-error validation-summary-errors\"]")
    public WebElement accColour;

    public P02_Login() {
        PageFactory.initElements(driver, this);
    }


}
