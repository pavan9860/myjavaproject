package com.selenium.test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;  

public class LaunchBrowser {
	 

	private static WebDriver tt;

	public static WebDriver getTt() {
		return tt;
	}

	public static void setTt(WebDriver tt) {
		LaunchBrowser.tt = tt;
	}

	public static void main(String args[])
	{
		System.setProperty("webdriver.CromeDriver.driver","C:\\Program Files\\selenium\\crome.exe");
	

	setTt(new FirefoxDriver());
	
	tt.get("https://www.flipkart.com/");
	
	tt.manage().window().maximize();
	
	tt.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	tt.close();
	
	
	
}
}
