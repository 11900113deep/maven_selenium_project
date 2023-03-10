package Annotations_demo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;

public class Annotation_class1 {
	
	@BeforeClass
	void Login()
	{
		System.out.println("login...");
	}
  @Test(priority=1)
  public void Search() {
	  System.out.println("search..");
  }
  
  @Test(priority=2)
  public void ASearch() {
	  System.out.println("Advanced search..");
	  
  }
  
  @AfterClass
  void logout()
  {
	  System.out.println("logout...");
  }
  
}
