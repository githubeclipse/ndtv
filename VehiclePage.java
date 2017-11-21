package myEnterprise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VehiclePage {
	
	public static WebElement element = null;

	public static WebElement carTypeSUV(WebDriver driver){
		element = driver.findElement(By.xpath(".//div[@id='cars']/div/div[3]/div[7]/div/div/div[1]/button"));
		return element;
	}
	
	
	public static void clickCarType(WebDriver driver, int timeout, JavascriptExecutor js) {
		
		//js.executeScript("window.scrollBy(0,1200)");
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		element = wait.until(ExpectedConditions.elementToBeClickable(carTypeSUV(driver)));
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		js.executeScript("arguments[0].click()", element);
	}
	
}
