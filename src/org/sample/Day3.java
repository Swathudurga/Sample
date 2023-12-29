package org.sample;

//import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3 {

	public static void main(String[] args) {
		System.setProperty("Webdriver.Chrome.Driver",
				"C:\\Users\\Venu\\eclipse\\java-2023-032\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		//driver.manage().window().maximize();
		
		WebElement Ele = driver.findElement(By.xpath("//input[@name='location']"));
		Ele.sendKeys("Tammilnadu");
		
		
	}

}
