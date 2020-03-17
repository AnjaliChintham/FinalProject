package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invalidcontactdetails {
	WebDriver driver;
	public void demoblaze_homePage()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://demoblaze.com/index.html");
		System.out.println(driver.getTitle());
	}
	public void clickcontact()
	{
		driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a")).click();
	}
	public void details()
	{
		driver.findElement(By.id("recipient-email")).sendKeys("");
		driver.findElement(By.id("recipient-name")).sendKeys("");
		driver.findElement(By.id("message-text")).sendKeys("");
}
	public void send() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(5000);
		Alert alert=driver.switchTo().alert();
		String s=driver.switchTo().alert().getText();
		System.out.println(s);
		Thread.sleep(5000);
		alert.accept();
	}

}


