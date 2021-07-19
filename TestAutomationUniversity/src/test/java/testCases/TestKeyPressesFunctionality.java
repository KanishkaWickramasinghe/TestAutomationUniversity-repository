package testCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestKeyPressesFunctionality extends BaseTest{
	
	@Test(priority = 1)
	public void testSendKeysFunctionality()
	{
		var keypress=homepg.clickKeyPressesLink();
		keypress.enteredKeys("A");
		assertEquals(keypress.getResultext(), "You entered: A","Invalid result displayed..!"); 
		keypress.enteredKeys(""+Keys.BACK_SPACE);
		assertEquals(keypress.getResultext(), "You entered: BACK_SPACE","Invalid result displayed..!"); 
	}
	
	@Test(priority = 2)
	public void testPi() throws InterruptedException
	{
		var keypress=homepg.clickKeyPressesLink();
		keypress.enteredKeys(""+Keys.chord(Keys.ALT,"p")+"=3.14");
		//Thread.sleep(10000);
	}
	
	@Test(priority = 3)
	public void testSlider() throws InterruptedException
	{
		var hzSlider=homepg.hrSliderLink();
		for(int i=0;i<8;i++)
		{
			hzSlider.moveSlider(""+Keys.ARROW_RIGHT);
		}
		assertEquals(hzSlider.getResultext(), "4","Incorrect value..!");
		//Thread.sleep(10000);
	}
}
