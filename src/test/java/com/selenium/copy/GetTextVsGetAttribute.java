package com.selenium.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextVsGetAttribute {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		WebElement ele = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		//
		//using getAttribute we will get value of html attribute value, here placeholder is value and attribute for this is search Store
		// placeholder="Search store"
		System.out.println("Using Get Attribute " +ele.getAttribute("placeholder"));
		System.out.println("Using get Text" +ele.getText());
		
		// get text will return the text from the html code for example like below
		// <strong xpath="1">Returning Customer</strong>
		WebElement ele1 = driver.findElement(By.xpath("//strong[normalize-space()='Returning Customer']"));
		System.out.println(ele1.getText());
		

		
		

	}

}
