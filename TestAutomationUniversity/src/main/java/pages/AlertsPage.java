package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
	WebDriver driver;
	public AlertsPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void triggerJsAlerts() {
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	}
	
	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}
	
	public String getAlertText() {
		String alertText;
		alertText= driver.findElement(By.xpath("//p[@id='result']")).getText();
		return alertText;
	}
	
	
	public void triggerJSConfirm() {
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		
	}
	
	public void cancelJSConfirm() {
		driver.switchTo().alert().dismiss();
	}
	
	public String returnJSConfirmText() {
		String alertText;
		alertText=driver.switchTo().alert().getText();
		return alertText;
	}
	
	
	public void triggerPrompt() {
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	}
	
	public void typeInTextInPrompt(String text) {
		driver.switchTo().alert().sendKeys(text);
	}
	
	public String getAddedTextInPrompt() {
		return driver.findElement(By.xpath("//p[@id='result']")).getText();
	}
	
	
}
