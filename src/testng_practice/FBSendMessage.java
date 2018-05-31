package testng_practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class FBSendMessage {
	
	WebDriver driver;
	
	@BeforeClass
	public void startBrowser()
	{
		
		
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 
		
		
	}
	
	@Test(priority=1,description="This will login to facebook")
	public void login() throws Exception
	{

		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//label[text()='Email or Phone']/following::td[2]/input")).sendKeys("meetjvn@gmail.com",Keys.TAB,"facebook$1992",Keys.ENTER);
		String title=driver.getTitle();
		Assert.assertEquals("Facebook", title,"Title doesn't match please verify");

	}
	
	@Test(priority=2,description="This will Scroll the page",dependsOnMethods="login")
	public void scroll() throws Exception
		{	
			
			driver.switchTo().activeElement();
			driver.findElement(By.xpath("//a[text()='Turn On']/preceding-sibling::a")).click();
			driver.switchTo().activeElement();
			JavascriptExecutor jse=((JavascriptExecutor)driver);
			jse.executeScript("scroll(0,500)");
			Assert.assertTrue(true);
			
	}
	
	@Test(priority=3,description="This will turn ON the chat")
	public void turnOnChat() throws InterruptedException
	{
		
		List<WebElement> lst=driver.findElements(By.xpath("//a[text()='Turn on chat']"));
		WebElement turnChat=lst.get(0);
		turnChat.click();
		Assert.assertTrue(true);
	}
	
	@Test(priority=4,description="This will enable the chat and sent a Message",dependsOnMethods="login")
	public void sendMessage() throws Exception
	{
		
		

		driver.findElement(By.xpath("//div[div[a[@data-tooltip-content='Options']]]/preceding-sibling::div[1]//input[@placeholder='Search']")).sendKeys("vin");
		
		
		//driver.findElement(By.xpath("//div[text()='More People']/following-sibling::ul//span[text()='Dhanunjaya Battini']")).click();
		driver.findElement(By.xpath("//div[text()='Contacts']/following-sibling::ul//div[text()='Vinod Kumar']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'_5rpu') and @role='combobox']")).sendKeys("Hey I'm sending this message with Selenium",Keys.ENTER);
		SoftAssert assertion=new SoftAssert();
		assertion.assertEquals("Hey Im sending this message with Selenium",driver.findElement(By.xpath("//span[text()='Hey Im sending this message with Selenium']")).getText(),"Message not matched");
		assertion.assertAll();
		
	}
	
	@Test(priority=5,dependsOnMethods="turnOnChat",description="This will turn off the chat")
	public void turnOffChat() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//a[@data-tooltip-content='Options']")).click();
		
		driver.findElement(By.xpath("//span[text()='Turn Off Chat']")).click();
		Thread.sleep(5000);
		driver.switchTo().activeElement();
		driver.findElement(By.xpath("//td[label[div[text()='Turn off chat for all contacts']]]/preceding-sibling::td/input")).click();
		driver.findElement(By.xpath("//button[text()='Okay']")).click();
		driver.switchTo().activeElement();
	}
	@Test(priority=6,description="This will logout the application",dependsOnMethods="login")
	public void logout()
	{
		
		driver.findElement(By.xpath("//div[text()='Account Settings']")).click();
		driver.findElement(By.xpath("//span[text()='Log Out']")).click();
	}
	
	@AfterClass
	public void after()
	{
		
		driver.close();
		
	}

}
