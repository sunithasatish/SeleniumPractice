package com.seleniumpractice.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\WorkSpace\\SeleniumPractice\\src\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		//driver.navigate().;
		driver.navigate().back();
		
		//driver.wait(1000);
		Thread.sleep(100);
		driver.navigate().forward();
		driver.close();
		//driver.quit();
		
			
		
		
	}

}
