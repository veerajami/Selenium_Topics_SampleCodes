package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUpDemo2 {

	
	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.firefox.driver","");
		
		
		WebDriver  driver=	new FirefoxDriver();
		
		
		driver.get("https://www.aliexpress.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//a[text()='x']")).click();
		/*Alert alert=driver.switchTo().alert();
		
		alert.dismiss();*/
		
		
	}
	
	
}
