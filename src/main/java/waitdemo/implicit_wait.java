package waitdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicit_wait {
	
	public static void main(String args[])
	{
		//
		System.setProperty("webdriver.chrome.driver", "C://selenium//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//open url 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//implicit wait syntax
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//enter username
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		//password
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		//click button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//Capture title of home page
		String title = driver.getTitle();
		String actualtitle = "OrangeHRM";
		System.out.println(title);
		//verifying title page
		if(actualtitle.equals(title))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}
		
		// close driver
		driver.close();
		// quit driver driver.quit();
	}
	
}

