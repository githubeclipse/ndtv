package myEnterprise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	
public static WebElement element = null;
	
	public static WebElement PickupLocationBox(WebDriver driver){
		element = driver.findElement(By.id("pickupLocationTextBox"));
		return element;
	}

	public static WebElement ReturnDiffLocationBox(WebDriver driver){
		element = driver.findElement(By.xpath("//div[@class='reservationWidget section']//input[@name='sameLocation']"));
        return element;
	}
	
	public static WebElement DropLocationBox(WebDriver driver){
		element = driver.findElement(By.id("dropoffLocationTextBox"));
	    return element;}
	
	
	public static WebElement PickupLocationlist(WebDriver driver){
		element = driver.findElement(By.xpath("//div[@id='reservationWidget']//div[@id='locations-list']/div"));
				return element;
	}
	
	public static WebElement DropLocationlist(WebDriver driver){
		element = driver.findElement(By.xpath("//div[@class='reservationWidget section']//div[@id='locations-list']/div"));
				return element;
	}
	
	
    public static WebElement PickupDateCalender(WebDriver driver){
    	element = driver.findElement(By.xpath("//div[@id='reservationWidget']//label[@id='pickupCalendarFocusable']/div/span[1]"));
    	return element;
    }

    public static WebElement ReturnDateCalender(WebDriver driver){
    	element = driver.findElement(By.xpath("//*[@id='dropoffCalendarFocusable']"));
    	return element;
    	
    }

    
	public static WebElement PickupDate(WebDriver driver){
		element = driver.findElement(By.xpath("//div[@id='book']//div[@class='pickup-calendar']/div[1]/div[1]//table//tr[5]//td[5]/button"));
		return element;
	}
	
	public static void PickupTime(WebDriver driver){
		Select s1 = new Select(driver.findElement(By.id("pickupTime")));
		s1.selectByValue("11:00 AM");
		
	}
	
	public static void selectAge(WebDriver driver){
		Select s1 = new Select(driver.findElement(By.id("age")));
		s1.selectByValue("29");
		
	}
	
	
	public static void clickPickupTime(WebDriver driver){
		
	}
    
	public static WebElement ReturnDate(WebDriver driver){
		element = driver.findElement(By.xpath("//div[@id='book']/div/div[2]/div[2]/div[2]/div/div[1]/table/tbody/tr[5]/td[5]/button/span"));
		return element;
	}
	
	public static WebElement ContinueButton(WebDriver driver){
		element = driver.findElement(By.id("continueButton"));
		return element;
	}
	
	public static void fillPickupLocationBox(WebDriver driver){
		element = PickupLocationBox(driver);
		element.sendKeys("L6M");
		element = PickupLocationlist(driver);
		String searchid = "location-CA-L6M 3G2-Oakville";
		List<WebElement> results = element.findElements(By.tagName("li"));
		for(WebElement result:results){
			if(result.getAttribute("id").equalsIgnoreCase(searchid)){
				result.click();	
				break;
			}
		}
	}

	
		
	public static void clickReturnDiffLocationBox(WebDriver driver){
		element = ReturnDiffLocationBox(driver);
		element.click();
		
	}

		
	public static void fillDropLocationBox(WebDriver driver){
		element = DropLocationBox(driver);
		element.sendKeys("L4Z3K");
		element = DropLocationlist(driver);
		String searchid = "location-CA-L4Z 3K9-Mississauga";
		List<WebElement> results = element.findElements(By.tagName("li"));
			for(WebElement result:results){
			if(result.getAttribute("id").equalsIgnoreCase(searchid)){
				result.click();		
				break;
			}
			
		}
		
	}	

	
	public static void fillPickupnReturnDate(WebDriver driver, JavascriptExecutor js){
		
    element= PickupDateCalender(driver);	
	element.click();
	//Using Java script executor for clicking as otherwise click was not working
	//js.executeScript("arguments[0].scrollIntoView(true);", PickupDate(driver));
	
	js.executeScript("arguments[0].click();",PickupDate(driver));
	PickupTime(driver);
    
	
	//Thread.sleep(10000);
	
	js.executeScript("arguments[0].click()", ReturnDateCalender(driver));
	js.executeScript("arguments[0].click()", ReturnDate(driver));
    
	selectAge(driver);
	
	}
		
	public static void clickContinue(WebDriver driver){
		element = ContinueButton(driver);
		element.click();
	}
	 

	

}
