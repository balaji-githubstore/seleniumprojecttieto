package com.tieto.basicselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class OpenEmrLoginJavascriptTest {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();//open the chromedriver	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://demo.openemr.io/a/openemr/interface/login/login.php?site=default");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		js.executeScript("arguments[0].value='admin'",driver.findElement(By.id("authUser")));

		js.executeScript("document.getElementById('clearPass').value='pass'");
		
		//driver.findElement(By.id("clearPass")).sendKeys("pass");

		Select selectLanguage = new Select(driver.findElement(By.name("languageChoice")));	
		selectLanguage.selectByVisibleText("English (Indian)");	
	
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		//click on logout
		//driver.findElement(By.xpath("//li[text()='Logout']")).click();
		
		
		js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//li[text()='Logout']")));
		
	
		
		
	}

}
