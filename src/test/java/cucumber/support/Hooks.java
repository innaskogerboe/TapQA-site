package cucumber.support;

import cucumber.config.Config;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;
import java.net.URL;

public class Hooks {

    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }


    @Before
    public void beforeScenario(Scenario scenario) {

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }


    @After
    public void afterScenario(Scenario scenario) {
        if (driver != null)
        {
            driver.quit();
        }
    }
}
