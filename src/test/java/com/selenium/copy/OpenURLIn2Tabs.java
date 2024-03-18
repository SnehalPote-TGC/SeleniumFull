package com.selenium.copy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenURLIn2Tabs {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		//same browser but different tab
		/*
		driver.get("https://demo.nopcommerce.com/");
		// this is available from selenium 4
		driver.switchTo().newWindow(WindowType.TAB);
		driver .get("https://www.m2ost.in/m2ost_newdev_console/bata");
		*/
		//different browser
		driver.get("https://demo.nopcommerce.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver .get("https://www.m2ost.in/m2ost_newdev_console/bata");


	}

}
