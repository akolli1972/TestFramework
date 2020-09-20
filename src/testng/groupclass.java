package testng;

import org.testng.annotations.Test;

public class groupclass {
  @Test(groups = {"smoke", "regression"})
  public void testCase1() {
  }
  @Test(groups = { "regression"})
  public void testCase2() {
  }
  @Test(groups = {"login", "regression"})
  public void testCase3() {
  }
  
  
  
  
}
