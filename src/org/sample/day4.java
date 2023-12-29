package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day4 {

	public static void main(String[] args) {
		System.setProperty("WebDriver.Chrome.Driver",
				"C:\\Users\\Venu\\eclipse\\java-2023-032\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		WebElement sign = driver.findElement(By.xpath("//a[text()='Sign up']"));
		sign.click();
		
		WebElement num = driver.findElement(By.xpath("//input[@type='tel']"));
		num.sendKeys("8876634741");
		
		WebElement name = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		name.sendKeys("durga");
		
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("durga6u@yahoo.com");
		
		WebElement cont = driver.findElement(By.xpath("//a[text()='CONTINUE']"));
		cont.click();

	}

}
