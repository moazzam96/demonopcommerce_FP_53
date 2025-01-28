package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D08_Wishlist {
    P03_homePage home = new P03_homePage();
    SoftAssert soft = new SoftAssert();

    @When("User clicks on wishlist button on HTC product")
    public void UserClicksOnWishlistButtonOnHTCProduct() throws InterruptedException {
        home.wishlist().get(2).click();
        Thread.sleep(Duration.ofSeconds(3));
    }

    @Then("Verify that success message will be displayed and color of wishlist")
    public void verifyThatSuccessMessageWillBeDisplayedAndColorOfWishlist() throws InterruptedException {
        soft.assertTrue(home.successMsg().isDisplayed());
        soft.assertEquals(home.successMsg().getText(), "The product has been added to your wishlist");
        String RGBAColor = home.successMsg().getCssValue("background-color");
        String HEXColor = Color.fromString(RGBAColor).asHex();
        soft.assertEquals(HEXColor, "#4bb07a");
        System.out.println(home.successMsg().getText());
        System.out.println(HEXColor);
        soft.assertAll();
    }

    @And("User clicks on wishlist icon on the top of the page")
    public void userClicksOnWishlistIconOnTheTopOfThePage() {
        //    WebDriverWait explicit = new WebDriverWait(driver, Duration.ofSeconds(7));
        //    explicit.until(ExpectedConditions.invisibilityOf(home.successMsg()));
        home.wishlistIcon().click();
    }

    @Then("Verify that quantity value is increased")
    public void verifyThatQuantityValueIsIncreased() {
        String quantity = home.wishlistQuantity().getAttribute("value");
        soft.assertTrue(Integer.parseInt(quantity) > 0);
        soft.assertAll();
    }


}
