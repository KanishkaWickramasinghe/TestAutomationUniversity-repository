package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import pages.HomePage;

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
	
	
	
}
