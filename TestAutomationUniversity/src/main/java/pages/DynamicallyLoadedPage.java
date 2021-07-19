package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicallyLoadedPage {
	WebDriver driver;
	WebElement loadingBar;
	WebElement compleationText;
	
	
	public DynamicallyLoadedPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickOnStartButton() {
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		WebDriverWait wait= new WebDriverWait(driver, 5);
		loadingBar=driver.findElement(By.id("loading"));
		wait.until(ExpectedConditions.invisibilityOf(loadingBar));
		
		
	}
	
	public void waitForText() {
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		compleationText=driver.findElement(By.xpath("//div[@id='finish']/h4"));
		wait.until(ExpectedConditions.visibilityOf(compleationText));
	}
	
	
	public String getDisplayedTextAfterLoading() {
		
		return driver.findElement(By.xpath("//div[@id='finish']/h4")).getText();
	}
}
