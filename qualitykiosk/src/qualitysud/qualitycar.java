package qualitysud;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class qualitycar {
	
	private static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		qualitycar.driver = driver;
	}

	public static void main (String args[])
	{
	    System.setProperty("webdriver.gecko.driver","C:\\Program Files\\Mozilla Firefox\\gekodriver\\geckodriver.exe");
	    
	    setDriver(new FirefoxDriver());
	    
	    driver.get("https://www.wikipedia.org/");
	    
	    	
	   
	   
	    
	    
	}
}