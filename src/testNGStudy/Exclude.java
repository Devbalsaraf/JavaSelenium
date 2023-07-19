package testNGStudy;

import org.testng.annotations.Test;

public class Exclude {
  @Test(groups="Sanity")
  public void Test4() {
  }
  
  @Test
  public void Test5() {
  }
  
  @Test(groups="Sanity")
  public void Test6() {
  }
  
  
}
