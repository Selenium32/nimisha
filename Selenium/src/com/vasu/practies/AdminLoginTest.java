package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdminLoginTest {

	public static void main(String[] args) 
	{
		String userName="Admin";
		String password="Admin";
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("txtuId")).sendKeys(userName);
		driver.findElement(By.name("txtPword")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.xpath("//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
		driver.close();

	}

}
