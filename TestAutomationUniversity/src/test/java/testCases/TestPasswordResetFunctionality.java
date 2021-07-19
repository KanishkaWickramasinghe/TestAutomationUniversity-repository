package testCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.ForgotPassword;

public class TestPasswordResetFunctionality extends BaseTest{
	
	@Test
	public void setNewPassword() {
		ForgotPassword passwordPage= homepg.clickForgotPassword();
		assertEquals(passwordPage.pageHeader(), "Forgot Password");
		passwordPage.resetPassword("kanishka7569@yahoo.com");
	}
}
