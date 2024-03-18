package com.selenium.copy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperationActionsClass {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		driver.manage().window().maximize();
		
		//for right click
/*
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions act = new Actions(driver);
		
		act.contextClick(button).perform();
		*/
		
		
		//double click
		/*
		driver.get("https://www.plus2net.com/javascript_tutorial/ondblclick-demo2.php");
		 WebElement du = driver.findElement(By.xpath("//div[@id='box']"));
			Actions act = new Actions(driver);
			act.doubleClick(du).perform();
*/
		
		//Drag And Drop
		/*
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement so = driver.findElement(By.id("box7"));
		WebElement ta = driver.findElement(By.id("countries"));
		
		Actions act =new Actions(driver);
		act.dragAndDrop(so, ta).perform();
		*/
		// with images
		
		/*
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		WebElement so = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement ta = driver.findElement(By.id("trash"));
		
		Actions act =new Actions(driver);
		act.dragAndDrop(so, ta).perform();
		*/
		//mouseHoverAction
		driver.get("https://demo.opencart.com/");
		
		WebElement desktop = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement components = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(desktop).moveToElement(components).click().perform();
		
		
	}
}
