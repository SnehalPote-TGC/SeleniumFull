package com.selenium.copy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdownOrSelectClass {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		WebElement dropDown =  driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		dropDown.click();
		// for handling dropdown which are under select Tag only in html page for that we have select Class which handle dropdown related information 
		Select drpCountry = new Select(dropDown);
		//drpCountry.selectByVisibleText("Baby"); // send exact text for which we want to select
		//drpCountry.selectByIndex(4);  //need tp provide index
		//drpCountry.selectByValue("search-alias=nowstore"); // need to send the attribute of value tag
		drpCountry.selectByValue("Baby");
		//selecting option from DROPDOWN without using slect class method
		List<WebElement> allOption = drpCountry.getOptions();
		
		for(WebElement all : allOption) {
			
			if(all.getText().equals("Baby")) {
				all.click();
				break;
			}
		}

	}

}
