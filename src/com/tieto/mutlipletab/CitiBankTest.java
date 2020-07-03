package com.tieto.mutlipletab;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CitiBankTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.online.citibank.co.in/products-services/online-services/internet-banking.htm"); 
		
		driver.findElement(By.linkText("APPLY FOR CREDIT CARDS")).click();
		//driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(5000);
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		System.out.println("---------------------------------");
		
		Set<String> windows= driver.getWindowHandles();
		
		for(String win : windows)
		{
			System.out.println(win);
			//switch to win 
			driver.switchTo().window(win);
			
			String title =driver.getTitle();
			System.out.println(title);
			
			if(title.equals("Credit Card Application Online, Apply Now - Citi India"))
			{
				//stop the iteration
				break;
			}
			
			System.out.println("------------------");
		}	
		
		//click on travel
		driver.findElement(By.linkText("Travel")).click();
		
		driver.close();
		
		driver.switchTo().window(parent);
		
		String title =driver.getTitle();
		System.out.println(title);
		
	}

}
