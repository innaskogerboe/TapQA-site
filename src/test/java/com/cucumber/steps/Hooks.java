package com.cucumber.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class Hooks {
	
	public WebDriver driver;

	@Before
	public void beforeScenario() {
		System.out.println("Before Scenario");

		//	Instantiate driver
		driver = new ChromeDriver();

		//	Short implicit timeout
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		Dimension dim = new Dimension(1920, 1080);

		driver.manage().window().setSize(dim);


		/// ^ don't touch! Deals with Window Sizes to find specific Links + Wait Timer


        

		//	Navigate to Site
		driver.navigate().to("http://tapqa.com");



		//We Test Software navigation.  Asserts are still being worked on.

		// Looking for Strategy for Scaling Development & Quality Link on Homepage. Navigating to, finding Header of Site and Going back to Homepage
		driver.findElements(By.cssSelector(".checkboxes i")).get(0).click();
		WebElement strategy = driver.findElement(By.className("fusion-page-title-wrapper"));
		System.out.println("Passed:tap|Strategy");
		driver.findElement(By.className("fusion-logo-link")).click();

		// Continuous Integration Link on Homepage. Navigating to, finding Header of Site and Going back to Homepage
		driver.findElements(By.cssSelector(".checkboxes i")).get(1).click();
		WebElement automation = driver.findElement(By.className("fusion-page-title-wrapper"));
		System.out.println("Passed:tap|Automation");
		driver.findElement(By.className("fusion-logo-link")).click();

		//Looking for Ensuring Quality in Software Link on Homepage. Navigating to, finding Header of Site and Going back to Homepage
		driver.findElements(By.cssSelector(".checkboxes i")).get(2).click();
		WebElement consulting = driver.findElement(By.className("fusion-page-title-wrapper"));
		System.out.println("Passed:tap|Consulting");
		driver.findElement(By.className("fusion-logo-link")).click();

		//Looking for I Need a Nearshore Solution Link on Homepage. Navigating to, finding Header of Site and Going back to Homepage
		driver.findElements(By.cssSelector(".checkboxes i")).get(3).click();
		WebElement lakeshore = driver.findElement(By.className("fusion-page-title-wrapper"));
		System.out.println("Passed:tap|Lakeshore");
		driver.findElement(By.className("fusion-logo-link")).click();
		//Assert.assertNotNull(displayed);
		//Assert.assertEquals("Passed", displayed.isDisplayed());


        //Footer Selection of Quality Strategy. Navigate to, finding Header and going back to Homepage.
        driver.findElement(By.xpath("//*[@id=\"text-2\"]/div[1]/p[2]/a[1]")).click();
        WebElement strategy = driver.findElement(By.className("fusion-page-title-wrapper"));
        System.out.println("Quality Strategy Found");
        driver.findElement(By.className("fusion-logo-link")).click();

        //Footer Selection of Automated QA Testing. Navigate to, finding Header and going back to Homepage.
        driver.findElement(By.xpath("//*[@id=\"text-2\"]/div[1]/p[2]/a[2]")).click();
        WebElement automation = driver.findElement(By.className("fusion-page-title-wrapper"));
        System.out.println("Automated QA Found");
        driver.findElement(By.className("fusion-logo-link")).click();

        //Footer Selection of Manual QA Testing. Navigate to, finding Header and going back to Homepage.
        driver.findElement(By.xpath("//*[@id=\"text-2\"]/div[1]/p[2]/a[3]")).click();
        WebElement manual = driver.findElement(By.className("fusion-page-title-wrapper"));
        System.out.println("Manual QA Found");
        driver.findElement(By.className("fusion-logo-link")).click();

        //Footer Selection of Nearshore Services. Navigate to, finding Header and going back to Homepage
        driver.findElement(By.xpath("//*[@id=\"text-2\"]/div[1]/p[2]/a[4]")).click();
        WebElement nearshore = driver.findElement(By.className("fusion-page-title-wrapper"));
        System.out.println("Nearshore Found");
        driver.findElement(By.className("fusion-logo-link")).click();

        //Footer Selection of Continuous Integration. Navigate to, finding Header and going back to Homepage
        driver.findElement(By.xpath("//*[@id=\"text-2\"]/div[1]/p[2]/a[5]")).click();
        WebElement integration = driver.findElement(By.className("fusion-page-title-wrapper"));
        System.out.println("Continuous Integration Found");
        driver.findElement(By.className("fusion-logo-link")).click();

        //
		driver.findElements(By.cssSelector("#recent-posts-2")).get(0).click();
        WebElement news = driver.findElement(By.className("fusion-footer-widget-column widget widget_recent_entries"));
        System.out.println("News Found");
        driver.findElement(By.className("fusion-logo-link")).click();


        //Footer Navigation on Homepage.

		//Navigate to Facebook from Footer. Need a way back onto TapQA homepage
		driver.findElement(By.className("fusion-icon-facebook")).click();
		System.out.println("Facebook Found");
		driver.navigate().back();

		//Navigate to Twitter from Footer.  Need a way back onto TapQA homepage
		driver.findElement(By.className("fusion-icon-twitter")).click();
		System.out.println("Twitter Found");
		driver.navigate().back();

		//Navigate to Youtube from Footer.  Need a way back onto TapQA homepage
		driver.findElement(By.className("fusion-icon-youtube")).click();
		System.out.println("Youtube Found");
		driver.navigate().back();

		//Navigate to Instagram from Footer.  Need a way back onto TapQA homepage
		driver.findElement(By.className("fusion-icon-instagram")).click();
		System.out.println("Instagram Found");
		driver.navigate().back();

		//Navigate to Linkedin from Footer.  Need a way back onto TapQA homepage
		driver.findElement(By.className("fusion-icon-linkedin")).click();
		System.out.println("Linkedin Found");
		driver.navigate().back();

	}


	@After
	public void afterScenario() {
		System.out.println("After Scenario");

		driver.quit();


	}
}
