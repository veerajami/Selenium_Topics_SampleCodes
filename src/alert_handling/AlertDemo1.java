package alert_handling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class AlertDemo1 {

	public static void main(String[] args) throws InterruptedException {
/*		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\driver\\chromedriver.exe");
		ProfilesIni profile=new ProfilesIni();
		FirefoxProfile fp=profile.getProfile("default");
		WebDriver pdriver=new FirefoxDriver(fp);
		
		
		*/
		
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		WebElement element=driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
		element.click();
		Alert alert=driver.switchTo().alert();
		Thread.sleep(4000);
		alert.accept();
	//	driver.switchTo().activeElement();
		element.click();
		
		
		
	}

}
