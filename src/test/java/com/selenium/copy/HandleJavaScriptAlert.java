package com.selenium.copy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleJavaScriptAlert {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

	    driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	    
	    //alert window with Ok button
	   /* driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
	    Thread.sleep(2000);
	    driver.switchTo().alert().accept(); */
	    
	    // aler with ok and cancel button
	    //jsConfirm()
	    /*
	    driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
	    Thread.sleep(2000);
	    driver.switchTo().alert().dismiss();  // click on cancel. and ok same as above.
	    
	    */
	    
	    // how capture text from aler window and send the text 
	    driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
	    Thread.sleep(2000);
	    Alert alertwindow = driver.switchTo().alert();
	    System.out.println("message displayed" +alertwindow.getText());
	    alertwindow.sendKeys("bye bye");
	    alertwindow.accept();

	    
	    
	}
}
