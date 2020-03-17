package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickingonlaptops {
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
	public void laptops() {
		driver.findElement(By.xpath("(//a[@id='itemc'])[2]")).click();
	}
   public void selectlaptop() {
	   driver.findElement(By.linkText("Sony vaio i5")).click();
   }
   public void addtocart() throws InterruptedException {
	   driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
	   driver.findElement(By.xpath("//a[@id='cartur']")).click();
	   Thread.sleep(2000);
	
   }
   public void placeorder() throws InterruptedException {
	   driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();
	   driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Anjali");
	   driver.findElement(By.xpath("//*[@id=\"country\"]")).sendKeys("India");
	   driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Chennai");
	   driver.findElement(By.xpath("//*[@id=\"card\"]")).sendKeys("123456");
	   driver.findElement(By.xpath("//*[@id=\"month\"]")).sendKeys("12");
	   driver.findElement(By.xpath("//*[@id=\"year\"]")).sendKeys("22");
	   driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")).click();
   }

}
