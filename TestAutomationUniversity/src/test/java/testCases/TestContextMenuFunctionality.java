package testCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;


public class TestContextMenuFunctionality extends BaseTest{
	
	@Test
	public void performContextClick()
	{
		var contextMenuPg=homepg.clickContextMenuLink();
		contextMenuPg.contextMenuFunction();
		assertEquals(contextMenuPg.getAlertText(), "You selected a context menu", "Invalid Alert Text..!"); 
		contextMenuPg.acceptAlertAction();
	}
	
}
