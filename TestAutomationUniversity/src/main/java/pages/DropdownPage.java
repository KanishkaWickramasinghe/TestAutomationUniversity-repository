package pages;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class DropdownPage {
	private WebDriver driver;
	WebElement selectDropdown;
	
	public DropdownPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void selectOption(String option) {
		findDropDownElement().selectByVisibleText(option);
		
	}
	
	public List <String> getSelectedOptions() {
		List<WebElement> selectedElements=findDropDownElement().getAllSelectedOptions();
		//Lamda expression used instead of loop
		return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
	}
	
	
	private Select findDropDownElement() {
		return new Select(driver.findElement(By.id("dropdown")));
	}
	

}
