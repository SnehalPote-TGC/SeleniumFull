package com.selenium.copy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsVsFindElements {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		//find elements always returns single web element
		//1
		WebElement we= driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		we.sendKeys("Snehal");
		
		//2 returning multiple web element but we are capturing it in single web element after putting it returns first element only
		WebElement we1 =  driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
		//System.out.println(we1.getText());
		
		//3
		/*
		WebElement we2= driver.findElement(By.xpath("//input[@id='small-searchterms1']"));
		we2.sendKeys("Snehal");
		*/
		//4
		
		List<WebElement> we2= driver.findElements(By.xpath("//input[@id='small-searchterms1']"));
		for(WebElement tr : we2)		{
			System.out.println("fgfgfgf "+tr.getText());
		}
		
		
		//5
		List<WebElement> we3 =  driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
		//System.out.println(we1.getText());
		
		

	}

}
