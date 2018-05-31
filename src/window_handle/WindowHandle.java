package window_handle;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandle {
	
	public static void main(String[] args) throws Exception{
		
		
		System.setProperty("webdriver.firefox.driver", "");
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30l, TimeUnit.SECONDS);
		
		
		
		driver.navigate().to("https://www.irctc.co.in/eticketing/loginHome.jsf");
		
		driver.manage().window().maximize();
		
		WebElement tourist=driver.findElement(By.xpath("//a[@href='http://www.irctctourism.com/']"));
		
		System.out.println("Found");
		
		tourist.click();
		System.out.println("Clicked");
		
		Thread.sleep(2000l);
		
		Set<String>  windowhandles=driver.getWindowHandles();
		
		System.out.println("success");
		
		
		Iterator<String> itr=windowhandles.iterator();
		
		System.out.println("iterator success");
		
		
		String parentwinhandler=itr.next();
		String child1windhandler=itr.next();
		
		System.out.println("added iterators");
		driver.switchTo().window(child1windhandler);
		
		System.out.println("switched to window");
		driver.findElement(By.xpath("//a[text()='Flights']")).click();
		
		Thread.sleep(2000l);
		
		System.out.println("found flights");
		windowhandles=driver.getWindowHandles();

		System.out.println(windowhandles.size());
		
		System.out.println("success");
		itr=windowhandles.iterator();
		
		
		
		itr.next();
		itr.next();
		
	
		
		String child2windhandler=itr.next();
		
		
		
		driver.switchTo().window(child2windhandler);
		
		System.out.println("switched to window2");
		WebElement radio=driver.findElement(By.xpath("//div[@class='roundtripradio']/input"));
		
		System.out.println(radio.getAttribute("value"));
		
		
		driver.switchTo().window(parentwinhandler);
		
		driver.findElement(By.xpath("//a[@href='http://www.ftr.irctc.co.in']")).click();
		
		Thread.sleep(2000l);
		
		windowhandles=driver.getWindowHandles();
		
		System.out.println("got the 4rth win handle");
		
		itr=windowhandles.iterator();
		
		
		System.out.println("added to iterator");
		itr.next();
		
		
		System.out.println(windowhandles.size());
		
		String child3handle=itr.next();
		
		driver.switchTo().window(child3handle);
		
		
			
		
		
		WebElement textbox=driver.findElement(By.xpath("//input[@name='visitor/name']"));
		
		System.out.println("element found");
		
		textbox.sendKeys("Congrats");
		
		driver.switchTo().window(parentwinhandler);
		Thread.sleep(2000l);
		driver.switchTo().window(child1windhandler);
		
		Thread.sleep(2000l);
		driver.switchTo().window(child2windhandler);
		Thread.sleep(2000l);
		driver.switchTo().window(child3handle);
		
		
		
		
		
		
	}
	

}
