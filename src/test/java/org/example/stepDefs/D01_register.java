//Coding Page
package org.example.stepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import static org.example.stepDefs.Hooks.driver;

public class D01_register {
    P01_register reg = new P01_register();

    WebElement day, month, year;


    @When("User clicks on register icon")
    public void registerIcon() {
        reg.regIcon().click();
    }

    @And("User chooses gender")
    public void userChoosesGender() {
        reg.genderIcon().click();
    }

    @And("User enters first name")
    public void userEntersFirstName() {
        reg.firstName().sendKeys("Mohammed");
    }

    @And("User enters first name {string}")
    public void userEntersFirstName(String firstName) {
        reg.firstName().sendKeys(firstName);
    }

    @And("User enters last name")
    public void userEntersLastName() {
        reg.lastName().sendKeys("Azzam");
    }

    @And("User enters last name {string}")
    public void userEntersLastName(String lastName) {
        reg.lastName().sendKeys(lastName);
    }

    @And("User select the date od birth")
    public void userSelectTheDateOdBirth() {
        day = driver.findElement(By.xpath("//select[@name=\"DateOfBirthDay\"]"));
        Select selectDay = new Select(day);
        selectDay.selectByValue("1");
        month = driver.findElement(By.xpath("//select[@name=\"DateOfBirthMonth\"]"));
        Select selectMonth = new Select(month);
        selectMonth.selectByValue("7");
        year = driver.findElement(By.xpath("//select[@name=\"DateOfBirthYear\"]"));
        Select selectYear = new Select(year);
        selectYear.selectByValue("1996");
    }

    @And("User enters email")
    public void userEntersEmail() {

        Faker fake = new Faker();
        String fakeEmail = fake.internet().emailAddress();
        reg.email().sendKeys(fakeEmail);
        System.out.println(fakeEmail);
    }


    @And("User enters company name")
    public void userEntersCompanyName() {
        reg.company().sendKeys("CNX");
    }

    @And("User enters password and confirm")
    public void userEntersPasswordAndConfirm() {

        Faker fake = new Faker();
        String fakePass = fake.internet().password();
        reg.password().sendKeys(fakePass);
        reg.confirmPassword().sendKeys(fakePass);
        System.out.println(fakePass);
    }

    @And("User clicks on register button")
    public void userClicksOnRegisterButton() {
        reg.regButton().click();
    }

    @Then("the account is crated")
    public void theAccountIsCrated() {
        SoftAssert soft = new SoftAssert();
        boolean message = driver.findElement(By.xpath("//div[@class=\"result\"]")).isDisplayed();
        soft.assertTrue(message);
        String expColour = "rgba(76, 177, 124, 1)";
        String accColour = driver.findElement(By.xpath("//div[@class=\"result\"]")).getCssValue("color");
        soft.assertEquals(expColour, accColour);
        soft.assertAll();
    }


}
