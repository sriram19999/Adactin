package com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

    public class Base_class {
	public static WebDriver driver;
	public static Select s ;
	public static Actions ac ;
	public static Robot rt ;
	
	public static void getDriver() {	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\eclipse-workspace\\Miniproject\\driver\\chromedriver.exe");
	    driver = new ChromeDriver();	
   }
     public static void getUrl(String url) {
           driver.get(url);
   }      
     public static void getmaxi() {
	       driver.manage().window().maximize();       
   }
    public static void inputValue(WebElement a, String b) {
    	 a.sendKeys(b);
    }   
    public static void clickonElement(WebElement c ) {
    	 c.click();
     }
     
     public static void getindex(WebElement element , int value){
     s = new Select (element) ;
     s.selectByIndex(value);
     }
     
     public static void getvalue(WebElement element , String value){
         s = new Select (element) ;
         s.selectByValue(value);
         }
     
     public static void getvisibletext(WebElement element , String value){
         s = new Select (element) ;
         s.selectByVisibleText(value);
         }
     
     public static void getaction(WebElement d)   {
      ac = new Actions(driver);
      ac.click(d).build().perform();
     }
     
     public static void getrobotpress() throws AWTException {
     rt = new Robot();	 
     rt.keyPress(KeyEvent.VK_ENTER);
     rt.keyRelease(KeyEvent.VK_ENTER);
    }
    
    public static void getthread() throws InterruptedException {
    	Thread.sleep(5000); 	
    }
    
    public static void getscreenshot() throws IOException {
    TakesScreenshot ts = (TakesScreenshot) driver;
    File from = ts.getScreenshotAs(OutputType.FILE);
    File to = new File("C:\\Users\\Administrator\\eclipse-workspace\\Miniproject\\Screenshot\\sri1.png");
    FileUtils.copyFile(from, to);
 }
    public static void getclose() {
   	 driver.close();
   }
}