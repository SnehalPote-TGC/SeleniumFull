package com.selenium.copy;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DownloadWordAndPdfFile {

	public static void main(String[] args) {
		// for Wrod File
		/*
		String location = System.getProperty("user.dir")+"\\Downloads\\";
		HashMap chromePrefs = new HashMap();
		
		chromePrefs.put("download.default_directory", location);
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//a[@href='https://file-examples.com/wp-content/storage/2017/02/file-sample_100kB.doc']")).click();
		//driver.findElement(By.xpath("//body")).click();
		//driver.findElement(By.xpath("//div[@class='bnr-ctn-col']//a[@title='Free Download'][normalize-space()='Free Download']")).click();
		try {
			driver.findElement(By.xpath("//a[@href='https://file-examples.com/wp-content/storage/2017/02/file-sample_100kB.doc']")).click();		  
			} 
		catch (Exception e) 
		{
		     JavascriptExecutor executor = (JavascriptExecutor) driver;
		     executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[@href='https://file-examples.com/wp-content/storage/2017/02/file-sample_100kB.doc']")));
		  }
*/
		
		
		// for pdf
		String location = System.getProperty("user.dir")+"\\Downloads\\";
		HashMap chromePrefs = new HashMap();
		chromePrefs.put("plugins.always_open_pdf_externally", true);
		chromePrefs.put("download.default_directory", location);
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.tutorialspoint.com/selenium/selenium_pdf_version.htm");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//a[@href='https://file-examples.com/wp-content/storage/2017/02/file-sample_100kB.doc']")).click();
		//driver.findElement(By.xpath("//body")).click();
		//driver.findElement(By.xpath("//div[@class='bnr-ctn-col']//a[@title='Free Download'][normalize-space()='Free Download']")).click();
		try {
			driver.findElement(By.xpath("//img[@alt='Selenium Tutorial (PDF Version)']")).click();		  
			} 
		catch (Exception e) 
		{
		     JavascriptExecutor executor = (JavascriptExecutor) driver;
		     executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//img[@alt='Selenium Tutorial (PDF Version)']")));
		  }
	}

}
