package desired_capabilities;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FbloginDemo {

	static RemoteWebDriver driver;
	static DesiredCapabilities dc;
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\driver\\geckodriver.exe");
		dc=new DesiredCapabilities().firefox();
		dc.setPlatform(Platform.VISTA);
		dc.setBrowserName("firefox");
		 driver=new RemoteWebDriver(new URL("http://192.168.0.2:7889/wd/hub"), dc);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
		 driver.findElement(By.xpath("//label[text()='Email or Phone']/following::td[2]/input")).sendKeys("meetjvn@gmail.com",Keys.TAB,"facebook$1992",Keys.ENTER);
		 	Thread.sleep(4000);
			driver.switchTo().activeElement();
			driver.findElement(By.xpath("//a[text()='Turn On']/preceding-sibling::a")).click();
			driver.switchTo().activeElement();
			JavascriptExecutor jse=((JavascriptExecutor)driver);
			jse.executeScript("scroll(0,500)");
			driver.findElement(By.xpath("//a[@data-tooltip-content='Options']")).click();
		 
		 //For Frame Alert
		 /*driver.switchTo.frame(driver.findElement(By.id(locatorToIdentifyFrame)));       
		 driver.findElement(By.id(locatorToCloseAd)).click(); //Close Ad
		 driver.switchTo().defaultContent();
		*/
	}

}
