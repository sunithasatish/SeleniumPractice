package com.rediff.uiautomate.helpers;

import com.rediff.uiautomate.pages.HomePage;
import com.rediff.uiautomate.pages.LoginPage;

public class LoginHelper {
	
	
	
	public void login(String user, String passwd){
		HomePage homePage = new HomePage();
		homePage.sign_in_link.click();
		
		LoginPage loginPage = new LoginPage();
		loginPage.username.sendKeys(user);
		loginPage.password.sendKeys(passwd);
		loginPage.go_button.click();
		
		if(user == ""){
				//Assert.assertEquals(element.getText(), "Wrong username and password combination.");
		} else if(passwd == ""){
			//Assert.assertEquals(element.getText(), "Wrong username and password combination.");

		} else {
			// login should be successfull
		}
	}

}
