package Util;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Tbase.Testbase;

public class Utility extends Testbase {
	
	public static void genericsendkeys(WebElement ele, String Value) {
		try {
			ele.sendKeys(Value);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void Genericclick(WebElement ele) {
		try {
			ele.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void genericmovetoelement(WebElement ele) {
		try {
			Actions act = new Actions(driver);
			act.moveToElement(ele).build().perform();
			ele.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
		public static void selectdesired(WebElement ele ,String Exmon) {
		
			Select Smonth=new Select(ele);
			Smonth.selectByVisibleText(Exmon);
			List<WebElement>Ms=Smonth.getOptions();
			for(int i=0; i<Ms.size();i++) {
				System.out.println(Ms.get(i).getText());
			}
			
		}
		public static void selectdesiredD(WebElement ele ,String ExDay) {
			
			Select SDay=new Select(ele);
			SDay.selectByVisibleText(ExDay);
			List<WebElement>Ys=SDay.getOptions();
			for(int i=0; i<Ys.size();i++) {
				System.out.println(Ys.get(i).getText());
			}

		}
		
public static void selectdesiredY(WebElement ele ,String ExYear) {
			
			Select SYear=new Select(ele);
			SYear.selectByVisibleText(ExYear);
			List<WebElement>Ys=SYear.getOptions();
			for(int i=0; i<Ys.size();i++) {
				System.out.println(Ys.get(i).getText());
			}

		}

	}

