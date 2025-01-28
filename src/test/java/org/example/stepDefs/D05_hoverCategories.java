package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.example.stepDefs.Hooks.driver;

public class D05_hoverCategories {
    P03_homePage home = new P03_homePage();
    List<WebElement> subCategories = new ArrayList<>();

    @When("User select randomly from main_category")
    public void UserSelectRandomlyFromMain_category() {
        List<WebElement> categories = new ArrayList<>();
        categories.add(home.computer());
        categories.add(home.electronics());
        categories.add(home.apparel());
        int min = 0;
        int max = categories.size() - 1;
        int randoms_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
        Actions action = new Actions(driver);
        action.moveToElement(categories.get(randoms_int)).perform();
        action.moveToElement(categories.get(0)).perform();
        String catText = categories.get(0).getText();
        System.out.println(catText);
    }

    @And("User hover and click randomly from sub_category")
    public void userHoverAndClickRandomlyFromSub_category() throws InterruptedException {
        List<WebElement> subCategories = new ArrayList<>();
        subCategories.add(home.desktop());
        subCategories.add(home.noteBooks());
        subCategories.add(home.software());
        int min = 0;
        int max = subCategories.size() - 1;
        int randoms_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
        //subCategories.get(randoms_int).click();
        subCategories.get(0).click();
        Thread.sleep(Duration.ofSeconds(3));
    }

    @Then("User should be redirected to this sub_category")
    public void userShouldBeRedirectedToThisSub_category() {
        subCategories.add(home.desktop());
        subCategories.add(home.noteBooks());
        subCategories.add(home.software());
        int min = 0;
        int max = subCategories.size() - 1;
        int randoms_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
        SoftAssert soft = new SoftAssert();
        //String selCat = subCategories.get(randoms_int).getText().toLowerCase().trim();
        String selCat = subCategories.get(0).getText().toLowerCase().trim();
        String accPageT = home.pageTitle().getText().toLowerCase().trim();
        soft.assertEquals(selCat, accPageT);
        System.out.println(selCat + " = " + accPageT);
        soft.assertAll();
        //Text from subCategories cannot be printed out.
    }
}
