package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D03_currencies {
    P03_homePage home = new P03_homePage();

    @When("User select Euro currency from dropDown list")
    public void userSelectEuroCurrencyFromDropDownList() throws InterruptedException {
        Select select = new Select(home.currency());
        select.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");
        Thread.sleep(Duration.ofSeconds(5));
    }

    @Then("Euro symbol should be displayed on products")
    public void euroSymbolShouldBeDisplayedOnProducts() {
        //Methode 1
        String pro00 = home.price().get(0).getText();
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(pro00.contains("€"));

        String pro01 = home.price().get(1).getText();
        soft.assertTrue(pro00.contains("€"));

        String pro02 = home.price().get(2).getText();
        soft.assertTrue(pro00.contains("€"));

        String pro03 = home.price().get(3).getText();
        soft.assertTrue(pro00.contains("€"));

        System.out.println("Methode 1");

        //Methode 2

        int proSize = home.price().size();
        for (int i = 0; i < proSize; i++) {
            String product = home.price().get(i).getText();
            soft.assertTrue(pro00.contains("€"));
        }
        System.out.println("Methode 2");
        soft.assertAll();
    }
}
