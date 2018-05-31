package actions_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {

	
	public static void main(String[] args) throws InterruptedException{
		
		
		System.setProperty("webdriver.firefox.driver","");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.kgisliim.ac.in/#");
		Thread.sleep(4000l);
		
		try {
		
		WebElement we=driver.findElement(By.xpath("//a[text()='About Us']"));
		System.out.println("found");
		
		Actions act=new Actions(driver);
		
		act.moveToElement(we).perform();
		
		System.out.println("success");
		
		
		}
		
		catch(Exception exe)
		{
			System.out.println("element not found");
		}
		
		
		
		
	}
	
	
}
