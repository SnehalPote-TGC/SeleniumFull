package com.selenium.copy;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.m2ost.in/m2ost_newdev_console/bata");
		
		//Full page screenshot
		/*
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		File destFile = new File(".\\Screenshot\\fileName.png");
		FileUtils.copyFile(sourceFile, destFile);
		System.out.println("Screenshot saved successfully");
		*/
		//Section or portion of the page.
		WebElement sec = driver.findElement(By.id("form_model_index"));
		File sourceFile = sec.getScreenshotAs(OutputType.FILE);
		File destFile = new File(".\\Screenshot\\section.png");
		FileUtils.copyFile(sourceFile, destFile);
		System.out.println("Screenshot saved successfully");
		
	}

}
