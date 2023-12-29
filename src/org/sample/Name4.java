package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Name4 {
	public static void main(String[] args) {
		//static method
		System.setProperty("WebDriver.Chrome.deiver",
				"C:\\Users\\Venu\\eclipse\\java-2023-032\\Selenium\\drivers\\chromedriver.exe" );
		//upcasting
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		
	
		//to pass the value in email field
		WebElement Id = driver.findElement(By.id("username"));
		Id.sendKeys("sivaram@1234");	
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("sivarenu");
	}

}
