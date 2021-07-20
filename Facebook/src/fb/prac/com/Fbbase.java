package fb.prac.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fbbase {
	
public static WebDriver driver;
	
	public static WebDriver getbrowser(String type) {
		// TODO Auto-generated method stub
		if(type.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ANITHA\\eclipse-workspace\\Facebook\\Driver\\chromedriver.exe");
			
			 driver = new ChromeDriver();
			
		}
		else if (type.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\ANITHA\\eclipse-workspace\\selenium prac\\driver\\geckodriver.exe");
			
		 driver = new FirefoxDriver();
			
		}
		
		return driver;
	}
	public static void click(WebElement element) {
		
		element.click();
		
	}
	
	public static void inputval(WebElement element , String Value) {
		// TODO Auto-generated method stub
		element.sendKeys(Value);

	}
	
	public static void geturl(String url) {
		// TODO Auto-generated method stub
		driver.get(url);

	}
	
	public static void screenshot() throws IOException {
		// TODO Auto-generated method stub
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\ANITHA\\eclipse-workspace\\selenium prac\\ss\\pic.png");
		FileUtils.copyFile(Source, destination);
				

	}
}



