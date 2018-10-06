package HubNode;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoA {
	@Parameters({"ip","browser"})

	@Test

	public static void testGrid(String ip,String browser) throws Exception{

		URL remoteAddress=new URL("http://localhost:4444/wd/hub");
		//	URL remoteAddress=new URL("http://192.168.1.100:4444/wd/hub");
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setBrowserName(browser);
		WebDriver d=new RemoteWebDriver(remoteAddress, capabilities);
		d.get("http://www.imdb.com");
		//d.get("http://demo.actiTIME.com");
		//		for(int i=1;i<=25;i++){
		//			WebElement un = d.findElement(By.id("username"));
		//			un.sendKeys("admin");
		//			un.clear();


	}
}

