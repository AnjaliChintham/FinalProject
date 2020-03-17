package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clickingonphones {
	WebDriver driver;
	WebElement textbox;

	
	public void demoblaze_homePage()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}
	public void phones() {
		driver.get("https://demoblaze.com/index.html");
		System.out.println(driver.getTitle());	
		
	}
   public void selectphone() {
	   driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")).click();
   }
   public void addtocart() throws InterruptedException {
	   driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
	   Thread.sleep(5000);
		Alert alert=driver.switchTo().alert();
		String s=driver.switchTo().alert().getText();
		System.out.println(s);
		Thread.sleep(5000);
		alert.accept();
   }
   public void placeorder() throws InterruptedException {
	   driver.findElement(By.xpath("//*[@id=\"cartur\"]")).click();
	   Thread.sleep(3000);
	   
   }
}
