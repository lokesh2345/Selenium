package com.pom.pg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
public static  WebDriver driver;

	
	

	@FindBy(xpath="//select[@id='location']/option[6]")
	private WebElement location;
	
	@FindBy(xpath="//select[@id='hotels']/option[2]")
	private WebElement hotel;
	
	@FindBy(xpath="//select[@id='room_type']/option[2]")
	private WebElement roomty;
	
	@FindBy(xpath="//select[@id='room_nos']/option[3]")
	private WebElement roomno;
	
	@FindBy(xpath="//select[@id='adult_room']/option[2]")
	private WebElement adroom;
	
	@FindBy(xpath="//select[@id='child_room']/option[2]")
	private WebElement chroom;
	
	@FindBy(xpath="//input[@name='Submit']")
	private WebElement search;
	
	@FindBy(xpath="//input[@name='radiobutton_0']")
	private WebElement rbutton;
	
	@FindBy(xpath="//input[@name='continue']")
	private WebElement continueb;
	
	public SearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}


	public static WebDriver getDriver() {
		return driver;
	}


	public WebElement getLocation() {
		return location;
	}


	public WebElement getHotel() {
		return hotel;
	}


	public WebElement getRoomty() {
		return roomty;
	}


	public WebElement getRoomno() {
		return roomno;
	}


	public WebElement getAdroom() {
		return adroom;
	}


	public WebElement getChroom() {
		return chroom;
	}


	public WebElement getSearch() {
		return search;
	}


	public WebElement getContinueb() {
		return continueb;
	}


	public WebElement getRbutton() {
		return rbutton;
	}
		
	

	
	

}



