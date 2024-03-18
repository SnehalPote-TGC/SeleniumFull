package com.selenium.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAndIframes {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://demo.automationtesting.in/Frames.html");
		d.manage().window().maximize();
		d.switchTo().frame("singleframe"); // for entering the iframe
		d.findElement(By.xpath("//input[@type='text']")).sendKeys("use");
		d.switchTo().defaultContent(); // go back for the main page
		//Suppose we have 3 iframe in one web page then first we need to enter first iframe dooperation comeout from the iframe then enter 2nd or 3rd operation 
		// come out then enter another iframes.
		
		d.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
		//– Frame to Frame switching is not possible, if the other frame is not a child frame.


	}

}
