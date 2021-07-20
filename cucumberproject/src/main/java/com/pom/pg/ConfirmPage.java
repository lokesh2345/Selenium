package com.pom.pg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmPage {
public static WebDriver driver;
	
	@FindBy (xpath="//input[@name='first_name']")
	private WebElement fname;
	
	@FindBy (xpath="//input[@name='last_name']")
	private WebElement lname;
	
	@FindBy(xpath="//textarea[@name='address']")
	private WebElement badd;
	
	@FindBy(xpath="//input[@name='cc_num']")
	private WebElement ccnum;
	
	@FindBy (xpath="//select[@name='cc_type']/option[2]")
	private WebElement cctype;
	
	@FindBy (xpath="//select[@name='cc_exp_month']/option[5]")
	private WebElement expdate;
	
	@FindBy (xpath="//select[@name='cc_exp_year']/option[12]")
	private WebElement expyr;
	
	@FindBy (xpath="//input[@name='cc_cvv']")
	private WebElement ccv;
	
	@FindBy (xpath="//input[@name='book_now']")
	private WebElement bknow;
	
	@FindBy (xpath="/html/body/table[2]/tbody/tr[1]/td[2]/a[4]")
	private WebElement logout;

	
	
	public ConfirmPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}



	public static WebDriver getDriver() {
		return driver;
	}



	public WebElement getFname() {
		return fname;
	}



	public WebElement getLname() {
		return lname;
	}



	public WebElement getBadd() {
		return badd;
	}



	public WebElement getCcnum() {
		return ccnum;
	}



	public WebElement getCctype() {
		return cctype;
	}



	public WebElement getExpdate() {
		return expdate;
	}



	public WebElement getExpyr() {
		return expyr;
	}



	public WebElement getCcv() {
		return ccv;
	}



	public WebElement getBknow() {
		return bknow;
	}



	public WebElement getLogout() {
		return logout;
	}


}



