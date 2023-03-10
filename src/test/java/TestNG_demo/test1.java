package TestNG_demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class test1 {
	WebDriver driver = new ChromeDriver();
	//declaring explicitwait
	WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
	
  @Test(priority=1)
  public void openapp() 
  {
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }
  @Test(priority=2)
  public void login()
  {
	
	  WebElement username = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		username.sendKeys("Admin");
		
	  WebElement password = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
		password.sendKeys("admin123");
		
	  WebElement click_btn = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
		click_btn.click();
		
  }
  @Test(priority=3)
  public void closeapp()
  {
	  driver.close();
  }
}
