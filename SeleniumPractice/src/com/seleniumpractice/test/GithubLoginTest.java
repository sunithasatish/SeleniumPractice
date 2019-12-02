package com.seleniumpractice.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GithubLoginTest {
	static WebDriver driver;
	static WebDriverWait wait;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\WorkSpace\\SeleniumPractice\\src\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	driver.get("https://github.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.manage().wait(10);
		
		String title = driver.getTitle();
		
		
		System.out.println(title);
		/*
		login("kssunithasatish@gmail.com", "shreyas27$$");
		
		WebElement avatar = driver.findElement(By.xpath("//summary/img[@class='avatar']"));
		
		wait.until(ExpectedConditions.visibilityOf(avatar));
		avatar.isDisplayed();
		logout();
		
		login("test", "passwd11");
		driver.findElement(By.xpath("//div/button[contains(@class,'js-flash-close')]")).isDisplayed();
		System.out.println("Worked as expected");*/
		

	}
	
	public static void login(String username, String password){
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Sign in"))));
		
		
		
		driver.findElement(By.linkText("Sign in")).click();
		
		
		WebElement login_field = driver.findElement(By.id("login_field"));
		WebElement password_field = driver.findElement(By.id("password"));
		
		
		wait.until(ExpectedConditions.visibilityOf(login_field));
		
		login_field.sendKeys(username);
		password_field.sendKeys(password);
		
		
		
		driver.findElement(By.name("commit")).click();
		
		System.out.println("Login sucessful");
	}
	
	public static void logout(){
		driver.findElement(By.xpath("//summary/img[@class='avatar']")).click();
		driver.findElement(By.xpath("//button[starts-with(@class,'dropdown-item drop')]")).click();
		
		driver.findElement(By.linkText("Sign in")).isDisplayed();
		System.out.println("Logout succesful");
	}
	

}
