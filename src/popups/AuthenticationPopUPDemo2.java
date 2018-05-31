package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AuthenticationPopUPDemo2 {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		
		
		driver.manage().timeouts().implicitlyWait(200l, TimeUnit.SECONDS);
		
		//driver.get("https://jveera:veera$90107@sharepoint.spherecom.com/");
		
		driver.get("https://VJ5026263:oct$1992@syntelligence.syntelinc.com/");
		
		
		
	}
	

}
