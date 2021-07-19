package testCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestDynemicallyLodingElements extends BaseTest{
	@Test
	public void loadDinemicallyLoadingElements()
	{
		var dynemicPg=homepg.clickDynamicLoadingLink();
		var dynemicElementPg=dynemicPg.clickOnHiddenElement();
		dynemicElementPg.clickOnStartButton();
		assertEquals(dynemicElementPg.getDisplayedTextAfterLoading(), "Hello World!","Invalid text displayed..!");
		
	}
	
	
	@Test
	public void waitingForTextLabel()
	{
		var dynemicPg=homepg.clickDynamicLoadingLink();
		var dynemicElementPg=dynemicPg.clickOnHiddenElement();
		dynemicElementPg.waitForText();
		assertEquals(dynemicElementPg.getDisplayedTextAfterLoading(), "Hello World!","Invalid text displayed..!");
	}
}
