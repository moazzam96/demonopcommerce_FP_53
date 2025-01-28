package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.asserts.SoftAssert;

import static org.example.stepDefs.Hooks.driver;

public class D04_search {
    P03_homePage home = new P03_homePage();

    @When("User search with product name {string}")
    public void userSearchWithProductName(String ProductName) {
        home.searchBar().sendKeys(ProductName);
        home.searchButton().click();
    }

    @Then("Url is common and all products contain {string} are shown")
    public void urlIsCommonAndAllProductsContainAreShown(String ProductName) {
        //1- url contains "https://demo.nopcommerce.com/search?q="
        //2- search shows relevant results
        SoftAssert soft = new SoftAssert();
        String searchUrl = driver.getCurrentUrl();
        soft.assertTrue(searchUrl.contains("https://demo.nopcommerce.com/search?q="));
        for (int i = 0; i < home.searchResults().size(); i++) {
            String productK = home.searchResults().get(i).getText().toLowerCase().trim();
            soft.assertTrue(productK.contains(ProductName.toLowerCase()));
            System.out.println(productK);
        }
        soft.assertAll();
    }

}
