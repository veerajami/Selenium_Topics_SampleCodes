package popups;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingPopUps {
	
	
public static void main(String[] args) throws Exception{
	
	
	System.setProperty("webdriver.gecko.driver","D:\\Selenium\\driver\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	
	
	
	driver.manage().timeouts().implicitlyWait(20l, TimeUnit.SECONDS);
	
	driver.get("http://lenovo-pc/login.do");

	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//td[b[contains(text(),'Username:')]]//following::input[1]")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager",Keys.ENTER);
	
	driver.findElement(By.xpath("//a[text()='Time-Track']")).click();
	
	WebElement ttselect=driver.findElement(By.xpath("//select[@name='selectedUser']"));
	
	Select select=new Select(ttselect);
	
	select.selectByValue("2");
	
	driver.findElement(By.xpath("//a[contains(text(),' Add tasks to the list')]")).click();
	
	
	Thread.sleep(2000l);
	
	Set<String> handles=driver.getWindowHandles();
	
	Iterator<String> itr=handles.iterator();
	
	String parentwindow=itr.next();
	String childwindow=itr.next();
	
	driver.switchTo().window(childwindow);
	
	
	ttselect=driver.findElement(By.xpath("//select[@name='customerProject.shownCustomer']"));
	select=new Select(ttselect);
	
	select.selectByValue("2");
	
	ttselect=driver.findElement(By.xpath("//select[@name='customerProject.shownProject']"));
	
	select=new Select(ttselect);
	
	select.selectByValue("2");

	driver.findElement(By.xpath("//input[@value='Show Tasks']")).click();
	
	driver.findElement(By.xpath("//td[@class='listtblcell']/input")).click();
	
	driver.findElement(By.xpath("//input[@value='Add Selected Tasks to the List']")).click();

	driver.switchTo().window(parentwindow);
	
}
	

}
