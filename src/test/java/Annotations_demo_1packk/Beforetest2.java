package Annotations_demo_1packk;

import org.testng.annotations.*;

public class Beforetest2 {
  @Test
  public void xyz() {
	  System.out.println("method from beforetest2");
  }
  
  @AfterTest
  void n()
  {
	  System.out.println("after test");
  }
}

