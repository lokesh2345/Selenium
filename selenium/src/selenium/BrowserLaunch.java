package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\ANITHA\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
	email.sendKeys("Anitha@gmail.com");
	
	WebElement pw = driver.findElement(By.xpath("//input[@type='password']"));
	pw.sendKeys("1233445");
	
	
	
	
	
	
	
	
}	
}
	
	
