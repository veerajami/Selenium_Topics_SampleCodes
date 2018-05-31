package AutoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import smarttest.Utility;

public class UploadDemo {
	
	@Test
	public void loginToGmail() throws IOException, InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.xpath("//div[text()='Email or phone']/preceding-sibling::input[1]")).sendKeys("vinjamius",Keys.ENTER);
		Utility.isElementPresent(driver, 10,"//div[text()='Enter your password']/preceding-sibling::input[1]").sendKeys("gmail$1992",Keys.ENTER);
		Utility.isElementPresent(driver, 10, "//div[text()='COMPOSE']").click();
		Utility.isElementPresent(driver, 10, "//textarea[@aria-label='To']").sendKeys("vinjamius@gmail.com",Keys.ENTER,Keys.TAB,"UploadWithSelenium");
		driver.findElement(By.xpath("//div[@data-tooltip='Attach files']/div/div")).click();
		Runtime.getRuntime().exec("D:\\AutoIT\\GmailUpload.exe");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Send']")).click();
		
		
		
	}
	

}
