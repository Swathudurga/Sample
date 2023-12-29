package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTex2 {

	public static void main(String[] args) {
		System.setProperty("WebDriver.Chrome.Driver",
				"C:\\Users\\Venu\\eclipse\\java-2023-032\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		WebElement text = driver.findElement(By.xpath("(//a[@role='tab'])[1]"));
		//text.click();
		WebElement text2 = driver.findElement(By.xpath("(//p[contains(text(),'Velmurugan')])[2]"));
		String text3 = text2.getText();
		System.out.println(text3);
		//text2.click();
		
	}

}
