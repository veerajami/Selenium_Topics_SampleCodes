package chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverDemo {

	
	public static void main(String[] args) throws Exception{
		
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); 

		
		
		
		Thread.sleep(3000l);
		
		driver.get("https://www.naukri.com/");
		
		
		
	}
	
	
	
}
