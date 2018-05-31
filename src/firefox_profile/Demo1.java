package firefox_profile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

/*	@Test
	public void profileDemo()
	{
		
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\driver\\geckodriver.exe");
		
		ProfilesIni pi=new ProfilesIni();
		FirefoxProfile profile=pi.getProfile("default");
		WebDriver driver=new FirefoxDriver();
		
		
		

		
		
	}
	*/
	public static void main(String args[])
	{
	System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\driver\\geckodriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	System.out.println("Success");
}
}
