package testCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;



public class TestAlertsFunctionality extends BaseTest{
	
	@Test
	public void testingAlertsFunction()
	{
		var alertsPg=homepg.clickJavaScriptAlertsLink();
		alertsPg.triggerJsAlerts();
		alertsPg.acceptAlert();
		assertEquals( alertsPg.getAlertText(), "You successfully clicked an alert", "Alert was not triggered and closed..!");
		
	}
	
	@Test
	public void testingAlertsCancelFunction()
	{
		var alertsPg=homepg.clickJavaScriptAlertsLink();
		alertsPg.triggerJSConfirm();
		assertEquals( alertsPg.returnJSConfirmText(), "I am a JS Confirm", "JS confirm text incorrect..!");
		alertsPg.cancelJSConfirm();
		
		
	}
	
	
	@Test
	public void testingPromptFunction()
	{
		var alertsPg=homepg.clickJavaScriptAlertsLink();
		alertsPg.triggerPrompt();
		alertsPg.typeInTextInPrompt("Test comment text");
		alertsPg.acceptAlert();
		assertEquals( alertsPg.getAddedTextInPrompt(), "You entered: Test comment text", "JS prompt text incorrect..!");
		
		
		
	}
}
