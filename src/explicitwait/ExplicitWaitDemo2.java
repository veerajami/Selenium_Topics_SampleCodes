package explicitwait;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ExplicitWaitDemo2 {
	
	
	public static void main(String[] args) throws Exception{
		
		
		System.setProperty("webdriver.firefox.driver", "");
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.naukri.com/");
		
		driver.manage().timeouts().implicitlyWait(20l, TimeUnit.SECONDS);
		
		Thread.sleep(3000l);
		
		driver.findElement(By.xpath("//span[contains(text(),'Search Jobs')]")).click();
		
		WebDriverWait  wait=new WebDriverWait(driver, 5);
		
		
				
		Set<String> handles=driver.getWindowHandles();
		
		Iterator<String> itr=handles.iterator();
		
		String parentWindow=itr.next();
		
		driver.switchTo().window(parentWindow);
		
		driver.findElement(By.xpath("//input[@class='sugInp'][@rel='custom:1016']")).sendKeys("soft");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='sugDrp_skill'][@class='sugCont false slideDown']")));
		driver.findElement(By.xpath("//strong[text()='ware Testing']")).click();
		
		
		
		
		
		
	}
	
	

}
