package myEnterprise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExtrasReview {
	
	public static WebElement element = null;
	
	public static WebElement addButton(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='extras']/div/div[2]/div[1]/table/tbody/tr[1]/td[4]/div/div/div/a/i"));
		return element;
		
	}

	public static WebElement reviewButton(WebDriver driver){
		element = driver.findElement(By.id("extrasSubmitTop"));
		return element;
		
	}
	
	public static void clickaddButton(WebDriver driver){
	element = addButton(driver);
	element.click();
	}
	
	
	public static void clickreviewButton(WebDriver driver, int timeout){
		
		try{
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		element = wait.until(ExpectedConditions.elementToBeClickable(reviewButton(driver)));
		element.click();
		System.out.println("Review button clicked");
		}catch( Exception e){
			System.out.println("Element not appeared");
		}
		
		
	}
	
	
	
}
