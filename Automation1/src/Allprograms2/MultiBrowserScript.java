package Allprograms2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserScript {

	static {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./MozillaDriver/geckodriver.exe");
	}
	
	public static void myTest(WebDriver driver)
	{
	driver.get("https://www.IMDB.com");
	String title = driver.getTitle();
	System.out.println(title);
	driver.close();
	}
	public static void main(String[] args) {
		
		WebDriver d=new ChromeDriver();
		myTest(d);

		WebDriver d1=new FirefoxDriver();
		myTest(d1);
		
		
		}
		
	}
	
	

