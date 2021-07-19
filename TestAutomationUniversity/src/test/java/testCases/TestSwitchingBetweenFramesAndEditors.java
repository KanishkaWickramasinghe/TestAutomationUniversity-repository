package testCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestSwitchingBetweenFramesAndEditors extends BaseTest{
	
	@Test
	public void testAddTextToFrameArea() throws InterruptedException {
		String text1="Hello";
		String text2="World";
		var wysiwygEditorPg=homepg.clickWysiwygEditor();
		wysiwygEditorPg.clearFrameText();
		wysiwygEditorPg.addTextToFrame(text1+" ");
		wysiwygEditorPg.increaseIndent();
		wysiwygEditorPg.addTextToFrame(text2);
		Thread.sleep(10000);
		assertEquals(wysiwygEditorPg.getTextOfFrameTextArea(), text1+" "+text2, "Invalid text displayed..!" ); 
	}
}
