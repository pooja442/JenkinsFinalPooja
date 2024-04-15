package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddProduct;
import pages.NewReleases;
import pages.ProductSearch;

public class PageObjectModelP {

	WebDriver driver;
	AddProduct add_cart;
	NewReleases new_releases;
	ProductSearch searching;


	@SuppressWarnings("deprecation")
	@Given("now chrome is open")
	public void now_chrome_is_on_open() {
		System.out.println("now chrome is open");
		try {
			System.setProperty(" webdriver.chrome.driver",
	        		"C:\\Users\\poojasharma03\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    	driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		} catch (Exception e) {
			System.out.println("Exception occurred: " + e.getMessage());
		}
		add_cart = new AddProduct(driver);
		new_releases = new NewReleases(driver);
		searching= new ProductSearch(driver);
	}

	@Given("user is on website")
	public void user_is_on_website() {
		driver.get("https://www.amazon.in");
		System.out.println("Inside pom=======");
	}
	
	@When("user clicks New-releases option")
	public void user_clicks_new_releases_option() {
		new_releases.clickNewReleases();
	  
	}

	@Then("user is navigated to New-releases page")
	public void user_is_navigated_to_new_releases_page() {
		System.out.println("user navigates to the New-releases page");
		driver.quit();
	
	}

	@Then("user navigated to Cart Page")
	public void user_navigated_to_cart_page() {
		add_cart.clickCartPage();
	}


	@When("user clicks on Cart Page")
	public void user_clicks_on_cart_page() {
		add_cart.clickCartPage();
	
	}

	@Then("user navigates to Cart Page")
	public void user_navigates_to_cart_page() throws InterruptedException {
		System.out.println("user navigates to the cart page");
		driver.quit();

	}

	@When("user is searching for shoes")
	public void user_searches_for_shoes() {
		System.out.println("Search shoes");
		searching.searchButton();
	}

	@Then("search results are displayed")
	public void search_results_for_shoes_are_displayed() {
		System.out.println("display shoes");
		searching.submitButton();
		driver.quit();
	}
	
}
