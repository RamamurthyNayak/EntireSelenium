package Allprograms2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightClickDemoActiTIME {
	static {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
	}

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://demo.actitime.com/");
		WebElement link = d.findElement(By.linkText("actiTIME Inc."));
		
		Actions a=new Actions(d);
		
		a.contextClick(link).perform();//to Right click on any button
		Thread.sleep(1000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_T);//t-new tab ,w-new window //open the same webpage in mozilla  browser ,to get tab name, i.e in this case its 'T'
		
		
		
		
	}

}
