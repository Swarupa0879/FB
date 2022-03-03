package Facebooktest.FB;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Tbase.Testbase;

public class HomePageTest extends Testbase{
	HomePage HP;
	
	public HomePageTest() {
	super();
	}
	@BeforeMethod
	public void initialization() throws Exception {
		//setup();
		setup1("chrome");
	HP = new HomePage();
	
		
	}
	
	@Test(priority=1)
	public void userregister() throws InterruptedException {
		HP.registeruserR();
		HP.registeruserFn();
		HP.registeruserLn();
		HP.registerusereM();
		HP.registeruserPn();
		HP.SelectM();
		//HP.Selectd();
		//HP.Selecty();
		HP.SelectGender();
	}
	//@AfterMethod
	//public void teardown() {
		//driver.quit();
	//}
	@Test(priority=2)
	public void verifyalllinksdisplayed() {
		HP.allavailablelinks();
		System.out.println("All  links are displayed as expected");
	}
}
