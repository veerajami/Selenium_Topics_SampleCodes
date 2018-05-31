package smarttest;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility {

	public static String ChromePath="D:\\Selenium\\chromedriver_win32\\chromedriver.exe";
	public static WebElement isElementPresent(WebDriver driver,int time,String xpath)
	{
		WebElement element=null;
		
		for(int i=0;i<time;i++)
		{
		try {
			element=driver.findElement(By.xpath(xpath));
			break;
		}
		catch(Exception e) {
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException ex)
			{
				System.out.println("Waiting for element.......");
			}
		}
		
		}
		return element;
	}
}
