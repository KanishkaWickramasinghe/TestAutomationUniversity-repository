package testCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestWindowUtilitisCheck extends BaseTest{
	
	@Test
	public void doUtilitiesAction() {
		var dynemicPg=homepg.clickDynamicLoadingLink();
		assertEquals(dynemicPg.getWindowDetails(), "Dynamically Loaded Page Elements", "Invalid page details..!");
		dynemicPg.clickOnHiddenElement();
		provideHadleToWindowManager().goBack();
		provideHadleToWindowManager().goForward();
		provideHadleToWindowManager().refreshPage();
		provideHadleToWindowManager().goTo("https://www.google.com");
	}
	
}
