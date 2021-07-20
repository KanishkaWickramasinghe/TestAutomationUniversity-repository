package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {

	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public LoginPage clickFormAuthentication() {
		clickLink("Form Authentication");
		return new LoginPage(driver);
	}
	
	public DropdownPage clickDropDown() {
		clickLink("Dropdown");
		return new DropdownPage(driver);
	}
	
	public ForgotPassword clickForgotPassword() {
		clickLink("Forgot Password");
		return new ForgotPassword(driver);
	}
	
	
	//File upload page navigation.
	public FileUploadPage clickFileUploadLink() {
		clickLink("File Upload");
		return new FileUploadPage(driver);
	}
	
	public ContextMenuPage clickContextMenuLink() {
		clickLink("Context Menu");
		return new ContextMenuPage(driver);
	}
	
	
	public HoversPage clickHoversLink() {
		clickLink("Hovers");
		return new HoversPage(driver);
	}
	
	public KeyPresses clickKeyPressesLink() {
		clickLink("Key Presses");
		return new KeyPresses(driver);
	}
	
	public AlertsPage clickJavaScriptAlertsLink() {
		clickLink("JavaScript Alerts");
		return new AlertsPage(driver);
	}
	
	public HorizontalSliderPage hrSliderLink() {
		clickLink("Horizontal Slider");
		return new HorizontalSliderPage(driver);
	}
	
	
	public WysiwygEditorPage clickWysiwygEditor() {
		clickLink("WYSIWYG Editor");
		return new WysiwygEditorPage(driver);
	}
	
	public FramesPage clickFramesLink() {
		clickLink("Frames");
		return new FramesPage(driver);
	}
	
	public DynamicLoadingPage clickDynamicLoadingLink() {
		clickLink("Dynamic Loading");
		return new DynamicLoadingPage(driver);
	}
	
	public InfiniteScrollPage clickInfiniteScrollLink() {
		clickLink("Infinite Scroll");
		return new InfiniteScrollPage(driver);
	}
	
	
	private void clickLink(String linkText) {
		driver.findElement(By.linkText(linkText)).click();
	}
}
