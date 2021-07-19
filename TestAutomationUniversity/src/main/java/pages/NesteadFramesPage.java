package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NesteadFramesPage {
	WebDriver driver;
	public NesteadFramesPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	private void switchToFrameSet() {
		driver.switchTo().frame("frameset-middle");
		
	}
	
	private void switchToLeftFrame() {
		driver.switchTo().frame("frame-left");	
	}
	
	private void switchToBottomFrame() {
		driver.switchTo().frame("frame-bottom");	
	}
	
	
	private void switchToParentFrame() {
		driver.switchTo().parentFrame();
	}
	
	
	public String getFrameText(String text1)
	{
		//switchToFrameSet();
		switchToLeftFrame();
		String text=driver.findElement(By.tagName("Body")).getText();
		if(text==text1)
		{
			System.out.println("*** "+text);
			return text;
		}
		else
			{System.out.println("### "+text);
			return text;}
			
		
	}	

}
