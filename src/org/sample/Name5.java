package org.sample;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Name5 {
	public static void main(String[] args) {
		
		//static method
		System.setProperty("WebDriver.Chrome.Deiver",
						"C:\\Users\\Venu\\eclipse\\java-2023-032\\Selenium\\drivers\\chromedriver.exe" );
		//upcasting
		WebDriver driver=new ChromeDriver();
		driver.get(" https://infinity.icicibank.com/corp/Login.jsp");
		//driver.manage().window().maximize();
				
			
		//to pass the value in email field
		WebElement Id = driver.findElement(By.xpath("//input[@title='User Id']"));
        Id.sendKeys("swathidurga");
				
		WebElement Pass = driver.findElement(By.xpath("(//input[@type='password'])[4]"));
		Pass.sendKeys("saidaanvi");
	}

}
