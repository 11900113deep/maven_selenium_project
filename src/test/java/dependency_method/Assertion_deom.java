package dependency_method;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_deom {
  @Test
  public void abc() {
	  int a = 10;
	  int b = 20;
//	  String s1  = "mandeep";
//	  String s2 = "Deep";
//	  Assert.assertNotEquals(s1, s2);
//	  if(false)
//	  {
//		  Assert.assertTrue(true);
//	  }
//	  else
//	  {
//		  Assert.fail();
//	  }
	  //Assert.assertEquals(a,b);
	  //Assert.assertTrue(true); //pass
	  //Assert.assertFalse(true); //pass
	 // Assert.assertEquals(actual,expected,description);
	  Assert.assertEquals(a>b, true,"a is not greater than b"); //description only executes in case of invalid
	  
	  
  }
}
