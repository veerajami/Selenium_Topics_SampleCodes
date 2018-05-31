package chrome;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsDisable {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		Map<String,Object> prefs=new HashMap<String,Object>();
		
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options=new ChromeOptions();
		
		options.setExperimentalOption("prefs", prefs);
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
		 driver.findElement(By.xpath("//label[text()='Email or Phone']/following::td[2]/input")).sendKeys("meetjvn@gmail.com",Keys.TAB,"facebook$1992",Keys.ENTER);
		 Thread.sleep(4000);
	}

}
