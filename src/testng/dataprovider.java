package testng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class dataprovider {
	@Test(dataProvider = "dp")
	public void loginValidation(String username, String password) {
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] {
			new Object[] {"john@yahoo.com", "test1234" },
			new Object[] {"ayesha@gmail.com", "test1234" },
			new Object[] {"kbc@gmail.com", "test123" },
			new Object[] {"piyush@gmail.com", "test34556" },
		};
	}
}
