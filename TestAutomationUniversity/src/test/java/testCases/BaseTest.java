package testCases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import com.google.common.io.Files;

import pages.HomePage;
import utils.WindowManager;

public class BaseTest {
	protected WebDriver driver;
	protected HomePage homepg;
	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		driver = new ChromeDriver();
		goHome();
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		homepg=new HomePage(driver);
	}
	
	@BeforeMethod
	public void goHome()
	{
		driver.get("https://the-internet.herokuapp.com");
	}
	
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
	
	@AfterMethod
	public void getTCFailure(ITestResult results) 
	{
//		if (ITestResult.FAILURE==results.getStatus()) 
//		{
			var camera= (TakesScreenshot)driver;
			File screenshots=camera.getScreenshotAs(OutputType.FILE);
			System.out.println("Screenshot Taken: "+screenshots.getAbsolutePath());
			try {
				Files.move(screenshots, new File("src/main/resources/test_"+results.getStatus()+".png"));
				System.out.println(new File("src/main/resources/test_"+results.getStatus()+".png").getAbsolutePath());
			} catch (IOException e) {
				e.printStackTrace();
			}
		//}
	}
	
	
	public WindowManager provideHadleToWindowManager()
	{
		return new WindowManager(driver);
	}
	
	
}
