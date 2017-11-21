package myEnterprise;

import org.testng.annotations.DataProvider;

public class Data {
	
	@DataProvider(name="myData")
	public static Object[][] dataMethod(){
		return new Object[][]{{"Camel","Denver","6477240000","camel@hotmail.com"},{"Apple","Justin","9052313100","apple@gmail.com"}};
	}
	

}
