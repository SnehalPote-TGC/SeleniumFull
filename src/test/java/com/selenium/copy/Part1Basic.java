package com.selenium.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part1Basic {
	public static void main(String[] args) throws InterruptedException {
	//Trditional method to launch the browzer 
		// WebDriverManager.chromerdriver().setup();
	

	//Launching the driver 
	WebDriver driver = new ChromeDriver();
	
	// how to open the URL 
	//What is the difference between get and navigate.to method
	//navigate() is faster than get() because navigate() does not wait for the page to load fully or completely.1
	//driver.navigate().to("https://doodles.google/");
	driver.get("https://www.google.co.in/");

	//driver.findElement(By.xpath("//a[@class='glue-header__link'][normalize-space()='Library']")).click();
	
	
	// how to get the title of the webpage.
	String str = driver.getTitle();
	System.out.println("Titile of the WebPage " +str);
	
	//how to get the current URL from the page
	String str1 =driver.getCurrentUrl();
	System.out.println("Get Current URL " +str1);
	
	//how to get Page source
	String pageSorce= driver.getPageSource();
	//System.out.println("Page Source " +pageSorce);
	
	//how to navigate the back and forward
	driver.navigate().back();
	//driver.navigate().forward();
	
	// how to refresh or reload the page.
	driver.navigate().refresh();
	
	
	
	
	}
}
