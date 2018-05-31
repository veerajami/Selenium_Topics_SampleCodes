package alert_handling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertHanldeDemo2 {

	WebDriver driver;
	@BeforeMethod
	public void initialize() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
				
	}
	
/*	@Test
	public void bootStrapAlert()
	{
		driver.get("http://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html");
		driver.findElement(By.xpath("//button[contains(text(),'Normal success message')]")).click();
		driver.findElement(By.xpath("//div[@class='alert alert-success alert-normal-success']/button[text()='×']")).click();
		
	}*/

	
	@Test
	public void bootStrapModal() throws InterruptedException
	{
		driver.get("http://www.seleniumeasy.com/test/bootstrap-modal-demo.html");
		driver.findElement(By.xpath("html/body/div[2]/div/div[2]/div[1]/div/div/div[2]/a")).click();
		
	   // Alert alert=driver.switchTo().alert();
	//    alert.dismiss();
		driver.switchTo().activeElement();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='myModal0']/div/div/div[4]/a[2]")).click();
		driver.findElement(By.xpath("html/body/div[2]/div/div[2]/div[2]/div/div/div[2]/a")).click();
		driver.switchTo().activeElement();
		driver.findElement(By.xpath("//a[text()='Launch modal']")).click();
		Thread.sleep(2000);
		
	}
	
	@AfterMethod
	public void end() throws Exception
	{
		Thread.sleep(4000);
		driver.close();
	}
	
	
}
