package Annotations_demo_1packk;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;

public class beforetest1 {
  @Test
  public void abc() {
	  System.out.println("method from beforetest1");
  }
  @BeforeTest
  void m()
  {
	  System.out.println("before test");
  }
  
  @BeforeSuite
  void a()
  {
	  System.out.println("before suite");
  }
  
  @AfterSuite
  void b()
  {
	  System.out.println("after suite");
  }
 
}
