package hidden_div;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HiddenDiv {

	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.firefox.driver","");
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20l, TimeUnit.SECONDS);
		
		
		driver.get("http://lenovo-pc/login.do");	driver.findElement(By.xpath("//td[b[contains(text(),'Username:')]]//following::input[1]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager",Keys.ENTER);
		
		driver.findElement(By.xpath("//a[text()='Time-Track']")).click();
		
		
		
		driver.findElement(By.xpath("//img[@src='/img/default/support/support_button.gif']")).click();
		
		System.out.println("success");
		
		
		
	}
	
}
