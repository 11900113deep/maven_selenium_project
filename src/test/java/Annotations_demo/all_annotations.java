package Annotations_demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class all_annotations {
	
	@BeforeSuite
	void beforesuite()
	{
		System.out.println("before suite..");
	}
	
	@BeforeClass
	void beforeclass()
	{
		System.out.println("before class...");
	}
	@BeforeMethod
	  void beforemethod()
	  {
		System.out.println("before method...."); 
	  }
  @Test(priority=1)
  public void Search() {
	  System.out.println("search..");
  }
  
  @Test(priority=2)
  public void ASearch() {
	  System.out.println("Advanced search..");
	  
  }
  @BeforeMethod
  void aftermethod()
  {
	System.out.println("after method...."); 
  }
  
  @AfterClass
  void afterclass()
  {
	  System.out.println("after class...");
  }
  @AfterSuite
	void aftersuite()
	{
		System.out.println("after suite..");
	}
}
