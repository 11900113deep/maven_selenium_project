package waitdemo;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fluent_wait {
	
	public static void main(String args[])
	{
		//
		System.setProperty("webdriver.chrome.driver", "C://selenium//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//open url 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//implicit wait syntax
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//maximizing window
		driver.manage().window().maximize();
		
		//declaring explicitwait
		FluentWait mywait = new FluentWait(driver);
		mywait.withTimeout(Duration.ofSeconds(30));
		mywait.pollingEvery(Duration.ofSeconds(5));
		mywait.ignoring(NoSuchElementException.class);
		
				
		
		WebElement username = (WebElement) mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		username.sendKeys("Admin");
		
		WebElement password = (WebElement) mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
		password.sendKeys("admin123");
		
		WebElement click_btn = (WebElement) mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
		click_btn.click();
		
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

