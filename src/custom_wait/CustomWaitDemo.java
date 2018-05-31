package custom_wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CustomWaitDemo {

	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.firefox.driver", "");
		
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://softwaretestingplace.blogspot.in/2017/02/selenium-fluent-wait.html");
		
		driver.findElement(By.xpath(".//*[@id='post-body-5280210221385817166']/div[1]/button")).click();
		
	
/*		FluentWait<WebElement> wait=new FluentWait<WebElement>(driver);
				.withTimeout(20, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);*/
		
		
	
		
		WebElement element=(new WebDriverWait(driver,10)).until(new ExpectedCondition<WebElement>() {
		@Override
		public WebElement apply(WebDriver driver) {
				
		return driver.findElement(By.xpath("//p[contains(text(),'Software Testing Material - DEMO PAGE')]"));		
				
		}});
		
	
		System.out.println(element.getText());
		
	}
	
	
	
}
