package myEnterprise;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;

public class enterpriseTest {
	
	WebDriver driver;
	String url;
	JavascriptExecutor js;

	 @BeforeClass
	 
	  public void beforeClass() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vipin.Malhotra\\Desktop\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		  driver = new ChromeDriver();
		  js =(JavascriptExecutor)driver;
		  url = "https://www.enterprise.ca";
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		  driver.get(url);
		  
		  
 }
	 
	@BeforeMethod
	  public void beforeMethod() {
		System.out.println("This is before method");
	  }
	
	
  @Test()
  public void HomePage() throws InterruptedException{
	  
	     HomePage.fillPickupLocationBox(driver);
		 HomePage.clickReturnDiffLocationBox(driver);
		 HomePage.fillDropLocationBox(driver);
		 HomePage.fillPickupnReturnDate(driver,js);
		 Thread.sleep(3000);
		 HomePage.clickContinue(driver);
		
  }
  
  @Test(dependsOnMethods={"HomePage"})
  public void selectLocation() {
	  
	  PickUpPage.clickPickupSelectButton(driver, 5);
	  PickUpPage.clickDropSelectButton(driver, 15);
	  
  }
  
  
  @Test(dependsOnMethods={"selectLocation"})
    public void selectCarType(){
	 VehiclePage.clickCarType(driver, 5, js);
	  
  }
  
  @Test(dependsOnMethods={"selectCarType"})
  public void Review() throws InterruptedException {
	  
	 Thread.sleep(2000); 
	 ExtrasReview.clickaddButton(driver);
	 Thread.sleep(3000);
	 ExtrasReview.clickreviewButton(driver, 5);
	 
}
  
  @Test(dependsOnMethods={"Review"}, dataProvider="myData",dataProviderClass=Data.class)
  public void Reserve(String firstName, String lastName, String PhoneNumber, String email ) throws InterruptedException{
	
  ReservePage.fillDetails(driver, firstName, lastName, PhoneNumber, email);
  Thread.sleep(3000);
  ReservePage.clearFields(driver);
  Thread.sleep(5000);

  } 
  
    
  @AfterMethod
  public void afterMethod(ITestResult result) {
	  if(result.getStatus()==ITestResult.FAILURE){
		  	
		    String directory = "C:\\Users\\Vipin.Malhotra\\Desktop\\Screenshot\\"; // Imp - ends with \\
		    
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			try {
				FileUtils.copyFile(src, new File(directory + result.getName()+".png"));
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
}
  
  

  @AfterClass
  public void afterClass() {
	  

}

}