package com.selenium.copy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicWebTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.m2ost.in/M2OST_NewDev_CMS/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("UserID")).sendKeys("bata@2");
		driver.findElement(By.id("Password")).sendKeys("Tgc@1234");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Content Assignment']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Program Assignment']")).click();
		
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/a[1]")).click();
		
		driver.findElement(By.xpath("//select[@id='notification-select']")).click();
		driver.findElement(By.xpath("//select[@id='notification-select']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//select[@id='notification-select']")).click();
		
		driver.findElement(By.xpath("//select[@id='tile-category']")).click();
		driver.findElement(By.xpath("//select[@id='tile-category']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//select[@id='tile-category']")).click();
		
		driver.findElement(By.xpath("//select[@id='heading-category']")).click();
		driver.findElement(By.xpath("//select[@id='heading-category']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//select[@id='heading-category']")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='Role Based Search']")).click();
		
		driver.findElement(By.xpath("//input[@id='datetimepicker1']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='11']")).click();
		driver.findElement(By.xpath("//input[@id='datetimepicker2']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='31']")).click();
		
		WebElement ele = driver.findElement(By.xpath("//select[@id='role-select']"));
		ele.click();
		
		
		Select se = new Select(ele);
		se.selectByVisibleText("SP-FT-Trainee-HP");
		
		driver.findElement(By.xpath("//input[@id='id_search1']")).click();
		
		
		for(int p =1; p<=2; p++) {
			WebElement active = driver.findElement(By.xpath(""));
			
			
			
		}
		

		


		
	}

}
