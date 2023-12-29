package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumConfiguration {
	public static void main(String[] args) {
		//step1:class:system,static method:setProperty(k,v);
		//classname.methodname();system.setProperty(key--->"webdriver.chrome.driver",value---->
		//"driver path");
		System.setProperty("webdriver.MicrosoftEdge.driver", 
				"C:\\Users\\Venu\\eclipse\\java-2023-032\\Selenium\\drivers\\msedgedriver.exe");
		//step 2:upcasting:WEbdriver:Interface,chromedriver,edgedriver,gecko
		//driver,ex.,class
		WebDriver driver=new EdgeDriver();
		//step 3:get("url");---->to get webapp
		driver.get("http://greenstech.in/selenium-course-content.html");
		//step 4:maximaize the page
		driver.manage().window().maximize();
		//options manage=driver.manage();
		//window window=manage.window();
		//window.maximize();
		//step 5:to print url---->getCurrenturl();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		//step 6:to print title----->getTitle();
		String title = driver.getTitle();
		System.out.println(title);
		//step 7:close the browser
		driver.close();
	
		
	}

}