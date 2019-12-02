package com.rediff.uiautomate.tests;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.rediff.uiautomate.BaseTest;
import com.rediff.uiautomate.pages.HomePage;
import com.rediff.uiautomate.pages.RegistrationPage;

public class RediffRegistration {
	
	
	public static WebDriver driver = BaseTest.getDriver();
	 
	public static void main(String[] args) throws InterruptedException  {
		
		
		driver.get("http://rediff.com");
		
		HomePage homePage = new HomePage();
		homePage.create_account_link.click();
		//driver.findElement(By.linkText(homePage.create_account)).click();
		
		
		Thread.sleep(3000);
		RegistrationPage regPage = new RegistrationPage();
		regPage.fullName.sendKeys("Test Name");
		//driver.findElement(By.xpath(regPage.fullName)).sendKeys("Test Name");
		
		regPage.rediff_id.sendKeys("test_id");
		
		
		Select select = new Select(regPage.country);
		select.selectByValue("5");
		//select.selectByVisibleText("Australia");
		
		regPage.register_button.click();
		
		
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println(alertText);
		
		
		
		Assert.assertTrue(alertText.contains("Please enter your password"));
		
		
		alert.accept();
		
		regPage.password.sendKeys("TEST");
		
		regPage.country_id.click();
		
		List<WebElement> country_code = regPage.country_code;
		/*for(WebElement code: country_code){
			System.out.println("Text");
			
			System.out.println(code.getText());
			String text = code.getText();
			if(text.equals("USA / Canada (+1)")){
				code.click();
			}
		}*/
		
		country_code.get(3).click();
		
		regPage.mobile_no.sendKeys("9449497788");
		
		
	}

}
