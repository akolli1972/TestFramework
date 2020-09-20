package testng;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class parameterexample {
	@Parameters({"username", "password"})
  @Test
  public void loginValidation(String username, String password) {
	  System.out.println("username is - " +username);
	  System.out.println("password is - " +password);
  }
}
