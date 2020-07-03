package com.tieto.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShiramCityTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.shriramcity.in/");

		Thread.sleep(5000);
		
		Actions actions =new Actions(driver);
		
		actions
		.moveToElement(driver.findElement(By.xpath("//a[text()='Products']")))
		.pause(2000)
		.moveToElement(driver.findElement(By.xpath("//li[@class='loan-hvv']")))
		.build().perform();
		
		
		driver.findElement(By.xpath("(//a[contains(text(),'Two Wheeler Loans')])[1]")).click();
		
		//li[@class='loan-hvv']

	}

}
