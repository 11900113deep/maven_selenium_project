package dependency_method;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class hard_assertions {
  @Test
  public void hardassertion() {
	  System.out.println("testing..");
	  System.out.println("testing..");
	  System.out.println("testing..");
	  System.out.println("testing..");
	  //hard assertion
	  Assert.assertEquals(1,2);
	  System.out.println("testing..333");
	  Assert.assertEquals(1, 1);
	  System.out.println("hard assertion passes");
	  
	  
	  //soft assertion
	  //SoftAssert sa = new SoftAssert();
	 // sa.assertEquals(1, 2);
	 // System.out.println("soft assertion completed..");
	 // sa.assertEquals(1,1);
	  //sa.assertAll(); //mandatory
  }
}

