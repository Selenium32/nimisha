package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KsrtcTest
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("Http://ksrtc.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtJourneyDate")).sendKeys("29/03/2019");

	}

}
