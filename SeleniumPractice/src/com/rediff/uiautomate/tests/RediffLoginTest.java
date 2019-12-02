package com.rediff.uiautomate.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.rediff.uiautomate.BaseTest;
import com.rediff.uiautomate.helpers.LoginHelper;

public class RediffLoginTest {

	public static WebDriver driver = BaseTest.getDriver();
	@Test
  public void f() {
	  
		driver.get("http://rediff.com");
	  LoginHelper loginHelper = new LoginHelper();
	  loginHelper.login("kushal", "passwd1");
	  
	  driver.get("http://rediff.com");
	  loginHelper.login("kushal", "");
	  
			  
  }
}
