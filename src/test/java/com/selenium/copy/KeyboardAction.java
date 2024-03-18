package com.selenium.copy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {

	public static void main(String[] args) throws InterruptedException {
		// 
		/*
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://the-internet.herokuapp.com/key_presses");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.BACK_SPACE).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ESCAPE).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.SPACE).perform();
		Thread.sleep(3000);
		*/
		WebDriver driver = new ChromeDriver();
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
		WebElement i1= driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		WebElement i2=  driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		
		i1.sendKeys("Welcom to hell");
		
		Actions act = new Actions(driver);
		//Control + A
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//control +C
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//Tab Shift to iput 2 box
		
		act.sendKeys(Keys.TAB);
		act.perform();
		
		//control + v
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//compare texts
		if(i1.getAttribute("value").equals(i2.getAttribute("value"))) {
			System.out.println("copied");
			}
		else {
			System.out.println("not copied");
		}
		
		
		
		
	}

}
