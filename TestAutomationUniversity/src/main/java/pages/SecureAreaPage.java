package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class SecureAreaPage {
	private WebDriver driver;
	WebElement btnLogout;
	public SecureAreaPage(WebDriver driver) {
	this.driver=driver;	
	}
	
	
	public String getSecurePageText() {
		return driver.findElement(By.xpath("//div[contains(text(),'You logged into a secure area!')]")).getText();
	}
	
	public LoginPage logoutFromsite() {
		btnLogout=driver.findElement(By.xpath("//i[contains(text(),'Logout')]"));
		btnLogout.click();
		return new LoginPage(driver);
	}
	
	
}
