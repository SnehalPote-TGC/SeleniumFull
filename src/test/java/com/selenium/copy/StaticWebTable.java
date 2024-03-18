package com.selenium.copy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		//how many rows are in a table
		int rows = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr")).size();
		System.out.println("Number of Rows "+rows);
		
		//how many columns are there in a table
		//here tr is representing rows and th representing column number
		int col = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr//th")).size();
		System.out.println("Number Od Column "+col);
		
		//Retrive specific row/col data
		//td represent the value in specific mentioned value
		String value = driver.findElement(By.xpath("//table[@id='customers']//tbody//tr[2]//td[2]")).getText();
		System.out.println("Value of tr "+value);
		
		// retrieve all the data from the table
		
		for(int r=2; r<=rows; r++) {
			for (int c=1; c<=col; c++) {
				String data = driver.findElement(By.xpath("//table[@id='customers']//tbody//tr["+ r +"]//td["+ c +"]")).getText();
				System.out.print(data+" ");
			}
			System.out.println(" ");
		}
		
		// Retrieve specific value data along with mentioned col id 
		for(int r=3; r<=rows; r++) {
			String Company = driver.findElement(By.xpath("//table[@id='customers']//tbody//tr["+ r +"]//td[1]")).getText();
			System.out.println("comany name "+Company);
			if(Company.equals("Meta")) {
				String contact = driver.findElement(By.xpath("//table[@id='customers']//tbody//tr["+ r +"]//td[2]")).getText();
				String country = driver.findElement(By.xpath("//table[@id='customers']//tbody//tr["+ r +"]//td[3]")).getText();
				
				System.out.println(Company   +  " " +contact+  "  "+country);
			}
		}
	}

}
