package select_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MultiSelect {
	
	@Test
	public static void multi() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		WebElement drop_down=driver.findElement(By.xpath("//select[@id=\"multi-select\"]"));
		Select select=new Select(drop_down);
		
		System.out.println(select.isMultiple());
/*		try {
		select.deselectByIndex(2);
		}
		catch(Exception e)
		{
			System.out.println("Deselect by index 2 failed");
		}
		
		Thread.sleep(4000);
		select.selectByVisibleText("Florida");
		Thread.sleep(4000);
		select.selectByValue("New York");
		System.out.println(select.getFirstSelectedOption().getText());
		try {
		select.deselectByIndex(2);
		}
		catch(Exception e)
		{
			System.out.println("Deselect by index 2 failed again");
		}
		try {
			select.deselectByIndex(1);
			}
			catch(Exception e)
			{
				System.out.println("Deselect by index 1 failed finally");
			}
		Thread.sleep(4000);
		*/
		
		driver.close();
	}
	

}
