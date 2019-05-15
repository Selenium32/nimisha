package com.vasu.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class PrimusbankLogin 
{
	@Test
	public void loginTest() throws MalformedURLException
	{
		DesiredCapabilities cap=null;
		cap=DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		RemoteWebDriver driver=new RemoteWebDriver
				(new URL("http://localhost:4444/wd/hub"),cap);
		driver.get("https://www.google.com/advanced_search");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("xX4UFf")).sendKeys("VasuDeva");
		
		driver.findElement(By.id("xX4UFf")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.id("xX4UFf")).sendKeys(Keys.CONTROL+"c");
		driver.findElement(By.id("t2dX1c")).sendKeys(Keys.CONTROL+"v");

		
		
	}

}
