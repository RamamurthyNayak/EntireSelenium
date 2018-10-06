package UsingTestMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoActiTime {
	static {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
	}	
	
	@Test
	public void testLogin1(){
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	d.get("https://demo.actitime.com/login.do");
	String expText = "actiTIME - Login";
	String actText = d.getTitle();
	SoftAssert s=new SoftAssert();
	s.assertEquals(actText, expText);
	d.close();
	s.assertAll();

}
	
//	@Test
//	public void testLogin2(){
//		WebDriver d=new ChromeDriver();
//		d.get("https://demo.actitime.com/login.do");
//		String expText = "invalid";
//		String actText = d.getTitle();
//		SoftAssert s=new SoftAssert();
//		s.assertEquals("invalid", actText);
//		d.close();
	}
	
	
	

