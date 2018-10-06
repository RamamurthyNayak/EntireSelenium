package Allprograms2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YatradotcomDemo {
	static {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./MozillaDriver1/geckodriver.exe");
	}

	public static void main(String[] args) throws AWTException {
		//it works only on chrome browser
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver d=new ChromeDriver(options);
		d.get("https://www.Yatra.com");
		
		
		
	}

}
