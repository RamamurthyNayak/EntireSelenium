package Allprograms2;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.WebDriverHandler;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;


public class DemoA {
	static {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./MozillaDriver/geckodriver.exe");

	}

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.close();

		FirefoxDriver d1=new FirefoxDriver();
		d1.close();
		
		
		
	}

}
