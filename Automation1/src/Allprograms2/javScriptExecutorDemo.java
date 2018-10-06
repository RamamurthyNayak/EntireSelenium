package Allprograms2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javScriptExecutorDemo {

	static {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();

		d.get("https://www.actitime.com/license-agreement");
		JavascriptExecutor j=(JavascriptExecutor)d;//Type casting
//			String msg = "Happy Ganesha chathurthi";
//			j.executeScript("alert('"+msg+"')");

		for(int i=1;i<=10;i++){
			//j.executeScript("window.scrollBy(0,500)");//scrolls downwords by 500lines 10 times
			j.executeScript("window.scrollTo(250,1000)");
			Thread.sleep(500);

		}

		for(int i=1;i<=10;i++){
			j.executeScript("window.scrollBy(-250,-1000)");//scrolls  in reverse way due to minus  value 
			Thread.sleep(500);
		}
	}
}
