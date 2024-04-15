package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewReleases {
	WebDriver driver;
	By new_releases= By.xpath("//*[@id=\"nav-xshop\"]/a[10]");
	
	
	public NewReleases(WebDriver driver) {
		this.driver= driver;
	}

	
	
	public void clickNewReleases() {
		driver.findElement(new_releases).click();
	}


}
