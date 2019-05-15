package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDownTest1 {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://amazon.in");
		driver.manage().window().maximize();
		
		WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		List<WebElement> dropList=drop.findElements(By.tagName("option"));
		
		System.out.println(dropList.size());
		for (int i = 0; i < dropList.size(); i++) 
		{
			//System.out.println(dropList.get(i).getText());
			/*if(dropList.get(i).getText().equals("Beauty"))
			{
				dropList.get(i).click();
			}*/
			dropList.get(i).click();
			//validation
			if (dropList.get(i).isSelected())
			{
			System.out.println(dropList.get(i).getText()+" : is Selected");	
			}else
			{
				System.out.println(dropList.get(i).getText()+" : is not Selected");
			}
		}

	}

}
