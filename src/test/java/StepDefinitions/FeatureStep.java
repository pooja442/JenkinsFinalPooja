package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FeatureStep {

	WebDriver driver;

    @SuppressWarnings("deprecation")
	@Given("website is open")
    public void browser_open() {
        System.out.println("website is open");
        try {System.setProperty(" webdriver.chrome.driver",
        		"C:\\Users\\poojasharma03\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    	driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
            driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }

    @Given("user is on amazon website")
    public void user_is_on_amazon_page() {
        driver.get("https://www.amazon.in");
    }

    @When("user clicks sign in")
    public void user_clicks_sign_in() {
        System.out.println("user clicks sign-in");
        driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
    }

    @And("^user enters (.*)$")
    public void user_enters_email(String email) {
        System.out.println("user enters email");
        driver.findElement(By.id("ap_email")).sendKeys(email);
    }

    @And("clicks on continue button")
    public void clicks_on_continue_button() {
        System.out.println("clicks on continue button");
        driver.findElement(By.id("continue")).click();
    }

    @And("^user is entering (.*)$")
    public void user_enters_password(String password) {
        System.out.println("user enters password");
        driver.findElement(By.id("ap_password")).sendKeys(password);
    }


    @Then("user is navigated to home page")
    public void user_is_navigated_to_the_home_page() {
        System.out.println("user is navigated to home page");
        driver.findElement(By.id("signInSubmit")).click();
        driver.quit();
    }

    @Given("user is on Amazon homepage")
    public void user_is_on_the_amazon_homepage() {
        System.out.println("open Page");
        driver.get("https://www.amazon.in");
    }

    
    @When("^user searches for (.*)$")
    public void user_searches_for_product(String product) {
        System.out.println("Search " + product);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product);
    }


    @Then("search result for watches are displayed")
    public void search_results_for_watches_are_displayed() {
        System.out.println("display watches");
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.quit();
    }
}
