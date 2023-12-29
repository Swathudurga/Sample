package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse2 {

	public static void main(String[] args) {
		System.setProperty("WebDriver.Chrome.Driver",
				"C:\\Users\\Venu\\eclipse\\java-2023-032\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		//Action------->class
		Actions a=new Actions(driver);
		
		//move to click----->All courses
		WebElement name = driver.findElement(By.xpath("//div[@title='Courses']"));
       a.moveToElement(name).perform();
//       
//     //move to ------->courses
//       WebElement course = driver.findElement(By.xpath("//span[text()='Oracle (48)']"));
//       a.moveToElement(course).perform();
//       
//       //move to --------->software testing trainning
//       WebElement test = driver.findElement(By.xpath("//span[text()='Oracle SQL and PLSQL Placement Certification Training']"));
//       a.moveToElement(test).click().perform();
       

	}

}
