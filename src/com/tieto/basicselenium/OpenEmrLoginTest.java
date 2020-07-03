package com.tieto.basicselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class OpenEmrLoginTest {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();//open the chromedriver	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demo.openemr.io/a/openemr/interface/login/login.php?site=default");
		
		driver.findElement(By.id("authUser")).sendKeys("admin");
		
		driver.findElement(By.id("clearPass")).sendKeys("pass");
		
//		WebDriverWait wait =new WebDriverWait(driver, 120);	
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("clearPass"))).sendKeys("pass");
	
		Select selectLanguage = new Select(driver.findElement(By.name("languageChoice")));	
		selectLanguage.selectByVisibleText("English (Indian)");	
	
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//span[@data-bind='text:fname']"))).build().perform();
		
		//click on logout
		driver.findElement(By.xpath("//li[text()='Logout']")).click();
	}

}
