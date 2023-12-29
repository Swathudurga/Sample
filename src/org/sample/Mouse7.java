package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse7 {

		public static void main(String[] args) {
			System.setProperty("Webdriver.driver.ChromeDriver",
					"C:\\Users\\Venu\\eclipse\\java-2023-032\\Selenium\\drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			WebElement apil = driver.findElement(By.xpath("//div[text()='Beauty, Toys & More']"));


			Actions a=new Actions(driver);
			a.moveToElement(apil).perform();

			
			WebElement file = driver.findElement(By.xpath("//span[text()='Appliances']"));
			a.moveToElement(file).perform();
			
			
			WebElement mi = driver.findElement(By.xpath("//a[@title='Toys and Games']"));
			a.moveToElement(mi).click().perform();
			
	}

}
