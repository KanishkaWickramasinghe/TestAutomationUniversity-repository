package testCases;

//import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.SecureAreaPage;



public class TestLoginFunctionality extends BaseTest {

	@Test
	public void testLoginSuccessfully() {
		LoginPage loginPg= homepg.clickFormAuthentication();
		SecureAreaPage securePg=loginPg.logintoPage("tomsmith","SuperSecretPassword!");
		System.out.println(securePg.getSecurePageText());
		assertTrue(securePg.getSecurePageText().contains("You logged into a secure area!"),"Assert failed");
	}

}
