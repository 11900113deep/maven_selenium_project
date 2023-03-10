package Annotations_demo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations_class {
	
	
  @BeforeMethod
  void login()
  {
	System.out.println("login...."); 
  }
  
  @Test(priority=1)
  public void Search() {
	  System.out.println("Search");
  }
  
  @Test(priority=2)
  public void ASearch() {
	  System.out.println("Advanced Search");
  }
  
  @AfterMethod
  void logout()
  {
	  System.out.println("logout");
  }
}
