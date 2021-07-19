package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygEditorPage {
	WebDriver driver;
	private String editorFrameId="mce_0_ifr";
	
	
	public WysiwygEditorPage(WebDriver driver) {
		this.driver=driver;
	}
	
	private void switchToEditor() {
		driver.switchTo().frame(editorFrameId);
	}
	
	private void switchBackToParent() {
		driver.switchTo().parentFrame();
	}
	
	
	public void clearFrameText() {
		switchToEditor();
		driver.findElement(By.cssSelector("#tinymce")).clear();
		switchBackToParent();
		
	}
	
	public void increaseIndent() {
		driver.findElement(By.xpath("//button[@title='Increase indent']")).click();
	}
	
	
	
	public void addTextToFrame(String text1) {
		switchToEditor();
		driver.findElement(By.cssSelector("#tinymce")).sendKeys(text1);
		switchBackToParent();
		
	}
	
	public String getTextOfFrameTextArea() {
		switchToEditor();
		String text =driver.findElement(By.xpath("//*[@id='tinymce']/p")).getText();
		switchBackToParent();
		return text;
	}
	
}
