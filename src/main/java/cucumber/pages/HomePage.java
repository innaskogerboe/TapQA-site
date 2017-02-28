package cucumber.pages;

import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;

import java.util.List;


public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

  /*  public void checkboxes(String target) {

        WebElement test = driver.findElements(By.cssSelector(".checkboxes a"))

            for (WebElement elem : this.searchResults) {
                if (elem.getText().toUpperCase().contains(expResult.toUpperCase()))
                {
                    return elem;
                }
            }
            return null;

        WebElement test = driver.findElements(By.cssSelector(".checkboxes a"));

  //      driver.findElements(By.cssSelector(".checkboxes a")).get(0).click();
    }

    */

    public void checkboxes(String expResult) {
        WebElement elem = findResult(expResult);
        Assert.assertNotNull(String.format("Link not found for %s", expResult), elem);
        elem.click();
    }

    private WebElement findResult(String expResult) {
        for (WebElement elem : this.checkbox_collection) {
            System.out.println("NO"+elem.getText());
            if (elem.getText().toUpperCase().contains(expResult.toUpperCase()))
            {
                return elem;
            }
        }
        return null;
    }

    @FindBy(css = ".checkboxes a")
    private List<WebElement> checkbox_collection;

}
