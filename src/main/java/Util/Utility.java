package Util;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Tbase.Testbase;

public class Utility extends Testbase {
	private static final int maxRandom = 1000;
	private static final int minRandom = 0;
	
	public static String randomValue(String value) {
		int random = new Random().nextInt() * (maxRandom - minRandom) + maxRandom;
	    
	    return (String.valueOf(random) + value);
	}

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

	public static void selectdesired(WebElement ele, String Value) {
		try {
			Select Sdesired = new Select(ele);
			Sdesired.selectByVisibleText(Value);
			List<WebElement> Ms = Sdesired.getOptions();
			System.out.println("The number of values in drop down are"+Ms.size());
			for (int i = 0; i < Ms.size(); i++) {
				System.out.println("The drop down has following values..."+Ms.get(i).getText());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void selectdesiredD(WebElement ele, String ExDay) {
		try {

			Select SDay = new Select(ele);
			SDay.selectByVisibleText(ExDay);
			List<WebElement> Ys = SDay.getOptions();
			for (int i = 0; i < Ys.size(); i++) {
				System.out.println(Ys.get(i).getText());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void selectdesiredY(WebElement ele, String ExYear) {
		try {

		Select SYear = new Select(ele);
		SYear.selectByVisibleText(ExYear);
		List<WebElement> Ys = SYear.getOptions();
		for (int i = 0; i < Ys.size(); i++) {
			System.out.println(Ys.get(i).getText());
		}
		}catch(Exception e) {
		e.printStackTrace();

	}
	}

	public static void genericlinksonpage(WebElement ele) {
		try {
			List<WebElement> allLinks = ele.findElements(By.xpath("./child::*"));

			System.out.println("Total Links on page are...." + allLinks.size());
			for (int i = 0; i < allLinks.size(); i++) {
				System.out.println("Link displayed are..   " + allLinks.get(i).getText());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static void highLighterMethod(WebDriver driver, WebElement element) {

		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: green; border: 3px solid yellow;');",
					element);
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		
		}
		public void genericswitchtoframebyname(String framename) {
			try {
			driver.switchTo().frame(framename);
			}
			catch(Exception e) {
				 e.printStackTrace();
			}
		}
		
		public static void genericswitchtoframebyindex(int frameindex) throws InterruptedException {
			try {
			Thread.sleep(5000);
			driver.switchTo().frame(frameindex);
			}
			catch(Exception e) {
			e.printStackTrace();
		}
	}
}
