package com.demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Administrator\\eclipse-workspace\\Miniproject\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
        driver.manage().window().maximize();
		WebElement findElement = driver.findElement(By.name("username"));
		findElement.sendKeys("vinoth@123");
		WebElement findElement2 = driver.findElement(By.name("password"));
		findElement2.sendKeys("12434");
				
		driver.get("https://www.facebook.com/login/"); 
	    
	     TakesScreenshot ts = (TakesScreenshot) driver;
	     File from = ts.getScreenshotAs(OutputType.FILE);
	     File to = new File("C:\\Users\\Administrator\\eclipse-workspace\\Miniproject\\Screenshot\\sri.png");
	     FileUtils.copyFile(from, to);
  }
}


