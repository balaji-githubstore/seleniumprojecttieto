package com.tieto.alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://www.echoecho.com/javascript4.htm");

		Thread.sleep(5000);
		driver.findElement(By.name("B3")).click();

		/*
		 * WebDriverWait wait =new WebDriverWait(driver,40);
		 * wait.until(ExpectedConditions.alertIsPresent());
		 */
		

		Alert alertBox = driver.switchTo().alert();
		String alertText = alertBox.getText();
		System.out.println(alertText);
		
		alertBox.sendKeys("Test123");
		
		Thread.sleep(2000);
		alertBox.accept();
		
	
		
		
		

	}
}
