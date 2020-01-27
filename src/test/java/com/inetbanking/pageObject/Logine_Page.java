package com.inetbanking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Logine_Page {
	WebDriver gdriver;

	public void Logine_Page(WebDriver ldriver) {
		gdriver = ldriver;
		PageFactory.initElements(ldriver, this);
	}

	@FindBy(how = How.XPATH, using = "//input[@type=\"text\"]")
	WebElement userid;
	@FindBy(how = How.XPATH, using = "//input[@type=\"password\"]")
	WebElement Password;
	@FindBy(how = How.XPATH, using = "//input[@type=\"submit\"]")
	WebElement login;

	public void UserName(String name) {
		userid.sendKeys(name);

	}

	public void userpassword(String pass) {
		Password.sendKeys(pass);

	}

	public void userlogin() {
		login.click();

	}

}
