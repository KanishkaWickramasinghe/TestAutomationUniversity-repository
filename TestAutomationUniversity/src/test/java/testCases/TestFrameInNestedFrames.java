package testCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestFrameInNestedFrames extends BaseTest{
	
	@Test
	public void TestNesteadFramesText() throws InterruptedException {
		var framesPg=homepg.clickFramesLink();
		assertEquals(framesPg.getFramesPageText(), "Frames", "Not navigated to Frames page..!");
		var nesteadFramesPg=framesPg.navigateToNesteadFrames();
		nesteadFramesPg.getFrameText("LEFT");
		//Thread.sleep(10000);
		
	}
}
