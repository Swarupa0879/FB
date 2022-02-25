package Facebooktest.FB;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Tbase.Testbase;

public class HomePageTest extends Testbase{
	HomePage HP;
	public HomePageTest() {
	super();
	}
	@BeforeMethod
	public void initialization() {
		setup();
	HP = new HomePage();
		
	}
	
	@Test
	public void userregister() throws InterruptedException {
		HP.registeruserR();
		HP.registeruserFn();
		HP.registeruserLn();
		HP.registerusereM();
		HP.registeruserPn();
		HP.SelectM();
		HP.Selectd();
		HP.Selecty();
		HP.SelectGender();
	}
	//@AfterMethod
	//public void teardown() {
		//driver.quit();
	//}
	
}
