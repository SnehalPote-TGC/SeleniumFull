package com.selenium.copy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsVSAction {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://demo.automationtesting.in/Slider.html");
		WebElement minSlider = driver.findElement(By.xpath("//a[@class='ui-slider-handle ui-state-default ui-corner-all']"));
		minSlider.getLocation();
		System.out.println("Location Of "+minSlider.getLocation());
		System.out.println("Location Of "+minSlider.getSize());

		Actions act = new Actions(driver);
		//act.dragAndDropBy(minSlider, 300, 0).perform();
		// here Action is interface and 
		Action action = act.dragAndDropBy(minSlider, 300, 0).build();
		action.perform();

	}

}
