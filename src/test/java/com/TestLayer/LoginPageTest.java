package com.TestLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.LoginPage;

@Test(groups = { "loginpage", "regression" })
public class LoginPageTest extends BaseClass {
	private LoginPage loginpage;

	@BeforeTest
	public void setUp() {

//		loginpage = new LoginPage();
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		BaseClass.iniliazation();

	}

	@Test(priority=1)
	public void validateLoginFunctionality() {
		loginpage = new LoginPage();
		loginpage.enterUsename(prop.getProperty("username"));
		loginpage.enterPassword(prop.getProperty("password"));
		

	}
	
	@Test(priority=2)
	public void clickOnSubmit()
	{
		loginpage.clickOnlogin();
	}

	@AfterTest
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}

}
