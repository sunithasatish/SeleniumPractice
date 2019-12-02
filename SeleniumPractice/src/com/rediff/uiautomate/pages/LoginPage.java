package com.rediff.uiautomate.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.rediff.uiautomate.BaseTest;

public class LoginPage extends BaseTest {
	
	WebDriver driver = getDriver();
	
	public WebElement username = driver.findElement(By.id("login1"));
	
	public WebElement password = driver.findElement(By.id("password"));
	
	public WebElement go_button = driver.findElement(By.name("proceed"));
	

}
