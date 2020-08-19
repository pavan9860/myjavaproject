package junitrun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class junitmercy {


	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","C:\\Program Files\\Mozilla Firefox\\gekodriver\\geckodriver.exe");

		WebDriver driver1 = new FirefoxDriver();
	
	driver1.get("https://www.guru99.com");
	
	
	
	
	}

	
}
