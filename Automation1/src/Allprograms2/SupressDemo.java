package Allprograms2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SupressDemo {

	static {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./MozillaDriver1/geckodriver.exe");
	}

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriver d=new FirefoxDriver();
		
		//WebDriver d=new ChromeDriver();
		
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		d.get("https://www.google.com");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ESCAPE);


	}

}
