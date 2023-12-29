package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name1 {
	public static void main(String[] args) {
		//static method
		System.setProperty("WebDriver.Chrome.Deiver",
				"C:\\Users\\Venu\\eclipse\\java-2023-032\\Selenium\\drivers\\chromedriver.exe");
		//creating upcasting
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		//maximize the page
		driver.manage().window().maximize();
		
		
		//
		WebElement findElement = driver.findElement(By.name("q"));
		findElement.sendKeys("GreensTechnology");
	}

}
