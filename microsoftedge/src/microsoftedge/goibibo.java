package microsoftedge;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class goibibo {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.edge.driver","C:\\Program Files\\selenium\\microsoftedge\\MicrosoftWebDriver.exe");

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.goibibo.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		
		
		
		
	}

}
