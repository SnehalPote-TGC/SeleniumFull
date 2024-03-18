package com.selenium.copy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderLeftRightHandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//sliider move x to x axis 
		driver.get("https://demo.automationtesting.in/Slider.html");
		WebElement minSlider = driver.findElement(By.xpath("//a[@class='ui-slider-handle ui-state-default ui-corner-all']"));
		minSlider.getLocation();
		System.out.println("Location Of "+minSlider.getLocation());
		System.out.println("Location Of "+minSlider.getSize());

		//here dragAndDropBy method from actions class will be used for dragging x axis object
		Actions act = new Actions(driver);
		act.dragAndDropBy(minSlider, 300, 0).perform();
		
		

	}

}
