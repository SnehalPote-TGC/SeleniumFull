package com.selenium.copy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PermissionPopUp {

	public static void main(String[] args) {
		
		//permission pop up means cookies allow or block pop up
		//for this we ned to handle browzer level only
		// we have firfoxoption , edgeOptions for every browzer we have options.
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		
		
		
		WebDriver driver = new ChromeDriver(op);
		driver.get("https://www.redbus.in/");

	}

}
