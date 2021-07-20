package utils;

import org.openqa.selenium.WebDriver;

public class WindowManager {
	WebDriver driver;
	WebDriver.Navigation navigate;
	
	public WindowManager(WebDriver driver) {
		this.driver=driver;
		navigate=driver.navigate();
	}
	
	public void refreshPage() {
		navigate.refresh();
	}
	
	public void goForward() {
		navigate.forward();
	}
	
	public void goBack() {
		navigate.back();
	}
	
	public void goTo(String url) {
		navigate.to(url);
	}
}
