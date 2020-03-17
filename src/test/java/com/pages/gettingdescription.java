package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettingdescription {
	WebDriver driver;
	WebElement textbox;

	
	public void demoblaze_homePage()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://demoblaze.com/index.html");
		System.out.println(driver.getTitle());	
	}
	public void Scrollby() throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,8000)");
	}
	public void about() {
		String s=driver.findElement(By.xpath("//*[@id=\"fotcont\"]/div[2]/div/div/p[2]")).getText();
		System.out.println("Contact is:" +s);
		
		
		
	}
}
