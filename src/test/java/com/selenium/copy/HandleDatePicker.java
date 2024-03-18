package com.selenium.copy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDatePicker {

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
		
		String year ="2024";
		String month = "march";
		String date = "15";
		
		driver.findElement(By.xpath("//input[@id='datetimepicker1']")).click();
		
		while(true)
		{
			String mon = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String ye = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(mon.equalsIgnoreCase(month) && ye.equals(year))
				break;
			else
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		
        List<WebElement> allDate = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
        
        for(WebElement ad : allDate)
        {
        	String dt = ad.getText();
        	if(dt.equals(date)) {
        		ad.click();
        		break;
        	}
        }
        driver.findElement(By.xpath("//button[normalize-space()='Done']")).click();
// apart from this there are some calerder which has dropdown for month and year then use select class treat as dropdown for date selection use above.

	}

}
