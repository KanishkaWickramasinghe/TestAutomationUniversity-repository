package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileUploadPage {
	WebDriver driver;
	WebElement btnChooseFile;
	WebElement btnUploadFile;
	
	public FileUploadPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void uploadFile(String absolutePathForUploadingFile) {
		driver.findElement(By.id("file-upload")).sendKeys(absolutePathForUploadingFile);;
		uploadSelectedFile();
	}
	
	public void uploadSelectedFile() {
		btnUploadFile=driver.findElement(By.id("file-submit"));
		btnUploadFile.click();
	}
	
	public String getUploadedFileText() {
		return driver.findElement(By.id("uploaded-files")).getText();
	}
}
