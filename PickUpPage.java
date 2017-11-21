package myEnterprise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PickUpPage {
	
	public static WebElement element = null;
	
	public static WebElement PickupSelectbutton(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id='location']/div/div[2]/div[3]/ul/li[2]/div[2]/div[2]/div[2]/button"));
		return element;
      }

	public static WebElement DropSelectbutton(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id='location/dropoff']/div/div[2]/div[3]/ul/li[2]/div[2]/div[2]/div[2]/button"));
		return element;
      }
	
		
	public static void clickPickupSelectButton(WebDriver driver, int timeout){
  
		try{	
			WebDriverWait wait = new WebDriverWait(driver,timeout);
			
		    element = wait.until(ExpectedConditions.visibilityOf(PickupSelectbutton(driver)));	
		    element.click();
			System.out.println("Element clicked on the webpage");			
			}catch(Exception e) {			
				System.out.println("Element not app on the webpage");			
			}	
	}
	
	public static void clickDropSelectButton(WebDriver driver, int timeout){
		  
		try{	
			WebDriverWait wait = new WebDriverWait(driver,timeout);
			
		    element = wait.until(ExpectedConditions.visibilityOf(DropSelectbutton(driver)));	
		    element.click();
			System.out.println("Element clicked on the webpage");			
			}catch(Exception e) {			
				System.out.println("Element not app on the webpage");			
			}	
	}
	
	
}	