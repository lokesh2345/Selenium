package com.pom.pg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver2) {
	    this.driver=driver2;
	    PageFactory.initElements(driver, this);
		}

		public static WebDriver driver;
		
		@FindBy(xpath="//input[@name='username']")
		private WebElement username;
		
		
		@FindBy(xpath="//input[@name='password']")
		private WebElement password;
		
		
		@FindBy(xpath="//input[@type='Submit']")
		private WebElement login;


		public static WebDriver getDriver() {
			return driver;
		}


		public WebElement getUsername() {
			return username;
		}


		public WebElement getPassword() {
			return password;
		}


		public WebElement getLogin() {
			return login;
		}

		
		
	}



