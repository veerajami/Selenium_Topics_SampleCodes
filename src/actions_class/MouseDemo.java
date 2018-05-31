package actions_class;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDemo {
	
	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.firefox.driver", "");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10l, TimeUnit.SECONDS);
		
		
		driver.get("https://www.flipkart.com/?semcmpid=sem_8024046704_brand_goog&tgi=sem%2C1%2CG%2C8024046704%2Cg%2Csearch%2C%2C196142066293%2C1t1%2Ce%2Cflipkart%2Cc%2C%2C%2C%2C%2C%2C%2C&gclid=CjwKCAjwpfzOBRA5EiwAU0ccN3jzM4OiiN-yjpZxnh87XxOT1sMxZsCuzHoRuviA0U4spfILkpGmxBoC8vAQAvD_BwE");
		
		
		
		Actions actions=new Actions(driver);
		
		
		List<WebElement> imgs=driver.findElements(By.xpath("//div[@class='_2QUpwp required-tracking'] [@data-tracking-id='Top Offers on TVs & Appliances']//div[@class='_2kSfQ4']//img"));
		
		System.out.println("success");
		
		for(WebElement we:imgs)
		{
			
			actions.moveToElement(we).build().perform();
			Thread.sleep(4000l);
		}
		
		
		/*System.out.println("success");
				
		actions.moveToElement(driver.findElement(By.xpath("//span[text()='Appliances']"))).build().perform();
		
		Thread.sleep(5000l);
		
		System.out.println("sucecess");
		
		actions.moveToElement(driver.findElement(By.xpath("//span[text()='Kitchen Appliances']"))).build().perform();
		
		Thread.sleep(5000l);
		
		System.out.println("success");
		
		actions.moveToElement(driver.findElement(By.xpath("//span[text()='Oven Toaster Grills']"))).build().perform();
		
		
		Thread.sleep(3000l);
		
		System.out.println("success");*/
				
	}


	
}
