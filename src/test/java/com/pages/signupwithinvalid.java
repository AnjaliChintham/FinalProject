package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class signupwithinvalid {
	WebDriver driver;

	public void url() 
	{
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\Chrome Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.get("https://google.com");
	System.out.println(driver.getTitle());

	}
	public void demoblaze_homePage()
	{
		driver.get("https://demoblaze.com/index.html");
		System.out.println(driver.getTitle());
	}
	public void signup_click()
	{
		driver.findElement(By.id("signin2")).click();
		
	}
	public void signup_details() throws InterruptedException
	{
		driver.findElement(By.id("sign-username")).sendKeys("");
		driver.findElement(By.id("sign-password")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(5000);
		Alert alert=driver.switchTo().alert();
		String s=driver.switchTo().alert().getText();
		System.out.println(s);
		Thread.sleep(5000);
		alert.accept();
	}



}
