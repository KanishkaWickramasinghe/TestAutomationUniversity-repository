package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword {
	WebDriver driver;
	WebElement txtPassword;
	
	public ForgotPassword(WebDriver driver) {
		this.driver=driver;
	}
	
	public void resetPassword(String email) {
		txtPassword=driver.findElement(By.cssSelector("#email"));
		txtPassword.sendKeys(email);
		driver.findElement(By.cssSelector("#form_submit")).click();
	}
	
	public String pageHeader() {
		String header=driver.findElement(By.xpath("//h2[contains(text(),'Forgot Password')]")).getText();
		return header;
	}
	
	
}
