package com.selenium.copy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrampDropdown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");
		driver.findElement(By.xpath("//button[@id='menu1']")).click();
		
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='dropdown open']//ul[@role='menu']//li"));
		
		System.out.println(ele.size());
		selectOptionFromDropdown(ele,"HTML");
		System.out.println("1");

	}
	
	public static void selectOptionFromDropdown(List<WebElement> options, String value) {
		System.out.println("2");

		for(WebElement option : options) {
			if(option.getText().equals(value)) {
				System.out.println("option" +option.getText());
				option.click();
				break;
			}
		}
		
	}
/*
 * In dropdown their are Jquery dropdown is also their which like radio button selection in the dropdown that we can handle using above logic 
 * 
 * If we want compare dropdown value is sorted or not then we need to store value in two different array in one array using sort methos 
 * we sort array then compare two array are equal or not.
 * */
}
