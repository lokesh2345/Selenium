package fb.prac.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "(//a[@role='button'])[2]")
	private WebElement Newacc;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement Firstname;
	
	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement Lastname;
	
	@FindBy( xpath = "(//input[@type='text'])[4]")
	private WebElement Email;
	
	@FindBy(xpath = "(//input[@type='password'])[2]")
	private WebElement Pw;

	
	
	public pom(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getNewacc() {
		return Newacc;
	}

	public WebElement getFirstname() {
		return Firstname;
	}

	public WebElement getLastname() {
		return Lastname;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getPw() {
		return Pw;
	}

	
}
