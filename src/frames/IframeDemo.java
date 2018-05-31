package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IframeDemo {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.driver", "");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://toolsqa.com/iframe-practice-page/");
		
		driver.manage().timeouts().implicitlyWait(10l, TimeUnit.SECONDS);
		
		driver.switchTo().frame("iframe1");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Vin Jami");
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("iframe2");
		driver.findElement(By.xpath("//img[@src='http://demoqa.com/wp-content/uploads/2014/08/Tools-QA-213.png']")).click();
		System.out.println("success");
		
		
		
		
		
		
	}
	

}
