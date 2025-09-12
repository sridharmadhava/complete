package execute;

import org.testng.annotations.Test;

import pages.*;
public class runSignup {
  @Test
  public void f() throws Exception {
	  Signup sp=new Signup();
	  sp.beforeTest();
	  sp.signup();
	  sp.afterTest();
	
  }
  
}

