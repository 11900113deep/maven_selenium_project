package facebook;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

public class facebook_demo {
	WebDriver driver = new ChromeDriver();
  @BeforeClass
  void openapp()
  {
	  //opening url
	  driver.get("https://www.facebook.com");
	  driver.manage().window().maximize();
	  //validating the url using assertion
	  String actual_url = driver.getCurrentUrl();
	  Assert.assertEquals(actual_url,"https://www.facebook.com/","Url are not matching");
	  
	  
  }
  @Test
  void create_acc_verify()
  {
	  //verifying create account section on the page
	  boolean status = driver.findElement(By.xpath("(//a[normalize-space()='Create new account'])[1]")).isDisplayed();
	  Assert.assertEquals(status,true,"create section not found");
	  //opening registration form
	  driver.findElement(By.xpath("(//a[normalize-space()='Create new account'])[1]")).click();
	  
	  
  }
  @Test
  void register_form()
  {
	  //registering to facebook account
	  driver.findElement(By.xpath("//input[@id='u_q_b_wj']")).sendKeys("Mandeep");
	  driver.findElement(By.xpath("//input[@id='u_q_d_ub']")).sendKeys("kaur");
	  driver.findElement(By.xpath("//input[@id='u_q_g_dP']")).sendKeys("12345678");
	  driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("mand@11eep");
	  
	  Select drop = new Select(driver.findElement(By.xpath("//select[@id='day']")));
		drop.selectByVisibleText("11");
	  Select drop1 = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		drop.selectByVisibleText("Feb");
	  Select drop2 = new Select(driver.findElement(By.xpath("//select[@id='year']")));
		drop.selectByVisibleText("2001");
	  WebElement rfemale = driver.findElement(By.xpath("//label[@for='u_1b_4_vl']"));
	  rfemale.click();
	  driver.findElement(By.xpath("//button[@id='u_1b_s_Ne']")).click();
	  
	  }
  @AfterClass
  void terminate()
  {
	  driver.close();
  }
  
  
}

