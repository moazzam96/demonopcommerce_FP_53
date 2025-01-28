package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.example.stepDefs.Hooks.driver;

public class P03_homePage {
    //F03
    public WebElement currency() {
        return driver.findElement(By.id("customerCurrency"));
    }

    public List<WebElement> price() {
        return driver.findElements(By.cssSelector("[class=\"price actual-price\"]"));
    }

    //F04
    public WebElement searchBar() {
        return driver.findElement(By.className("search-box-text"));
    }

    public WebElement searchButton() {
        return driver.findElement(By.className("search-box-button"));
    }

    public List<WebElement> searchResults() {
        return driver.findElements(By.cssSelector("h2[class=\"product-title\"]"));
    }

    //F05
    public WebElement computer() {
        return driver.findElement(By.cssSelector("li>a[href=\"/computers\"]"));
    }

    public WebElement electronics() {
        return driver.findElement(By.cssSelector("li>a[href=\"/electronics\"]"));
    }

    public WebElement apparel() {
        return driver.findElement(By.cssSelector("li>a[href=\"/apparel\"]"));
    }

    public WebElement desktop() {
        return driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[1]/a"));
    }

    public WebElement noteBooks() {
        return driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[2]/a"));
    }

    public WebElement software() {
        return driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[3]/a"));
    }

    public WebElement pageTitle() {
        return driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[3]/div/div[1]/h1"));
    }

    //F06

    public List<WebElement> homeIcon() {
        return driver.findElements(By.cssSelector("div[class=\"nivo-controlNav\"]>a"));
    }

    public List<WebElement> sliders() {
        return driver.findElements(By.cssSelector("div[id=\"nivo-slider\"]>a"));
    }

    //F07
    public List<WebElement> socialMedia() {
        return driver.findElements(By.cssSelector("ul[class=\"networks\"]>li"));
    }
    //F08

    public List<WebElement> wishlist() {
        return driver.findElements(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]"));
    }

    public WebElement successMsg() {
        return driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }

    public WebElement wishlistIcon() {
        return driver.findElement(By.cssSelector("span[class=\"wishlist-label\"]"));
    }

    public WebElement wishlistQuantity() {
        return driver.findElement(By.cssSelector("input[class=\"qty-input\"]"));
    }


}


