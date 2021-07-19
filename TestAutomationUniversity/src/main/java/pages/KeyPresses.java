package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPresses {
	WebDriver driver;
	
	public KeyPresses(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enteredKeys(String text) {
		driver.findElement(By.cssSelector("#target")).sendKeys(text);
	}
	
	public String getResultext() {
		String returnText=driver.findElement(By.xpath("//*[@id='result']")).getText();
		return returnText;
	}
	
	

}
