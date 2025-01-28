//Locators Page
package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepDefs.Hooks.driver;

public class P01_register {

    public WebElement regIcon() {
        return driver.findElement(By.className("ico-register"));
    }

    public WebElement genderIcon() {
        return driver.findElement(By.id("gender-male"));
    }

    public WebElement firstName() {
        return driver.findElement(By.id("FirstName"));
    }

    public WebElement lastName() {
        return driver.findElement(By.id("LastName"));
    }

    public WebElement email() {
        return driver.findElement(By.id("Email"));
    }

    public WebElement company() {
        return driver.findElement(By.id("Company"));
    }

    public WebElement password() {
        return driver.findElement(By.id("Password"));
    }

    public WebElement confirmPassword() {
        return driver.findElement(By.id("ConfirmPassword"));
    }

    public WebElement regButton() {
        return driver.findElement(By.id("register-button"));
    }

    public String message() {
        return driver.findElement(By.xpath("//div[@class=\"result\"]")).getText();
    }
}
