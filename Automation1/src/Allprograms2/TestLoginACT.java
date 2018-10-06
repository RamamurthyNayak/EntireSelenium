package Allprograms2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLoginACT {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d=new ChromeDriver();
		d.get("https://demo.actitime.com/login.do");
		LoginPage lp=new LoginPage(d);
		lp.setUserName("abc");
		lp.setPassword("xyz");
		lp.clickLogin();
		Thread.sleep(2000);
		
		lp.setUserName("admin");
		lp.setPassword("manager");
		lp.clickLogin();
		
		
		
	}

}
