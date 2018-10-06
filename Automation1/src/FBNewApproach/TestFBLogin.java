package FBNewApproach;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestFBLogin {
	static {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
	}

	public static void main(String[] args) {

		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");

		WebDriver d=new ChromeDriver(co);
		d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		d.get("https://www.facebook.com/");	
		fbLogin lp=new fbLogin(d);
		lp.setUserName("sdramnayak@gmail.com");
		lp.setPassword("*&&^^*");
		lp.clickLogin();
		lp.clickLogoutlink();
		lp.clickLogoutButton();

	}

}
