package com.selenium.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;
public class Links {

	public static void main(String[] args) throws IOException {
    	int brokenlinks = 0;

		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.amazon.in/");
		driver.get("http://www.deadlinkcity.com/");

		driver.manage().window().maximize();
		
		
		//driver.findElement(By.linkText("Best Sellers")).click();
		//driver.findElement(By.partialLinkText("Best")).click();
		
		//How to capture all the link from web  Page.
		List<WebElement> ele = driver.findElements(By.tagName("a"));
		System.out.println("Number of links " +ele.size());
		//what is broken link how to identify broken links
		
				// broken links means which does not have any target page.
				

		for(WebElement ele1 : ele) {
			//System.out.println(ele1.getText());
			String url = ele1.getAttribute("href");
			if(url == null || url.isEmpty()) {
				System.out.println("URL is empty");
				continue;
			}
			URL link = new URL(url);
            HttpURLConnection httpURLConnect=(HttpURLConnection)link.openConnection();
            httpURLConnect.connect();
            if(httpURLConnect.getResponseCode()>=400)
            {
            	System.out.println(httpURLConnect.getResponseCode()+ " is a broken links");
				brokenlinks ++;
            	
            }
            else
            {
            	System.out.println(httpURLConnect.getResponseCode()+ " is not a broken links");
            }
			
		}
		System.out.println("Number of broken links " +brokenlinks);
	}

}
