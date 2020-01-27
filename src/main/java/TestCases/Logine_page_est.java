package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base_class.Base_class;
import page.login_page;

public class Logine_page_est extends Base_class {
	
@Test
	public void Logine_Page_Test() {
		driver.get(url);
		login_page page = new login_page(driver);
		page.User_ID_PASS(username, password);
		page.user_click();
		if (driver.getCurrentUrl().equals("Your Memberships &amp; Subscriptions")) {
			Assert.assertTrue(true);

		} else {
			Assert.assertFalse(false);

		}

	}

}
