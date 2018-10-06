package Allprograms2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


//Note:For some reasons the same(FirefoxOptions) is not working 
public class YatraFirefoxDemo {

	static {

		System.setProperty("webdriver.gecko.driver", "./MozillaDriver1/geckodriver.exe");
	}
	public static void main(String[] args) {
		//using FFOption to supress notification
		FirefoxOptions ff=new FirefoxOptions();
		ff.addArguments("--disable-notifications");

		WebDriver d=new FirefoxDriver(ff);
		d.get("https://www.yatra.com");

	}

}
