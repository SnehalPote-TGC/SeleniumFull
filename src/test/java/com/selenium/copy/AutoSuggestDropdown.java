package com.selenium.copy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(3000);
		List<WebElement> autoDropdown = driver.findElements(By.xpath("//li[@class='sbct PZPZlf']//div[@role='option']//div[1]//span"));
		
		System.out.println(autoDropdown.size());
		
		for(WebElement ele : autoDropdown) {
			 //System.out.println(ele.getText().equals("selenium dev"));
			 if(ele.getText().equals("selenium dev")) {
				 ele.click();
				 break;
				 }
			 }
	}
}
