package com.rediff.uiautomate.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.rediff.uiautomate.BaseTest;

public class RegistrationPage extends BaseTest {
	
	WebDriver driver = getDriver();
	public WebElement fullName = driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input"));
    
	public WebElement country = driver.findElement(By.id("country"));
	
	public WebElement rediff_id = driver.findElement(By.xpath("//input[starts-with(@name,'login')]"));
	public WebElement password = driver.findElement(By.xpath("//input[starts-with(@name,'passwd')]"));
	
	public WebElement country_id = driver.findElement(By.xpath("//div[@id='div_mob']//td/div[2]"));
	public List<WebElement> country_code = driver.findElements(By.xpath("//div[@id='country_id']/ul/li"));
	public WebElement mobile_no = driver.findElement(By.xpath("//input[@id='mobno']"));
	public WebElement register_button = driver.findElement(By.id("Register"));
	
}
