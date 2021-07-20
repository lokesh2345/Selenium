package com.cucumberproject;

import org.openqa.selenium.WebDriver;
import com.cum.base.cucumberbase;
import com.pom.pg.ConfirmPage;
import com.pom.pg.LoginPage;
import com.pom.pg.SearchPage;

public class SeleniumAdactin extends cucumberbase{

	
	public static WebDriver driver;
	

   	public static void main( ) throws InterruptedException {
	driver =browserLaunch("chrome");
	getUrl("https://adactin.com/HotelApp/");
	implicitwait();
	
	
	LoginPage lp = new LoginPage(driver);
    inputText(lp.getUsername(), "Anitha04");
	inputText(lp.getPassword(), "Restore@98");
	clickOnElement(lp.getLogin());
	
	
	SearchPage sp = new SearchPage(driver);
	clickOnElement(sp.getLocation());
	clickOnElement(sp.getHotel());
	clickOnElement(sp.getRoomty());
	clickOnElement(sp.getRoomno());
	clickOnElement(sp.getAdroom());
	clickOnElement(sp.getChroom());
	clickOnElement(sp.getSearch());
	clickOnElement(sp.getRbutton());
	clickOnElement(sp.getContinueb());
	
	ConfirmPage cp = new ConfirmPage(driver);
	inputText(cp.getFname(), "Anitha");
	inputText(cp.getLname(), "Jayakumar");
	inputText(cp.getBadd(), "testcanada");
	inputText(cp.getCcnum(), "8745214587452145");
	clickOnElement(cp.getCctype());
	clickOnElement(cp.getExpdate());
	clickOnElement(cp.getExpyr());
	inputText(cp.getCcv(), "005");
	clickOnElement(cp.getBknow());
	clickOnElement(cp.getLogout());
	
	

   	}
}



	