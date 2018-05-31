package actions_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDemo2 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.firefox.driver", "");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://rightstartmath.com/our-curriculum/spotlight-on-kids/");
		
		WebElement element=driver.findElement(By.xpath("//a[text()='Our Curriculum']"));
		
		Actions action=new Actions(driver);
		
		action.moveToElement(element).build().perform();
		
		Thread.sleep(3000);
		
		element=driver.findElement(By.xpath("//li[@id='menu-item-72']/a"));
		action.moveToElement(element).build().perform();
		
		Thread.sleep(3000);
		
		

		element=driver.findElement(By.xpath("//li[@id='menu-item-77']/a"));
		
		System.out.println(element.getText());
		Thread.sleep(3000);
		
		System.out.println("success");
		
		action.moveToElement(element).build().perform();
		
		JavascriptExecutor executor = (JavascriptExecutor)driver; 
		executor.executeScript("arguments[0].click();", element);
		
		action.moveToElement(element).build().perform();
		
		
		System.out.println("success");
		
		String str=driver.findElement(By.xpath("//h1[text()='First vs. Second Edition']")).getText();
		
		System.out.println(str);
		
		if(str.equals("FIRST VS. SECOND EDITION"))
		System.out.println("Test case Pass");
		else
		System.out.println("Test case Fail");
		
		
		
		
		
		
		
	}
	

}
