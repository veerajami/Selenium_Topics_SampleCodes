package fluent_wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


import com.google.common.base.Function;

public class FluentWaitDemo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		driver.findElement(By.xpath(".//*[@id='post-body-7708391096228750161']/button")).click();
		
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(10, TimeUnit.SECONDS)
				.pollingEvery(250, TimeUnit.MILLISECONDS)
				.ignoring(NoSuchElementException.class);
		
		WebElement element=wait.until(new Function<WebDriver, WebElement>()
		{

	
			public WebElement apply(WebDriver driver) {
				
				WebElement ele=driver.findElement(By.xpath(".//*[@id='demo']"));
				String value=ele.getAttribute("innerHTML");
				
				if(value.equalsIgnoreCase("WebDriver"))
					{
					return ele;
					}
				else {
					System.out.println("The current value is :"+ele.getAttribute("innerHTML"));
					return null;
				}
				
			}
			
		});
		System.out.println(element.getAttribute("innerHTML"));
		System.out.println("The Visibility of current element displayed ?"+element.isDisplayed());
		driver.quit();
	}
	

}
