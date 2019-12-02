package com.rediff.uiautomate.tests;

import org.testng.annotations.Test;

import com.rediff.uiautomate.BaseTest;
import com.rediff.uiautomate.helpers.LoginHelper;
import com.rediff.uiautomate.pages.HomePage;
import com.rediff.uiautomate.pages.LoginPage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class RediffLoginDpTest {
  
 public static WebDriver driver;
 
 @Test(dataProvider = "loginDataProvider")
  public void loginTest(String username, String passwd) {
	  
	 
	 LoginHelper loginHelper = new LoginHelper();
	 loginHelper.login(username, passwd);
		
		HomePage homePage = new HomePage();
		
		
		/*homePage.sign_in_link.click();
		
		LoginPage loginPage = new LoginPage();
		loginPage.username.sendKeys(username);
		loginPage.password.sendKeys(passwd);
		loginPage.go_button.click();
		if(username == ""){
				//Assert.assertEquals(element.getText(), "Wrong username and password combination.");
		} else if(passwd == ""){
			//Assert.assertEquals(element.getText(), "Wrong username and password combination.");

		} else {
			// login should be successfull
		}
*/		
  }
 
   
	  
  @DataProvider
  public Object[][] loginDataProvider() {
    return new Object[][] {
      new Object[] { "Kushal", "passwd1" }, // valid
      new Object[] { "Anand", "paswd2" }, // Invalid scenario - Valid username, Invalid PAsswod
      new Object[] {"user3", "passwd3"}, // Invalid scenario - Invalid username, Valid password
      new Object[] {"", "passwd1"}, //Invalid scenario with - Blank username, valid password
      new Object[] {"user4", ""}, // Invalid scenario with - Valid username, Blank password
      new Object[] {"",""} // Invalid scenario - Blank username , blank password
    };
  }
  
  @BeforeTest
  public void beforeTest(){
	  driver = BaseTest.getDriver();
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  driver.get("http://rediff.com");
	  
  }

  @AfterTest
  public void afterTest() {
	 driver.close();
  }

}
