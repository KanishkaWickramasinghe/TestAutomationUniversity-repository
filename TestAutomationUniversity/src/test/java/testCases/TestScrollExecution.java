package testCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import net.bytebuddy.description.annotation.AnnotationValue.Loaded;

public class TestScrollExecution extends BaseTest{
	
	@Test
	public void tetScrollToFifthParagraph() throws InterruptedException
	{
		var scrollPg=homepg.clickInfiniteScrollLink();
		scrollPg.scrollToParagraphByIndex(5);
		assertEquals(scrollPg.getPageHeadText(), "Infinite Scroll", "Invalid page Loaded.class.!");
	}
}
