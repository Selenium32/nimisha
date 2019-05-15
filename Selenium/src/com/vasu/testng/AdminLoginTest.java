package com.vasu.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdminLoginTest 
{
@Test
public void login()
{
	String userName="Admin";
	String password="Admin";
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("http://primusbank.qedgetech.com/");
	driver.manage().window().maximize();
	Assert.assertTrue(driver.findElement(By.name("txtuId")).isDisplayed());
	driver.findElement(By.name("txtuId")).sendKeys(userName);
	driver.findElement(By.name("txtPword")).sendKeys(password);
	driver.findElement(By.name("login")).click();
	
	driver.findElement(By.xpath("//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
	driver.close();
}
}
