package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.asserts.SoftAssert;

import static org.example.stepDefs.Hooks.driver;

public class D06_homeSliders {
    P03_homePage home = new P03_homePage();
    SoftAssert soft = new SoftAssert();

    //Scenario 1
    @When("User select on First Slider home page")
    public void iconClicking() {
        home.homeIcon().get(1).click();
    }

    @And("User click on First selected Slider")
    public void userClickOnFirstSelectedSlider() {
        home.sliders().get(1).click();
    }

    @Then("User should be directed into First product link")
    public void userShouldBeDirectedIntoFirstProductLink() {
        soft.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/nokia-lumia-1020");

        soft.assertAll();
    }


    //Scenario 2

    @When("User select on Second Slider home page")
    public void userSelectOnSecondSliderHomePage() {
        home.homeIcon().get(0).click();
    }

    @And("User click on Second selected Slider")
    public void userClickOnSecondSelectedSlider() {
        home.sliders().get(0).click();
    }

    @Then("User should be directed into Second product link")
    public void userShouldBeDirectedIntoSecondProductLink() {
        soft.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/iphone-6");

        soft.assertAll();
    }
}
