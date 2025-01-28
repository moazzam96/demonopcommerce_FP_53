package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_Login;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_Login {

    P02_Login login = new P02_Login();

    @When("user go to login page")
    public void UserGoTLoginPage() {
        login.LoginPage.click();
    }

    @And("user login with valid {string} and {string}")
    public void userLoginWithValidAnd(String Email, String Password) {
        login.email.sendKeys(Email);
        login.password.sendKeys(Password);
    }

    @And("user login with invalid {string} and {string}")
    public void userLoginWithInvalidAnd(String Email, String Password) {
        login.email.sendKeys(Email);
        login.password.sendKeys(Password);
    }

    @And("user press on login button")
    public void userPressOnLoginButton() {
        login.loginButton.click();
    }

    @Then("user login to the system successfully")
    public void UserLoginToTheSystemSuccessfully() {
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(login.loginLink, "https://demo.nopcommerce.com/");
        System.out.println(login.loginLink);
        soft.assertTrue(login.myAccount.isDisplayed());
        soft.assertAll();
    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        String unsuccessful = login.unsuccessful.getText();
        String text = "Login was unsuccessful.";
        String expColour = "#e4434b";
        String colourRgba = login.accColour.getCssValue("color");
        String accColour = Color.fromString(colourRgba).asHex();
        boolean errorMsg = unsuccessful.contains(text);
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(errorMsg, text);
        soft.assertEquals(expColour, accColour);
        System.out.println(text);
        System.out.println(accColour);
        soft.assertAll();
    }

}
