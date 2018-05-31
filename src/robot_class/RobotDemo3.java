package robot_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotDemo3 {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm&osid=1&service=mail&ltmpl=default&rm=false&flowName=GlifWebSignIn&flowEntry=AddSession");
		driver.findElement(By.xpath("//div[div[text()='Email or phone']]/input")).sendKeys("vinjamiuk",Keys.ENTER);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("gmail$1992",Keys.ENTER);
		System.out.println("success");
		driver.findElement(By.xpath("//div[text()='COMPOSE']")).click();
		
		driver.findElement(By.xpath("//div[div[@aria-label='Insert files using Drive']]/div[1]/div")).click();
		StringSelection sel=new StringSelection("gmail$1992");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		

	}

}
