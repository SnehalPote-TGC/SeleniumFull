package com.selenium.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//capture tooltip
		driver.get("https://jqueryui.com/tooltip/");
		driver.switchTo().frame(0);
		WebElement age = driver.findElement(By.xpath("//input[@id='age']"));
		//tooltip text is stored in the title attribute 
		String a = age.getAttribute("title");
		System.out.println(a);
		
	}

}
