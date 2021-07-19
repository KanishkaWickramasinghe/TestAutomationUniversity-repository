package testCases;




import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;


public class TestHoveroverText extends BaseTest{
	@Test
	public void testHoverUser1()
	{
		var hoversPg= homepg.clickHoversLink();
		var caption=hoversPg.howerOverFigure(1);
		assertTrue(caption.isCaptionDisplayed(), "Caption is not displayed.!");
		assertEquals(caption.getTitle(), "name: user1", "Title not not displayed.!");
		assertEquals(caption.getLinkText(), "View profile","Link Text not displayed...!");
		assertTrue(caption.getLink().endsWith("/users/1"),  "Invalid hyper link..!");
				
	}
}
