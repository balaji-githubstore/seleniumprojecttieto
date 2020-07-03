package com.tieto.tricks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SampleTest {

	public static void main(String[] args) {

//		ChromeOptions opt = new ChromeOptions();
//		opt.addArguments("--disable-notifications");
//
//		WebDriver driver = new ChromeDriver(opt);
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//		driver.get("https://www.medplusmart.com/");
//		
//		
//		if(driver.findElement(By.xpath("(//span[@class='closeModal'])[1]")).isDisplayed())
//		{
//			driver.findElement(By.xpath("(//span[@class='closeModal'])[1]")).click();
//		}
		
		/*int size=driver.findElements(By.xpath("//span[@class='closeModal']")).size();
		System.out.println(size);*/
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.flipkart.com/");
		
		int s =driver.findElements(By.xpath("//span[@class='12345454']")).size();
		System.out.println(s);
				
				
				
		if(driver.findElements(By.xpath("//button[@class='_2AkmmA _29YdH8']")).size()>0)
		{
			driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		}
		
		
	}

}
