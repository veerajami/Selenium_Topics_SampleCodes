package auto_suggest_in_google;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSuggest {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.driver", "");
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20l, TimeUnit.SECONDS);
		
		
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(20l, TimeUnit.SECONDS);
		
		driver.findElement(By.id("gs_htif0")).sendKeys("veera");
		List<WebElement> autosuggest=driver.findElements(By.xpath("//div[@class='sbqs_c']"));
	
		
		System.out.println(autosuggest.size());
		
		for(WebElement we:autosuggest)
		{
			
			System.out.println(we.getText());
			
		}
		
		
	}

}
