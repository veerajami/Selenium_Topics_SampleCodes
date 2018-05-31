package desired_capabilities;

import org.openqa.selenium.Platform;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesDemo {

	
	public static void main(String[] args) {
		
		
		
		DesiredCapabilities dc=new DesiredCapabilities();
		
		dc.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		//dc.setCapability(CapabilityType.PLATFORM,"XP");
		dc.setJavascriptEnabled(true);
		dc.setCapability(CapabilityType.TAKES_SCREENSHOT, true);
		
		
		
		System.setProperty("webdriver.firefox.driver", "");
		FirefoxDriver driver=new FirefoxDriver(dc);
	
		System.out.println(dc.getBrowserName());
		System.out.println(dc.isJavascriptEnabled());
		System.out.println(dc.getVersion());
		System.out.println(dc.getPlatform());
	}
		
	
}
