package file_uploading;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadWithRobotDemo1 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.firefox.marionette", "");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		driver.findElement(By.xpath("//div[text()='Email or phone']/preceding-sibling::input")).sendKeys("vinjamiuk",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Enter your password']/preceding-sibling::input")).sendKeys("gmail$1992",Keys.ENTER);
		Thread.sleep(3000l);
		driver.navigate().to("https://mail.google.com/mail/u/0/#inbox");
		driver.findElement(By.xpath("//div[text()='COMPOSE']")).click();
		
		System.out.println("success");
		driver.findElement(By.xpath("//div[@id=':nw']")).click();
		
		
		
		
		
	}
	
	
	
	
	

}
