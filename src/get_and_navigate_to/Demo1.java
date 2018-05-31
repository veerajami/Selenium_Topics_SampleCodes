package get_and_navigate_to;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1 {
	
    
	WebDriver driver;

	@Test
	public void getCheck() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10l, TimeUnit.SECONDS);
		driver.get("http://gmail.com");
		driver.navigate().to("http://yahoo.com");
		String title=driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
	}

}
