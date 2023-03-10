package facebook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Flipkart_demo {
	WebDriver driver = new ChromeDriver();
	
  @BeforeClass
  public void openapp() {
	  driver.get("https://www.flipkart.com/");
	  driver.manage().window().maximize();
	  
  }
  @Test(priority=1)
  void get_links_count()
  {
	  List<WebElement> LinksCount = driver.findElements(By.tagName("a"));
	  System.out.println("Number of links on Flipkart page : "+LinksCount.size());
  }
  @Test(priority=2)
  void get_link_text()
  {
	  List<WebElement> Links = driver.findElements(By.tagName("a"));
		
		for(WebElement link:Links){
			System.out.println("Link Text : "+ link.getText());
			System.out.println("Link URL  : "+ link.getAttribute("href"));
			
			}
  }
  @AfterClass
  void closeApp() {
	  driver.close();
  }
}

