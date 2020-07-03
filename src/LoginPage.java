

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private static By userLocator=  By.id("authUser");
	private static By passLocator=By.id("clearPass");
	
	
	public static void enterUsername(WebDriver driver,String username)
	{
		driver.findElement(userLocator).sendKeys(username);
	}
	
	public static void enterPassword(WebDriver driver,String password)
	{
		driver.findElement(passLocator).sendKeys(password);
	}

}
