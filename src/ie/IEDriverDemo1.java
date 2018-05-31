package ie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEDriverDemo1 {

	public static void main(String[] args) {
		
		System.out.println("Starts");
		System.setProperty("webdriver.ie.driver","D:\\Selenium\\IEDriverServer_Win32_3.5.1\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		
	}
	
}
