package select_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SingleSelectDemo {

	@Test
	public void select() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		WebElement drop_down=driver.findElement(By.xpath("//select[@id=\"select-demo\"][@class='form-control']"));
		Select select=new Select(drop_down);
		
		System.out.println(select.isMultiple());
/*		WebElement selected_first=select.getFirstSelectedOption();
		System.out.println(selected_first.getText());
		System.out.println(selected_first.getAttribute("innerHTML"));
		System.out.println(selected_first.getAttribute("innerText"));
		System.out.println(selected_first.getAttribute("value"));
		List<WebElement> lst=select.getOptions();
		for(WebElement element:lst)
			System.out.println(element.getText());
		
		select.selectByIndex(2);
		System.out.println(select.getFirstSelectedOption().getText());
		Thread.sleep(4000);
		select.selectByVisibleText("Friday");
		Thread.sleep(4000);
		select.selectByValue("Wednesday");
		Thread.sleep(4000);*/
		
		

		
	}
	
}
