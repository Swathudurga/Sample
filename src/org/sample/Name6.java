package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name6 {

	public static void main(String[] args) {
		System.setProperty("WebDriver.Chrome.Driver",
				"C:\\Users\\Venu\\eclipse\\java-2023-032\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get(" http://www.greenstechnologys.com/");
		//driver.manage().window().maximize();
         
		WebElement addrs = driver.findElement(By.xpath("//font[contains(text(),'GREENS TECHNOLOGY')]"));
		String text = addrs.getText();
		System.out.println(text);
		addrs.click();
		
  
     
	}

}
