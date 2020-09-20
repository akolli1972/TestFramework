package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BasicTestng {
  @Test
  public void testcase1() {
	  System.out.println("test case 1 passed");
  }
  
  @Test
  public void testcase2() {
	  System.out.println("test case 2 passed");
  }
  
  @Test
  public void testcase3() {
	  System.out.println("test case 3 passed");
  }
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("chrome browser activated to show fb page");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("driver is quit");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before test Metghod");
  }
  
  @AfterMethod
  public void afterMethod() {
	  System.out.println("after test Method");
  }
  
  }
  


