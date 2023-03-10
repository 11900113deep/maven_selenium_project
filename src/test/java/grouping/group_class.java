package grouping;

import org.testng.annotations.Test;

public class group_class {
  @Test(priority=1,groups = {"sanity","regression"})
  public void loginByemail() {
	  System.out.println("this is login by email");
  }
  
  @Test(priority=2,groups = {"sanity"})
  public void loginBytwitter() {
	  System.out.println("this is login by twitter");
  }
  
  @Test(priority=3,groups = {"sanity"})
  public void loginByFacebook() {
	  System.out.println("this is login by Facebook");
  }
  
  @Test(priority=4,groups = {"sanity","regression"})
  public void loginByinstagram() {
	  System.out.println("this is login by instagram");
  }
  
  @Test(priority=5,groups = {"regression"})
  public void loginBymobile() {
	  System.out.println("this is login by mobile");
  }
  
}
