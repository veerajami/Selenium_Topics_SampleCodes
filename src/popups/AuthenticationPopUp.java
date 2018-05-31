package popups;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import smarttest.Utility;

public class AuthenticationPopUp {
	
	@Test
	public void authenticate() throws IOException
	{
		System.setProperty("webdriver.firefox.marionette", "");
		//System.setProperty("webdriver.chrome.driver",Utility.ChromePath );
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(" https://www.engprod-charter.net/");
		Runtime.getRuntime().exec("D:\\AutoIT\\Authentication_firefox.exe");
		System.out.println("Success");
		
		
		
	}
	
	

}
