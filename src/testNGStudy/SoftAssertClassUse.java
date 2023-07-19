package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertClassUse {
	
	SoftAssert s=new SoftAssert();
  @Test
  public void vctcPune() {
	  String s1="deva";
	  String s2="deva";
	  s.assertEquals(s2, s1,"Not maching");
	  Reporter.log("assert equals test pass", true);
	  
	  s.assertNotEquals(s1, s2, "Is matched");
	  Reporter.log("not equal test is running", true);
	  
	  s.assertNotNull(s1,"is null");
	  Reporter.log("Not null is running", true);
	  s.assertAll();
	  
  }
}
