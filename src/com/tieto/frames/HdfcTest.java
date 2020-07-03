package com.tieto.frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HdfcTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/"); 
		
		driver.switchTo().frame("login_page");
		
		/*
		 * driver.switchTo().frame(0);
		 * driver.switchTo().frame(driver.findElement(By.xpath(
		 * "//frame[contains(@src,'RSLogin')]")));
		 */
		
		
		driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("test123");
		
		//click on continue 
		driver.findElement(By.xpath("//input[@name='fldLoginUserId']/following::img")).click();
		
		//come out of frame
		driver.switchTo().defaultContent();		
	}

}
