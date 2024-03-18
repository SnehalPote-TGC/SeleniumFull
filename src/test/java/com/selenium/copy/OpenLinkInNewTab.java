package com.selenium.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenLinkInNewTab {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		String tab = Keys.chord(Keys.CONTROL,Keys.RETURN);
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).sendKeys(tab);
		
	}

}
