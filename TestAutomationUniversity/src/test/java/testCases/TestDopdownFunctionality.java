package testCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;


public class TestDopdownFunctionality extends BaseTest{
	
	@Test
	public void selectDropdownOption() {
		var dropdownPg= homepg.clickDropDown();
		String option="Option 2";
		
		dropdownPg.selectOption(option);
		var selectedOptions= dropdownPg.getSelectedOptions();
		assertEquals(selectedOptions.size(), 2, "Incorrect number of selections");
		assertTrue(selectedOptions.contains(option), "Option not selected..!");
		//System.out.println("Option 2 selected");
	}
	
	
}
