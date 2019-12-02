package com.rediff.uiautomate.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.rediff.uiautomate.BaseTest;

public class HomePage extends BaseTest   {
	
	
	WebDriver driver = getDriver();
	
	public WebElement create_account_link = driver.findElement(By.linkText("Create Account"));
	
	
	public WebElement sign_in_link = driver.findElement(By.linkText("Sign in"));
	

}
