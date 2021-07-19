package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class ContextMenuPage {
	WebDriver driver;
	WebElement contextMenuBox;
	public ContextMenuPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void contextMenuFunction()
	{
		Actions contextClick=new Actions(driver);
		contextMenuBox=driver.findElement(By.cssSelector("#hot-spot"));
		contextClick.contextClick(contextMenuBox).perform();
		
	}
	
	public String getAlertText() {
		return driver.switchTo().alert().getText();
	}
	
	public void acceptAlertAction() {
		driver.switchTo().alert().accept();
	}

}
