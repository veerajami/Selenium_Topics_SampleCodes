package selenium.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FreeCRMTest {

	@Test
	public void test1() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.freecrm.com/index.html");
		
		driver.findElement(By.xpath("//*[@id='loginForm']/div/input[1]")).sendKeys("vinjamius");
		driver.findElement(By.xpath(".//*[@id='loginForm']/div/input[2]")).sendKeys("freecrm$1992",Keys.ENTER);
		
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//input[@src='https://www.freecrm.com/skins/flatter/images/search.gif']")).click();
		
		
		
		
		
		
	}
	
}
