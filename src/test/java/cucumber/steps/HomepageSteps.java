package cucumber.steps;

import cucumber.api.java.ca.I;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import cucumber.api.java.en.But;
import cucumber.api.PendingException;
import cucumber.pages.SearchPage;
import cucumber.support.Hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class HomepageSteps {

    // private SearchPage TapQA;

    private WebDriver driver;

    public HomepageSteps(Hooks hooks) {
        this.driver = hooks.getDriver();
    }

    @Then("^I see the header$")
    public void i_see_the_header(String TapQA) throws Throwable {

        driver.findElements(By.cssSelector(".fusion-standard-logo .fusion-logo-2x"));
    }

    @Given("^I click on tap STRATEGY")
    public void i_click_on_tap_STRATEGY() throws Throwable {

        driver.findElements(By.cssSelector(".checkboxes i")).get(0).click();

    }

    @Then("^I search for the Header tap STRATEGY$")
    public void i_search_for_the_Header_tap_STRATEGY() throws Throwable {

        WebElement strategy = driver.findElement(By.className("fusion-page-title-wrapper"));

        System.out.println("Passed:tap Strategy");
    }

    @Then("^I click the Tap Logo to navigate back to the homepage$")
    public void i_click_the_Tap_Logo_to_navigate_back_to_the_homepage(String arg1) throws Throwable {

        driver.findElement(By.className("fusion-logo-link")).click();
    }

    @Given("^I click on the Continuous Integration, Performance & Automation Link$")
    public void i_click_on_the_Continuous_Integration_Performance_Automation_Link() throws Throwable {

        driver.findElements(By.cssSelector(".checkboxes i")).get(1).click();
    }

    @Then("^I search for the Header tap AUTOMATION$")
    public void i_search_for_the_Header_tap_AUTOMATION() throws Throwable {

        WebElement automation = driver.findElement(By.className("fusion-page-title-wrapper"));

		System.out.println("Passed:tap Automation");
    }

    @Given("^I navigate to tap CONSULTING Page$")
    public void i_navigate_to_tap_CONSULTING_Page() throws Throwable {

        driver.findElements(By.cssSelector(".checkboxes i")).get(2).click();
    }

    @Then("^I search for the Header tap CONSULTING$")
    public void i_search_for_the_Header_tap_CONSULTING() throws Throwable {

        WebElement consulting = driver.findElement(By.className("fusion-page-title-wrapper"));

        System.out.println("Passed:tap Consulting");
    }

    @Given("^I navigate to tap LAKESHORE Page$")
    public void i_navigate_to_tap_LAKESHORE_Page() throws Throwable {

        driver.findElements(By.cssSelector(".checkboxes i")).get(3).click();
    }

    @Then("^I search for the Header tap LAKESHORE$")
    public void i_search_for_the_Header_tap_LAKESHORE() throws Throwable {

        WebElement lakeshore = driver.findElement(By.className("fusion-page-title-wrapper"));

        System.out.println("Passed:tap Lakeshore");
    }

    @Given("^I click on the Facebook icon$")
    public void i_click_on_the_facebook_icon() throws Throwable {

        driver.findElement(By.className("fusion-icon-facebook")).click();

    }

    // Need the Header search still
    @Then("^I search for the header Facebook$")
    public void i_search_for_the_header_facebook() throws Throwable {

		System.out.println("Facebook Found");
    }

    @Then("^I click the back button$")
    public void i_click_the_back_button() throws Throwable {

        driver.navigate().back();
    }

    @Given("^I click on the Twitter icon$")
    public void i_click_on_the_twitter_icon() throws Throwable {

        driver.findElement(By.className("fusion-icon-twitter")).click();
    }

    // Need the Header search still
    @Then("^I search for the header Twitter")
    public void i_search_for_the_header_twitter() throws Throwable {

        System.out.println("Twitter Found");
    }

    @Given("^I click on the Youtube icon$")
    public void i_click_on_the_youtube_icon() throws Throwable {

        driver.findElement(By.className("fusion-icon-youtube")).click();
    }

    // Need the Header search still
    @Then("^I search for the header Youtube")
    public void i_search_for_the_header_youtube() throws Throwable {

        System.out.println("Youtube Found");
    }

    @Given("^I click on the Instagram icon$")
    public void i_click_on_the_instagram_icon() throws Throwable {

        driver.findElement(By.className("fusion-icon-instagram")).click();
    }

    // Need the Header search still
    @Then("^I search for the header Instagram")
    public void i_search_for_the_header_instagram() throws Throwable {

        System.out.println("Instagram Found");
    }

    @Given("^I click on the Linkedin icon$")
    public void i_click_on_the_linkedin_icon() throws Throwable {

        driver.findElement(By.className("fusion-icon-linkedin")).click();
    }

    // Need the Header search still
    @Then("^I search for the header Linkedin")
    public void i_search_for_the_header_Linkedin() throws Throwable {

        System.out.println("Linkedin Found");
    }
}



////

////    //Looking for I Need a Nearshore Solution Link on Homepage. Navigating to, finding Header of Site and Going back to Homepage

////		driver.findElements(By.cssSelector(".checkboxes i")).get(3).click();

////    WebElement lakeshore = driver.findElement(By.className("fusion-page-title-wrapper"));

////		System.out.println("Passed:tap|Lakeshore");

////		driver.findElement(By.className("fusion-logo-link")).click();

////    //Assert.assertNotNull(displayed);

////    //Assert.assertEquals("Passed", displayed.isDisplayed());



////    //News Section of HomePage.  Still in the works.

////		driver.findElements(By.cssSelector("#recent-posts-2")).get(0).click();

////    WebElement news = driver.findElement(By.className("fusion-footer-widget-column widget widget_recent_entries"));

////        System.out.println("News Found");

////        driver.findElement(By.className("fusion-logo-link")).click();



//}

