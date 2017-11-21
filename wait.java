package myEnterprise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait {

	public static WebElement element = null;
	
	public static void clickWhenReady(WebDriver driver, By locator, int timeout){
		
	try{	
	WebDriverWait wait = new WebDriverWait(driver,timeout);
	
    element = wait.until(ExpectedConditions.elementToBeClickable(locator));	
    element.click();
	System.out.println("Element clicked on the webpage");			
	}catch(Exception e) {			
		System.out.println("Element not app on the webpage");			
	}	
	
  }
	
}	
