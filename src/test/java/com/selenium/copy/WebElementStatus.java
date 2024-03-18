package com.selenium.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementStatus {
	public static void main(String[] args) {
		//Methods
		//isDisplayed(), isEnabled(), isSelected()  
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		WebElement searchStore = driver.findElement(By.xpath("//input[@name='q']"));
		System.out.println("Is Displayed "+searchStore.isDisplayed());
		System.out.println("Is enabled "+searchStore.isEnabled());
		//System.out.println("Is Displayed "+searchStore.is);
		
		WebElement radioButton = driver.findElement(By.xpath("//input[@value='M']"));
		System.out.println("Radio not selected "+radioButton.isSelected());
		
		radioButton.click();
		System.out.println("radio selected "+radioButton.isSelected());

	}

}
