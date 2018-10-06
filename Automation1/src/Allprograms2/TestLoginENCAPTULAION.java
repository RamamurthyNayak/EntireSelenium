package Allprograms2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLoginENCAPTULAION {
	static {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
	}

	public static void main(String[] args) {
		
		WebDriver d=new ChromeDriver();
		d.get("https://demo.actitime.com/login.do");	
		
		loginpageENCAPTULATION lp=new loginpageENCAPTULATION(d);
		lp.setUserName("admin");
		lp.setPassword("manager");
		lp.clickLogin();
	}

}
