package page;

import java.awt.print.Pageable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page {
	WebDriver Gdriver;

	public login_page(WebDriver Idriver) {
		Gdriver = Idriver;
		PageFactory.initElements(Idriver, this);

	}

	@FindBy(xpath = "//*[@id=\"ap_email\"]")
	WebElement username;
	@FindBy(xpath = "//*[@id=\"ap_password\"]")
	WebElement passward;
	@FindBy(xpath = "//*[@id=\"signInSubmit\"]")
	WebElement login;

	public void User_ID_PASS(String name, String pass) {
		username.sendKeys(name);
		passward.sendKeys(pass);
	

	}
	public void user_click() {
		login.click();
	}
	
}
	