package cromprogram;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class cromefisrt {


	

	public static void main(String[] args) throws InterruptedException{
	
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\selenium\\crome\\chromedriver.exe");
				
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		
		
		
		
		
		
		
		
		
		
		
	}

	
}
