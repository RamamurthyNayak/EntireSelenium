package Google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGoogle {
	static {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("http://www.google.com");
		LoginGoogle lg=new LoginGoogle(d);
		lg.PrintAllLinkCount(null);
		
	}

}
