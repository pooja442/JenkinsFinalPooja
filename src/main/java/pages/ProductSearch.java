package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductSearch {
	WebDriver driver;
	
	By product_search= By.id("twotabsearchtextbox");
	By sub_button= By.id("nav-search-submit-button");
	
	public ProductSearch(WebDriver driver) {
		this.driver=driver;
	}

	public void searchButton() {
		driver.findElement(product_search).sendKeys("Shoes");
	}
	
	public void submitButton() {
		driver.findElement(sub_button).click();
	}

	//public void searchForProduct(Object product) {
		// TODO Auto-generated method stub
		
	}
	

