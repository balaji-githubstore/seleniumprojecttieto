package com.tieto.alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFCAlertTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://netbanking.hdfcbank.com/netbanking/");

		driver.switchTo().frame("login_page");

		// click on continue
		driver.findElement(By.xpath("//input[@name='fldLoginUserId']/following::img")).click();

		
		
		Alert alertBox = driver.switchTo().alert();
		String alertText = alertBox.getText();
		System.out.println(alertText);

		Thread.sleep(2000);

		alertBox.accept();

	}
}
