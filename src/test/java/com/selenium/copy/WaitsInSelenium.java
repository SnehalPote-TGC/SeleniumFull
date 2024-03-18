package com.selenium.copy;

import java.time.Duration;
import java.util.NoSuchElementException;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class WaitsInSelenium {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		//implicit Wait
		// this is applicable for all element.
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.findElement(By.name("q")).sendKeys("Selenium");
		
		
/*Explicit Wait
 * WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q"))).click();
 * 
 * 
 * Condition: Implicit wait waits for an element to appear on the page, while explicit wait waits for a specific condition, 
 * such as the presence of an element or the element to be clickable.
Scope: Implicit wait applies globally, while explicit wait applies locally to a specific element.
Exception: Implicit wait throws a NoSuchElementException when the WebDriver cannot find the element within the specified timeout.
 In contrast, explicit wait throws a TimeoutException when the element doesn’t meet the condition within the specified timeout.
 
 The StaleElementReferenceException is a problem that occurs when the previously located element is not available anymore.
 * */
		
		/*
		 * The Fluent Wait in Selenium is used to define maximum time for the web driver to wait for a condition, as well as the 
		 * frequency with which we want to check the condition before throwing 
		 * an “ElementNotVisibleException” exception. It checks for the web element at regular intervals until the object 
		 * is found or timeout happens.*/
		
		//fluent wait declaration
		Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		
		//usage of fluent wait
		
		WebElement element =mywait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.name("q"));
		}
	});
		element.click();
		element.sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
}
