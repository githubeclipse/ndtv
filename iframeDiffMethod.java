package myEnterprise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframeDiffMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

         WebDriver driver; 		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vipin.Malhotra\\Desktop\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("http://letskodeit.teachable.com/pages/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		
		
		
	}

}
