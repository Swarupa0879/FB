package Tbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Testbase {
	
public static WebDriver driver;

public void setup1(String browser) throws Exception {
	if (browser.equalsIgnoreCase("firefox")) {
		// create firefox instance
		System.setProperty("webdriver.gecko.driver", "\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	}
	// Check if parameter passed as 'chrome'
	else if (browser.equalsIgnoreCase("chrome")) {
		// set path to chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	} else if (browser.equalsIgnoreCase("Edge")) {
		// set path to Edge.exe
		System.setProperty("webdriver.edge.driver", "MicrosoftWebDriver.exe");
		driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
	} else {
		// If no browser is passed throw exception
		throw new Exception("Incorrect Browser");
	}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
}

{
}



{

}
}
