package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {
	WebDriver driver;
	By figurcapt=By.className("figcaption");
	public HoversPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//move to the needed element/hover over the  image -> Action class object.
	public FigureCaption howerOverFigure(int index) {
		// find elements returns a list of elements. Because we need the 0th element we uses (index-1) to point out he element.
		WebElement figure=driver.findElements(By.xpath("//div[@class='figure']")).get(index-1);
		
		//creating a action class object
		Actions action= new Actions(driver);
		action.moveToElement(figure).perform();
		
		//returning the figure caption class.
		return new FigureCaption(figure.findElement(figurcapt));
		
	}
	
	//inner class is created to get the caption that occurs on hover
	// Can create a separate class if needed.
	 public class FigureCaption{
		private WebElement caption;
		private By header=By.tagName("h5");
		private By link=By.tagName("a");	
		
		//constructor for the inner class
		public FigureCaption(WebElement caption)
		{
			this.caption=caption;
		}
		
		//method to verify the display of the caption
		public boolean isCaptionDisplayed() {
			return caption.isDisplayed();
		}
		
		
		//method to get the title of the caption
		public String getTitle() {
			return caption.findElement(header).getText();
		}
		
		// method to return the caption's link
		public String getLink() {
			return caption.findElement(link).getAttribute("href");
		}
		
		
		//method to get the link text
		public String getLinkText() {
			return caption.findElement(link).getText();
		}
	}
	
	
	
}
