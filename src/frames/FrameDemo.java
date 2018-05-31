package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class FrameDemo {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.freecrm.com/index.html");
		
	
		driver.findElement(By.xpath("//*[@id='loginForm']/div/input[1]")).sendKeys("vinjami");
		driver.findElement(By.xpath("//*[@id='loginForm']/div/input[2]")).sendKeys("freecrm$1992",Keys.ENTER);
		try {
			System.out.println("logged in and finding the frame");
		WebElement leftpanel_frame=driver.findElement(By.xpath("//frame[@name='leftpanel']"));
		System.out.println("switching the frame");
		driver.switchTo().frame("mainpanel");
		System.out.println("finding the element on frame");
		WebElement logo_text=driver.findElement(By.xpath("//td[text()='CRMPRO']"));
		System.out.println("element found");
		System.out.println(logo_text.getAttribute("innerHTML"));}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
