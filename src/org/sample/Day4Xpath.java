package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4Xpath {

	public static void main(String[] args) {
		System.setProperty("WebDriver.Chrome.Driver",
				"C:\\Users\\Venu\\eclipse\\java-2023-032\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
        WebElement name = driver.findElement(By.xpath("//input[@type='text']"));
        name.sendKeys("swathi@yahoo.com");
        String attribute = name.getAttribute("value");
       System.out.println(attribute);
       
//       WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
//       pass.sendKeys("1234qwe");
//       String attribute2 = pass.getAttribute("value");
//       System.out.println(attribute2);
        
		WebElement search = driver.findElement(By.xpath("//button[@type='submit']"));
		search.click();
		
	}

}
