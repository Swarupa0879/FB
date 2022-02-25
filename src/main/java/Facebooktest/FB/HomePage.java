package Facebooktest.FB;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Tbase.Testbase;
import Util.Utility;

public class HomePage extends Testbase {

	@FindBy(xpath="//input[@name='firstname']")
	WebElement FirstName;
	
	@FindBy(xpath="//input[@name='lastname']")
	WebElement LastName ;
	
	@FindBy(xpath="//input[@name='reg_email__']")
	WebElement Email;
	
	@FindBy(xpath="//input[@name='reg_passwd__']")
	WebElement Password;

	@FindBy(xpath="//select[@name='birthday_month']")
	WebElement Bmonth;
	
	@FindBy(xpath="//select[@name='birthday_day']")
	WebElement Bdate;
	
	@FindBy(xpath="//select[@name='birthday_year']")
	WebElement Byear;
	
	@FindBy(xpath = "//a[contains(text(),'Create new account')]")
	WebElement Register;

	@FindBy(xpath = "(//input[@name='sex'][1])")
	WebElement Gender;

	@FindBy(xpath = "(//button[@name='websubmit'][1])")
	WebElement SignUp;

	@FindBy(xpath = "//label[contains(text(),'Female')]")
	WebElement Gender1;
	@FindBy(xpath = "//label[contains(text(),'Male')]")
	WebElement Gender2;

public HomePage() {
	PageFactory.initElements(driver,this);{
	}
}

 public void registeruserR() throws InterruptedException {
	 Thread.sleep(3000);
	 Utility.Genericclick(Register);
 }
	 public void registeruserFn() throws InterruptedException {
		 Thread.sleep(3000);
		 Utility.Genericclick(FirstName);
	 Utility.genericsendkeys(FirstName,"Swarupa");}
 
	 public void registeruserLn() throws InterruptedException {
		 Thread.sleep(3000);
		 Utility.Genericclick(LastName);
	 Utility.genericsendkeys(LastName,"Goddumuri");
	 }
	 public void registerusereM() throws InterruptedException {
		 Thread.sleep(3000);
		 Utility.Genericclick(Email);
	 Utility.genericsendkeys(Email,"Swarupa.goddumuri@gmail.com");
	 }
	 public void registeruserPn() throws InterruptedException {
		 Thread.sleep(3000);
		 Utility.Genericclick(Password);
	 Utility.genericsendkeys(Password,"Test#1234");
	 }
	 
	 public void SelectM() throws InterruptedException {
		 Thread.sleep(3000);
		 Utility.selectdesired(Bmonth, "Aug");
		 }
	 public void Selectd() throws InterruptedException {
		 Thread.sleep(3000);
		 Utility.selectdesiredD(Bdate, "13");;
		 }
	 public void Selecty() throws InterruptedException {
		 Thread.sleep(3000);
		 Utility.selectdesiredY(Byear, "2022");;
		 }
	 public void SelectGender() throws InterruptedException {
		 Thread.sleep(3000);
		// Utility.Genericclick(Gender1);
		 Gender1.isEnabled();
		 Thread.sleep(1000);
		 Utility.Genericclick(Gender1);
		 Thread.sleep(1000);
		 Gender1.isSelected();
		 }
	 
	 
}

