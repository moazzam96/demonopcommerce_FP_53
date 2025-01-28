package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.ArrayList;

import static org.example.stepDefs.Hooks.driver;

public class D07_followUs {
    P03_homePage home = new P03_homePage();
    SoftAssert soft = new SoftAssert();

    @When("User click on FacebookIcon")
    public void FacebookIconClicking() throws InterruptedException {
        home.socialMedia().get(0).click();
    }

    @Then("User should be directed to Facebook Website")
    public void userShouldBeDirectedToFacebookWebsite() {
        WebDriverWait explicit = new WebDriverWait(driver, Duration.ofSeconds(7));
        explicit.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        System.out.println(driver.getCurrentUrl());
        driver.switchTo().window(tabs.get(1));
        System.out.println(driver.getCurrentUrl());
        soft.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/nopCommerce");
        soft.assertAll();
    }

    @When("User click on TwitterIcon")
    public void TwitterIconClicking() throws InterruptedException {
        home.socialMedia().get(1).click();

    }

    @Then("User should be directed to Twitter Website")
    public void userShouldBeDirectedToTwitterWebsite() {
        WebDriverWait explicit = new WebDriverWait(driver, Duration.ofSeconds(7));
        explicit.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        System.out.println(driver.getCurrentUrl());
        driver.switchTo().window(tabs.get(1));
        System.out.println(driver.getCurrentUrl());
        soft.assertEquals(driver.getCurrentUrl(), "https://x.com/nopCommerce");
        soft.assertAll();
    }

    @When("User click on RSSIcon")
    public void RSSIconClicking() throws InterruptedException {
        home.socialMedia().get(2).click();

    }

    @Then("User should be directed to RSS Website")
    public void userShouldBeDirectedToRSSWebsite() {
        WebDriverWait explicit = new WebDriverWait(driver, Duration.ofSeconds(7));
        explicit.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        System.out.println(driver.getCurrentUrl());
        driver.switchTo().window(tabs.get(1));
        System.out.println(driver.getCurrentUrl());
        soft.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/new-online-store-is-open");
        soft.assertAll();
    }

    @When("User click on YouTubeIcon")
    public void YouTubeIconClicking() throws InterruptedException {
        home.socialMedia().get(3).click();

    }

    @Then("User should be directed to YouTube Website")
    public void userShouldBeDirectedToYouTubeWebsite() {
        WebDriverWait explicit = new WebDriverWait(driver, Duration.ofSeconds(7));
        explicit.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        System.out.println(driver.getCurrentUrl());
        driver.switchTo().window(tabs.get(1));
        System.out.println(driver.getCurrentUrl());
        soft.assertEquals(driver.getCurrentUrl(), "https://www.youtube.com/user/nopCommerce");
        soft.assertAll();
    }
}
