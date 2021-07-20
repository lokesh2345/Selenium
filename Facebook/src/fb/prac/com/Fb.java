package fb.prac.com;

import org.openqa.selenium.WebDriver;

public class Fb extends Fbbase{
	
	public static WebDriver driver ;
	
	public static void main(String[] args) throws InterruptedException {
		
		
		driver = getbrowser("Chrome");
		
		geturl("https://en-gb.facebook.com/");
		
		Thread.sleep(5000);
		
		pom pg = new pom(driver);
		
		//WebElement newacc = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		click(pg.getNewacc());
		
		//WebElement firname = driver.findElement(By.name("firstname"));
		inputval(pg.getFirstname(), "Anitha");
		
		//WebElement lastname = driver.findElement(By.name("lastname"));
		inputval(pg.getLastname(), "J");
		
		//email
		//WebElement email = driver.findElement(By.name("reg_email__"));
		inputval(pg.getEmail(), "test123@gmail.com");
		
		//pw
		//WebElement pw = driver.findElement(By.name("reg_passwd__"));
		inputval(pg.getPw(), "24353646");
		
		
	}

}
