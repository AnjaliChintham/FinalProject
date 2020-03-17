package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatetohomepage {
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
	public void Scrollby() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[4]/a")).click();
		
		
	}
 public void home() {
	 driver.findElement(By.xpath("//*[@id=\"nava\"]/img")).click(); }
}
