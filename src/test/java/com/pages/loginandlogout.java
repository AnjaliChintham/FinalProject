package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginandlogout 
{
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

	}
	public void demoblaze_homePage()
	{
		driver.get("https://demoblaze.com/index.html");
		System.out.println(driver.getTitle());
	}
	public void userclick(String user,String Password) throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"login2\"]")).click();
	
		driver.findElement(By.id("loginusername")).sendKeys(user);
			driver.findElement(By.id("loginpassword")).sendKeys(Password);
			driver.findElement(By.xpath("//*[@id=\"logInModal\"]//div//div//div[3]//button[2]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"logout2\"]")).click();
			
	}
	public void logout() {
		
	}

}
