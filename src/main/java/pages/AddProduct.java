package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddProduct {
	WebDriver driver;
	By add_Cart= By.id("nav-cart-count");
	
	public AddProduct(WebDriver driver) {
		this.driver= driver;
	}



	

	
	
	public void clickCartPage() {
		driver.findElement(add_Cart).click();
	}







	//public Object isProductAdded() {
		// TODO Auto-generated method stub
		//return null;
	}
	
	



