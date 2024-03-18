package com.selenium.copy;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.linkedin.com/");
		driver.manage().window().maximize();
		String windowID = driver.getWindowHandle();
		System.out.println(windowID);
		// C6ECB19AFB33FD8E5DCF184FE0AEA283
		driver.findElement(By.xpath("//span[@class='nsm7Bb-HzV7m-LgbsSe-BPrWId']")).click();
		
		//
		Set<String> mult= driver.getWindowHandles();	
		Iterator<String>  it = mult.iterator();
		String parentId = it.next();
		String childID = it.next();
		
		System.out.println(parentId);
		System.out.println(childID);
		
		//using getwindowhandles we can switch between two windows
		driver.switchTo().window(parentId);
		System.out.println( "parent window titile" + driver.getTitle());
		Thread.sleep(3000);
		driver.switchTo().window(childID);
		System.out.println("Child Window " +driver.getTitle());
driver.close();

	}

}
