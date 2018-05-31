package select_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SelectFBDemo1 {

	
	@Test
	public void selectDD() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		driver.get("https://www.facebook.com/");
		WebElement ddmenu=driver.findElement(By.xpath(".//select[@id='day']"));
		
		Select dd_select=new Select(ddmenu);
		
		
		
		//verifying default selected option
		WebElement selected_option=dd_select.getFirstSelectedOption();
		Assert.assertEquals(selected_option.getText(), "12");
		
		//selecting an option with index 
		dd_select.selectByIndex(1);
		
		selected_option=dd_select.getFirstSelectedOption();
		System.out.println(selected_option.getText());
		Assert.assertEquals(selected_option.getText(), "1");
		
		ddmenu=driver.findElement(By.xpath(".//select[@id='month']"));
		dd_select=new Select(ddmenu);
		
		//selecting an option with Value
		dd_select.selectByValue("6");
		
		selected_option=dd_select.getFirstSelectedOption();
		System.out.println(selected_option.getText());
		Assert.assertEquals(selected_option.getText(), "Jun");
		
		//selecting an option with visible text
		ddmenu=driver.findElement(By.xpath(".//select[@id='year']"));
		
		dd_select=new Select(ddmenu);
		dd_select.selectByVisibleText("1996");
		
		selected_option=dd_select.getFirstSelectedOption();
		System.out.println(selected_option.getText());
		Assert.assertEquals(selected_option.getText(), "1996");
		
		Thread.sleep(4000);
		driver.quit();
	}
	
	
	
}
