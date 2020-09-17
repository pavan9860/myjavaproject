package qualitysud;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class qualitycar {
	
	public static void main (String args[]) throws Exception
	{
	
		
	    System.setProperty("webdriver.edge.driver","C:\\Program Files\\selenium\\microsoftedge\\MicrosoftWebDriver.exe");
	    
	    WebDriver driver = new EdgeDriver();
	    
	    
	    driver.get("https://www.wikipedia.org/");   
		
	    
	}
}