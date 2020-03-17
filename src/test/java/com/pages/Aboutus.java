package com.pages;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public class Aboutus {
	WebDriver driver;
    WebElement textbox;
    public void url() 
	{
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\Chrome Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.get("https://google.com");
	System.out.println(driver.getTitle());
       driver.get("https://demoblaze.com/index.html");
		System.out.println(driver.getTitle());
}
    public void about()
    {
    	driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[3]/a")).click();
    }
    
    public void link()
    {
    	driver.findElement(By.xpath("//*[@id=\"example-video\"]/div[1]")).click();
   // 	screenshot("C:\\Users\\BLTuser.BLT52\\eclipse-workspace\\DemoBlazeApplication\\Scrrenshot\\pic.png");
    	
    }
    public void close() {
    	driver.findElement(By.xpath("//*[@id=\"videoModal\"]/div/div/div[3]/button")).click();
    }
    
   }