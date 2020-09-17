package microsoftedge;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class goibibo {

	

	

	public static void main(String[] args) throws Exception {
		
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\selenium\\crome\\Chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://www.edureka.co/");
		
		String rt = driver.getCurrentUrl();
		
		System.out.println(rt);
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement sd = driver.findElement(By.xpath("//a[@class=\"ga_corporate_click\"]"));
		
		System.out.println(sd.getText());
		
		driver.manage().timeouts().wait(50000);
		
		WebElement st = driver.findElement(By.xpath("//a[@id=\"slick-slide60\"]"));
	
		Actions sf = new Actions(driver);
		
		sf.keyDown(st,Keys.ENTER).build().perform();
		
		
		
		
	
		
		
		
		
		}

}


