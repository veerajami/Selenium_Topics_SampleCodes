package broken_links_and_images;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=uPBqWsjQMqGmX__MisAM");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		for(int i=0;i<links.size();i++)
		{
			
			String href=links.get(0).getAttribute("href");
			validateLink(href);
			
			
		}
		
	}
	
	
	
	public static void validateLink(String href) {
	
		try {
			URL url=new URL(href);
			HttpURLConnection httpconnect=(HttpURLConnection)url.openConnection();
			httpconnect.setConnectTimeout(3000);
			httpconnect.connect();
			
			if(httpconnect.getResponseCode()==200) {
				System.out.println(href+" "+httpconnect.getResponseMessage());
			}
		   if(httpconnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
				{System.out.println(href+" "+httpconnect.getResponseMessage()+HttpURLConnection.HTTP_NOT_FOUND);}
			
			
		} catch (Exception e) {
			
					}
		
	}
	
}
