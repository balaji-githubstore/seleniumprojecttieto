package com.tieto.table;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		
		List<WebElement>  rowsEle= driver.findElements(By.xpath("//table[@id='example']/tbody/tr"));
		int rowCount = rowsEle.size();
		System.out.println(rowCount);
		
		
		for (int i = 1; i <= rowCount; i++) 
		{
			String name = driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+i+"]/td[2]")).getText();
			System.out.println(name);
			
			//logic
			if(name.trim().equals("Brenden Wagner"))
			{
				driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+i+"]/td[1]")).click();
				break;
			}	
		}
		
		
		
		
		
		

//		String name1 = driver.findElement(By.xpath("//table[@id='example']/tbody/tr[1]/td[2]")).getText();
//		System.out.println(name1);

//		String name2 = driver.findElement(By.xpath("//table[@id='example']/tbody/tr[2]/td[2]")).getText();
//		System.out.println(name2);
		//

//		for(int i=1;i<=10;i++)
//		{
//			System.out.println("//table[@id='example']/tbody/tr["+i+"]/td[2]");
//		}
//		
		
		
		
		

	}

}
