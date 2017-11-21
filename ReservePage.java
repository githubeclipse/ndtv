package myEnterprise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;

public class ReservePage {
	
	public static WebElement element = null;
	
	
	public static WebElement firstname(WebDriver driver){
		
		element = driver.findElement(By.id("firstName"));
		return element;
	}

    public static WebElement lastname(WebDriver driver){
		
		element = driver.findElement(By.id("lastName"));
		return element;
	}
	
    
   public static WebElement phoneNumber(WebDriver driver){
		
		element = driver.findElement(By.id("phoneNumber"));
		return element;
	}
	
   public static WebElement emailId(WebDriver driver){
		
		element = driver.findElement(By.id("emailAddress"));
		return element;
	}
   
      
   
   public static void fillDetails(WebDriver driver, String firstName, String lastName, String phoneNumber, String email ){
        firstname(driver).sendKeys(firstName);    	   
	    lastname(driver).sendKeys(lastName);
	    phoneNumber(driver).sendKeys(phoneNumber);
	    emailId(driver).sendKeys(email);
   
   }
   
   public static void clearFields(WebDriver driver){
	   element =  firstname(driver);
	   element.clear();
	 
	   element = lastname(driver);
	   element.clear();
	   
	   element = phoneNumber(driver);
	   element.clear();
	   
	   element = emailId(driver);
	   element.clear();
	   
   }
   
}  

