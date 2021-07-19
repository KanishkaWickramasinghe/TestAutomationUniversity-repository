package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {
	WebDriver driver;
	
	public FramesPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public NesteadFramesPage navigateToNesteadFrames() {
		driver.findElement(By.linkText("Nested Frames")).click();
		return new NesteadFramesPage(driver);
	}
	
	public String getFramesPageText() {
		return driver.findElement(By.tagName("h3")).getText();
	}
	
}
