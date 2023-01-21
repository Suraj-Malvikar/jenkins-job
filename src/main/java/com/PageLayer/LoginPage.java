package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;
import com.UtilsLayer.UtilsClass;

public class LoginPage extends BaseClass {

	@FindBy(name = "firstname")
	private WebElement uname;

	@FindBy(name = "lastname")
	private WebElement pass;

	@FindBy(name = "websubmit")
	private WebElement loginbutton;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void enterUsename(String username) {
		UtilsClass.enterData(uname, username);
	}

	public void enterPassword(String password) {
		UtilsClass.enterData(pass, password);
	}
	
	public void clickOnlogin()
	{
		UtilsClass.clickonElement(loginbutton);
	}
	
	
	
	
}
