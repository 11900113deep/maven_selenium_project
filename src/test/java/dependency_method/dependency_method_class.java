package dependency_method;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependency_method_class {
  @Test(priority=1)
  public void openapp() {
	  Assert.assertTrue(true);
  }
  @Test(priority=2,dependsOnMethods= {"openapp"})
  void login()
  {
	  Assert.assertTrue(false);
  }
  
  @Test(priority=3,dependsOnMethods= {"login"})
  void search()
  {
	  Assert.assertTrue(false);
  }
  
  @Test(priority=4,dependsOnMethods= {"login","search"})
  void Asearch()
  {
	  Assert.assertTrue(true);
  }
  
  @Test(priority=5,dependsOnMethods= {"login"})
  void logout()
  {
	  Assert.assertTrue(true);
  }
  
  
  
}
