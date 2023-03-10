package Annotations_demo;

import org.testng.annotations.Test;

public class invocation_count {
  @Test(invocationCount=10)
  public void demo() {
	  System.out.println("testing.....");
  }
}
