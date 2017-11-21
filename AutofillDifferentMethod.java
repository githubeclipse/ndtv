package myEnterprise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutofillDifferentMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver; 		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vipin.Malhotra\\Desktop\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		
		driver.get("https://www.enterprise.ca");

		driver.findElement(By.id("pickupLocationTextBox")).sendKeys("oakville");
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("locations-list"))));
		driver.findElement(By.xpath("//*[@id='location-5378601']/a")).click();
		
		
		
		
	}

}
