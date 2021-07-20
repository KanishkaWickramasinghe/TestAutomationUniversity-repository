package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
	WebDriver driver;
	public DynamicLoadingPage(WebDriver driver) {
		this.driver=driver;
	}

	public DynamicallyLoadedPage clickOnHiddenElement() {
		driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
		return new DynamicallyLoadedPage(driver);
	}
	
	public String getWindowDetails() {
		return driver.findElement(By.xpath("//h3")).getText();
		
	}
}
