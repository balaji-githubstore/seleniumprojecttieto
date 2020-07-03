package com.tieto.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTest {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.google.co.in/");

		Actions actions =new Actions(driver);
		
		
//		actions
//		.moveToElement(driver.findElement(By.name("q")))
//		.pause(1000)
//		.click()
//		.pause(1000)
//		.keyDown(Keys.SHIFT)
//		.sendKeys("face")
//		.keyUp(Keys.SHIFT)
//		.pause(2000)
//		.sendKeys(Keys.ARROW_DOWN)
//		.pause(1000)
//		.sendKeys(Keys.ARROW_DOWN)
//		.pause(1000)
//		.sendKeys(Keys.ARROW_DOWN)
//		.pause(1000)
//		.sendKeys(Keys.ENTER)
//		.build().perform();
		
		actions
		.moveToElement(driver.findElement(By.name("q")))
		.pause(1000)
		.click()
		.pause(1000)
		.keyDown(Keys.SHIFT)
		.sendKeys("face")
		.keyUp(Keys.SHIFT)
		.pause(2000).build().perform();
		
		
		for(int i=1;i<=6;i++)
		{
			actions.sendKeys(Keys.ARROW_DOWN).pause(1000).build().perform();
		}
		
		actions.sendKeys(Keys.ENTER)
		.build().perform();
		

	}

}





