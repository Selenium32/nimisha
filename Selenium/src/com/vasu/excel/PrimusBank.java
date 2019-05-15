package com.vasu.excel;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrimusBank
{
	FirefoxDriver driver;
	String res;
//appLaunch
	
	public String  appLaunch(String url)
	{
		driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		//validation
		if(driver.findElement(By.name("txtuId")).isDisplayed())
		{
			res="Pass";
		}else
		{
			res="Fail";
		}
		return res;
	}
	//appLogin
	public String appLogin(String username,String password)
	{
		driver.findElement(By.name("txtuId")).sendKeys(username);
		driver.findElement(By.name("txtPword")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		//validation
		if(driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).isDisplayed())
		{
			res="Pass";
		}else
		{
			res="Fail";
		}
		return res;
		
	}
	//branchCreation
	//appLogout
	//appClose
	public static void main(String[] args) 
	{
		PrimusBank app=new PrimusBank();
		String results=app.appLaunch("Http://Primusbank.qedgetech.com");
		System.out.println(results);
		String res1=app.appLogin("Admin", "Admin");
		System.out.println(res1);
		
	}
}
