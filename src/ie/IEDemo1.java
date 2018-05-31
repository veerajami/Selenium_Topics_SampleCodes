package ie;



import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;



public class IEDemo1 {

	public static void main(String[] args) {
	
		File ieFile = new File("D:\\Selenium\\driver\\IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", ieFile.getAbsolutePath());
		DesiredCapabilities ieCaps = DesiredCapabilities.internetExplorer();
		ieCaps.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL, "http://127.0.0.1/login.do");
		WebDriver driver = new InternetExplorerDriver(ieCaps);
		driver.manage().window().maximize();
		
		WebElement username_textbox=driver.findElement(By.name("username"));
		WebElement password_textbox=driver.findElement(By.name("pwd"));
		WebElement login_button=driver.findElement(By.name("//input[contains(@value,'Login now')]"));
		username_textbox.sendKeys("admin");
		password_textbox.sendKeys("manager");
		login_button.click();
	
	}

}
