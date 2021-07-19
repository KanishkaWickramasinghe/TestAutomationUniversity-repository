package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private WebDriver driver;
	WebElement txtUserName;
	WebElement txtPassword;
	WebElement btnLogin;
//	String userName="tomsmith";
//	String password="SuperSecretPassword!";
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public SecureAreaPage logintoPage(String userName,String password) {
		txtUserName=driver.findElement(By.id("username"));
		txtUserName.sendKeys(userName);
		txtPassword=driver.findElement(By.id("password"));
		txtPassword.sendKeys(password);
		btnLogin=driver.findElement(By.cssSelector("#login button"));
		btnLogin.click();
		return new SecureAreaPage(driver);
	}
	
	public String getLoginFormText() {
		String txtLoginForm=driver.findElement(By.xpath("//div[contains(text(),' You logged out of the secure area!')]")).getText();
		return txtLoginForm;
	}

}
