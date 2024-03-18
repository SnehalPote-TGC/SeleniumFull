package com.selenium.copy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		//syntax is https://username:password@URL
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

		
		
		

	}

}
