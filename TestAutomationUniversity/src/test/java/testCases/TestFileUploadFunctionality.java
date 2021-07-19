package testCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestFileUploadFunctionality extends BaseTest{
	@Test
	public void testFileUpload()
	{
		var uploadfilePg=homepg.clickFileUploadLink();
		uploadfilePg.uploadFile("C:\\Users\\kwickramasingh\\Desktop\\chromedriver.exe");
		assertEquals(uploadfilePg.getUploadedFileText(), "chromedriver.exe","Incorrect file uploaded..!");
	}
}
