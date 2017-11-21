package myEnterprise;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	
public static void TakeScreen(WebDriver driver) {	
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-YYYY-hh-mm-ss");
		Date date=new Date();
		String output = sdf.format(date); 
		
		
		File gef = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(gef, new File("C:\\Users\\Vipin.Malhotra\\Desktop\\Screenshot\\newfile-"+output+".png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	
	

}
