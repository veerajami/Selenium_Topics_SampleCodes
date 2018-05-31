package robot_class;
import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotDemo1 {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/shop/men");
		driver.manage().window().maximize();
		
		WebElement men=driver.findElement(By.xpath("//a[text()='Men'][@class='desktop-main']"));
		
		Point p=men.getLocation();
		int x=p.getX();
		int y=p.getY();
		
		Dimension d=men.getSize();
		int ht=d.getHeight();
		int wd=d.getWidth();
		
		System.out.println("success");
		Robot robot=new Robot();
		robot.mouseMove(x, y);
		System.out.println("success");
		
		
		
		
		
		

	}

}
