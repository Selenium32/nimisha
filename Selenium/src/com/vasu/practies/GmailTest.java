package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailTest {

	public static void main(String[] args) 
	{
		String expTitle="Gmail";
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("Http://Google.co.in");
		driver.manage().window().maximize();
		driver.findElement(By.className("gb_d")).click();
		//validation
		String actTitle=driver.getTitle();
		
		if (expTitle.equals(actTitle))
		{
			System.out.println("Pass");
		}else
		{
			System.out.println("Fail");
		}

	}

}
