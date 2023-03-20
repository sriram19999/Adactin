package com.demo;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.base.Base_class;

public class Base_browse extends Base_class {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		
		getDriver();
        getUrl("http://adactinhotelapp.com/index.php");
        getmaxi();
        
	    WebElement un = driver.findElement(By.xpath("//input[@type='text']"));
        inputValue(un, "sriram1999");
          
        WebElement pw = driver.findElement(By.xpath("//input[@type='password']"));
        inputValue(pw,"LS126S");
           
        WebElement lg = driver.findElement(By.xpath("//input[@value='Login']"));
        clickonElement(lg);
        
        WebElement loc = driver.findElement(By.xpath("//select[@name='location']"));
        getindex(loc, 1);
      	 
      	WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']"));
      	getvisibletext(hotel, "Hotel Creek");
      	
        	
      	WebElement room = driver.findElement(By.name("room_type"));
      	getvalue(room, "Standard");
      	
      	WebElement roomnum = driver.findElement(By.name("room_nos"));
      	getvisibletext(roomnum, "2 - Two");
      	   	
      	WebElement adult = driver.findElement(By.name("adult_room"));
     	getindex(adult,3);
       	
       	WebElement childroom = driver.findElement(By.xpath("//select[@id='child_room']"));
        getindex(childroom, 2);
        
        WebElement search = driver.findElement(By.id("Submit"));
        clickonElement(search);
       	
        WebElement dot = driver.findElement(By.id("radiobutton_0"));
        clickonElement(dot);
       	
        WebElement con = driver.findElement(By.xpath("//input[@type='submit']"));
        clickonElement(con);
        
        WebElement fn = driver.findElement(By.name("first_name"));
        inputValue(fn,"saran" );
        
        WebElement ln = driver.findElement(By.name("last_name"));
        inputValue(ln,"raj");
        
        
        WebElement addr = driver.findElement(By.name("address"));
        inputValue(addr, "No 43,balaji nagar,2nd cross ,salem");

        WebElement cvv = driver.findElement(By.id("cc_num"));
        inputValue(cvv, "3452775654327865");
              
        WebElement ct = driver.findElement(By.name("cc_type"));
        getindex(ct,2);
       	
        WebElement month = driver.findElement(By.id("cc_exp_month"));
        getvisibletext(month, "May");
       	
        WebElement year = driver.findElement(By.id("cc_exp_year"));
        getvalue(year, "2020");
        
        WebElement cn = driver.findElement(By.name("cc_cvv"));
        inputValue(cn, "754");
       	
        WebElement book = driver.findElement(By.name("book_now"));
        clickonElement(book);
        
        getthread();
        
        WebElement mylit = driver.findElement(By.xpath("//input[@name='my_itinerary']"));
        clickonElement(mylit);
        
        
       WebElement ordersearch = driver.findElement(By.name("order_id_text"));
       inputValue(ordersearch, "6JA631XA06");
        
        WebElement orderid = driver.findElement(By.id("search_hotel_id"));
        clickonElement(orderid);
        
        WebElement checkbox = driver.findElement(By.xpath("//input[@value='845890']"));
        clickonElement(checkbox);
        
        getscreenshot();
       WebElement cancel= driver.findElement(By.xpath("//input[@value='Cancel Selected']"));
       getaction(cancel);
       getthread();
       getrobotpress();
       
        WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
        clickonElement(logout);
        
	}

}
