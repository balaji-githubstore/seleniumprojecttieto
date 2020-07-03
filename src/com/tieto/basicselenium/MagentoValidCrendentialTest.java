package com.tieto.basicselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MagentoValidCrendentialTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();//open the chromedriver	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://magento.com/"); //wait until the page load --> no time limit
		
		driver.findElement(By.linkText("My Account")).click(); // takes only 0.5s/500ms to decide
		
		driver.findElement(By.id("email")).sendKeys("balaji0017@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("welcome@123");
		
		driver.findElement(By.name("send")).click(); 	
		
		//explicit wait
		//make sure the new page is loaded properly or not
		//check for presense of log out
		
		WebDriverWait wait =new WebDriverWait(driver, 40);	
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Log Out")));
		
		
		String actualValue= driver.getTitle();
		System.out.println(actualValue);
			
		//logout
		//click on logout
		
		driver.findElement(By.partialLinkText("Out")).click(); 
		
		
	}
}



