package com.vasu.practies;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindows {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://hdfcbank.com");
		driver.manage().window().maximize();
		
		String parent=driver.getWindowHandle();
		//System.out.println(parent); // 11111
		
		driver.findElement(By.id("loginsubmit")).click();
		Set<String> windows=driver.getWindowHandles();// 11111&22222
		
		for (String child : windows)
		{
		//	System.out.println(child);
			//driver.switchTo().window(child);
			//System.out.println(driver.getTitle());
			if (!parent.equalsIgnoreCase(child)) 
			{
				driver.switchTo().window(child);
				driver.findElement(By.xpath("html/body/div[4]/div[2]/div[1]/a")).click();
			}
			
		}
		

	}

}
