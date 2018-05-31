package close.quit;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1 {
	
	@Test
	public void closeQuitTest() throws AWTException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10l, TimeUnit.SECONDS);
		
		driver.get("http://gmail.com");
		String parent=driver.getWindowHandle();
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_N);
		Set<String> handles=driver.getWindowHandles();
		Iterator itr=handles.iterator();
		parent=itr.next().toString();
		String child=itr.next().toString();
		driver.switchTo().window(child);
		driver.navigate().to("http://yahoo.com");
		driver.close();
		try {
			Thread.sleep(5000l);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}

}
