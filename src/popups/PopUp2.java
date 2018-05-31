package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUp2 {

	
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		
		
		driver.manage().timeouts().implicitlyWait(200l, TimeUnit.SECONDS);
		
		driver.get("http://lenovo-pc/login.do");
		driver.findElement(By.xpath("//td[b[contains(text(),'Username:')]]//following::input[1]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager",Keys.ENTER);
		
		driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
		
		driver.findElement(By.xpath("//a[text()='SPS']")).click();
		
		driver.findElement(By.xpath("//input[@value='Delete This Customer']")).click();
		
		Alert alert=driver.switchTo().alert();
		
		Thread.sleep(2000l);
		alert.dismiss();
		
		driver.findElement(By.xpath("//input[@value='Delete This Customer']")).click();
		Thread.sleep(2000l);
		
		alert.accept();
		
		driver.findElement(By.xpath("//input[@onclick='showCustomersProjects(this.form);']")).click();
		
		System.out.println("success");
	
	
	}
	
}
