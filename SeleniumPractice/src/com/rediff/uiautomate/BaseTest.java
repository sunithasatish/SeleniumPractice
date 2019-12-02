package com.rediff.uiautomate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	public static WebDriver getDriver(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\WorkSpace\\SeleniumPractice\\src\\resources\\chromedriver.exe");
		if(driver == null){
			return driver = new ChromeDriver();
		}
		
		wait = new WebDriverWait(driver, 10);
		
		return driver;
		
	}

}
