package com.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Clickingonphones {
	WebDriver driver;
	WebElement textbox;

	
	public void demoblaze_homePage()
	{
		driver.get("https://demoblaze.com/index.html");
		System.out.println(driver.getTitle());	
	}
	public void phones() {
		driver.findElement(By.xpath("//*[@id=\"itemc\"]")).click();
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
	   driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();
	   
   }
}
