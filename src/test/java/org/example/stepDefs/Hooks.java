package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Hooks {
    public static WebDriver driver;

    @Before
    public void openBrowser() {
        String BrowserName = "chrome";
        if (BrowserName.contains("chrome")) {
            driver = new ChromeDriver();
        } else if (BrowserName.contains("edge")) {
            driver = new EdgeDriver();
        } else if (BrowserName.contains("firefox")) {
            driver = new FirefoxDriver();
        } else driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.nopcommerce.com/");
    }

    @After
    public void Quite() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(3));
        driver.quit();
    }
}





