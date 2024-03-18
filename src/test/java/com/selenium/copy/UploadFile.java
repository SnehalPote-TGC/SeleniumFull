package com.selenium.copy;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws AWTException {
		WebDriver driver = new ChromeDriver();
		// this method is applicable when browzer button has type = file only
		/*
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		
		driver.findElement(By.xpath("//input[@id='input-4']")).sendKeys("C:\\Users\\User\\eclipse-workspace\\FullSelenium\\Downloads\\file-sample_100kB.doc");
		*/
		// using robot class
		Robot rb = new Robot();
		rb.delay(2000);
         driver.get("https://demo.automationtesting.in/FileUpload.html");
		
		// driver.findElement(By.xpath("//input[@id='input-4']")).click();
		 
		 try {
			 driver.findElement(By.xpath("//input[@id='input-4']")).click();				} 
			catch (Exception e) 
			{
			     JavascriptExecutor executor = (JavascriptExecutor) driver;
			     executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@id='input-4']")));
			  }
		 
		 //This two statement will copy file path in to the clipboard.
		 StringSelection ss= new StringSelection("C:\\\\Users\\\\User\\\\eclipse-workspace\\\\FullSelenium\\\\Downloads\\\\file-sample_100kB.doc");
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		 
		 //Control +v
		 rb.keyPress(KeyEvent.VK_CONTROL); //press on control 
		 rb.keyPress(KeyEvent.VK_V);   //press controlkey
		 
		 rb.keyRelease(KeyEvent.VK_CONTROL); // release button
		 rb.keyRelease(KeyEvent.VK_V);   // release button
		 
		 //Enter
		 rb.keyPress(KeyEvent.VK_ENTER);
		 rb.keyRelease(KeyEvent.VK_ENTER);
		 

	}

}
