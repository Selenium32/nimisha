package com.vasu.practies;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement shop=driver.findElement(By.id("nav-link-shopall"));
		WebElement apv=driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[2]/span[4]/span"));
		WebElement alv=driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[3]/div[4]/a[1]/span[1]"));
		
		Actions chain=new Actions(driver);
		chain.moveToElement(shop).moveToElement(apv).pause(2000).moveToElement(alv).click().build().perform();
	}

}
