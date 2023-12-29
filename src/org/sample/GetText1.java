package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText1 {

	public static void main(String[] args) {
		System.setProperty("WebDriver.Chrome.Driver",
				"C:\\Users\\Venu\\eclipse\\java-2023-032\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com");
		driver.manage().window().maximize();
		
		WebElement text = driver.findElement(By.xpath("(//u[contains(text(),'Technologys ')])[1]"));
		String text2 = text.getText();
		System.out.println(text2);
		text.click();
	}

}
