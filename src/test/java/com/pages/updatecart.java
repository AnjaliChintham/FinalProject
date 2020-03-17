package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class updatecart {
	WebDriver driver;
	WebElement textbox;
	public void url() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://demoblaze.com/index.html");
		System.out.println(driver.getTitle());	
		
	}
	public void select() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")).click();
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
		Thread.sleep(5000);
		Alert alert=driver.switchTo().alert();
		String s=driver.switchTo().alert().getText();
		System.out.println(s);
		Thread.sleep(5000);
		alert.accept();
		driver.findElement(By.xpath("//*[@id=\"nava\"]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")).click();
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
		Thread.sleep(5000);
		Alert alert1=driver.switchTo().alert();
		String s1=driver.switchTo().alert().getText();
		System.out.println(s1);
		Thread.sleep(5000);
		alert1.accept();
		
	}
	public void cart() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"cartur\"]")).click();
		Thread.sleep(5000);
		
		
	}
	
	public void price() {
		
		String s3=driver.findElement(By.id("totalp")).getText();
		System.out.println("Total of All addeditems:" +s3);
		
	}

}
