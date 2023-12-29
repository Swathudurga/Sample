package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {

	public static void main(String[] args) {
		//static method
		System.setProperty("WebDriver.Chrome.Driver",
				"C:\\Users\\Venu\\eclipse\\java-2023-032\\Selenium\\drivers\\chromedriver.exe");
		//creating upcastings
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//maximum the page
		driver.manage().window().maximize();
		
		//to pass the value in email field
		WebElement EmailId = driver.findElement(By.id("email"));
		EmailId.sendKeys("swathidurga");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("12345");
	
}
}