package flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_class {
	
	public static void main(String args[]) throws InterruptedException
	{
		//
		System.setProperty("webdriver.chrome.driver", "C://selenium//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//open url 
		driver.get("https://www.flipkart.com/");
		
		//maximizing window
		driver.manage().window().maximize();
		
		//get title of flipkart
		String title = driver.getTitle();
		System.out.println(title);
		
		//validating the title with expected 
		String actualtitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		if(actualtitle.equals(title))
		{
			System.out.println("title is validated");
		}
		else
		{
			System.out.println("title is not validated");
		}
		
		
		//get current url of the flipkart
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//validating the title with expected 
		String actualurl = "https://www.flipkart.com/";
		if(actualurl.equals(url))
		{
			System.out.println("url is validated");
		}
		else
		{
			System.out.println("url is not validated");
		}
		
		//validating page source title
		String pageSource_title = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books &amp; More. Best Offers!";
		if(driver.getPageSource().contains(pageSource_title))
		{
			System.out.println("Title is present in page source");
		}
		else
		{
			System.out.println("Title is not present in page source ");
		}
		Thread.sleep(2000);
		//close the window
		driver.close();

}
}


