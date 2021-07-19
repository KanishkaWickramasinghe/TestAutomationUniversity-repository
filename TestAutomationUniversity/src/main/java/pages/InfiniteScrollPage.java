package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InfiniteScrollPage {
	WebDriver driver;
	By scroll= By.className("jscroll-added");
	
	
	public InfiniteScrollPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	//This index is 1 based
	public void scrollToParagraphByIndex(int index) throws InterruptedException {
//		String script="windo.scrollTo(0,document.body.scrollHeight)";
//		var jsExecutor=(JavascriptExecutor)driver;
		while (getNumberOfParagraph()<index) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,1000)");
	        //Thread.sleep(5000);
	        waitExecution();
		}
		System.out.println("***"+getNumberOfParagraph());
	}
	
	
	private int getNumberOfParagraph() {
		return driver.findElements(scroll).size();
	}
	
	
	private void waitExecution()
	{
		WebDriverWait wait =new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(scroll)));
	}
	
	public String getPageHeadText() {
		return driver.findElement(By.xpath("//h3")).getText();
	}

}
