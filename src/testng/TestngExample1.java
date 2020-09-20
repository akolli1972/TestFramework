package testng;

import org.testng.annotations.Test;

public class TestngExample1 {
	@Test
	public void login() {
		System.out.println("Login completed");
	}
	@Test
	public void logout() {
		System.out.println("Logout completed" );
	}
	@Test
	public void addEmployee() {
		System.out.println("added employee");
	}
}
