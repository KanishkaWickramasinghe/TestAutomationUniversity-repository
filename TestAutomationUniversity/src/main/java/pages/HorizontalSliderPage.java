package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {
	WebDriver driver;
	
	public HorizontalSliderPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void moveSlider(String text) {
		driver.findElement(By.xpath("//input[@type='range']")).sendKeys(text);
	}
	
	public String getResultext() {
		String returnText=driver.findElement(By.xpath("//*[@id='range']")).getText();
		return returnText;
	}
	
}
