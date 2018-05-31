package fluent_wait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.sun.jna.Function;

public class FluentWaitDemo2 {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefoxdriver.driver", "");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://softwaretestingplace.blogspot.in/2017/02/selenium-fluent-wait.html");
		
		driver.manage().timeouts().implicitlyWait(20l, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(".//*[@id='post-body-5280210221385817166']/div[1]/button")).click();
	
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(30, TimeUnit.SECONDS)
			       .pollingEvery(5, TimeUnit.SECONDS)
			       .ignoring(NoSuchElementException.class);
		
/*		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		wait.withTimeout(30, TimeUnit.SECONDS);
		wait.pollingEvery(5, TimeUnit.SECONDS);
		wait.ignoring(NoSuchElementException.class);*/
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Software Testing Material - DEMO PAGE')]")));
		
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'Software Testing Material - DEMO PAGE')]")).getText());
		
		
		
		
		
	}
	

}
