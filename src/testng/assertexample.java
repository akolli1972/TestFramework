package testng;

import org.testng.annotations.Test;
import static  org.testng.Assert.assertTrue;
public class assertexample {
  @Test
  public void testcase1() {
	  String expectedTitle= "facebook";
	  String actualTitle ="facebook";
	  assertTrue(expectedTitle.equals(actualTitle), "title is wrong "+actualTitle);
  }
  @Test
  public void testcase2() {
	  int expectedRecords= 10;
	  int actualRecords =5;
	  assertTrue(expectedRecords==(actualRecords), "mismatch records " +expectedRecords);
  }
}
