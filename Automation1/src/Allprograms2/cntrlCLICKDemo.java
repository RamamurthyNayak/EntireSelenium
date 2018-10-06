package Allprograms2;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class cntrlCLICKDemo {
	static {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://demo.actitime.com/");
		WebElement link = d.findElement(By.linkText("actiTIME Inc."));

		Actions a=new Actions(d);
		a.sendKeys(Keys.CONTROL).click(link).perform();
		Thread.sleep(2000);

		//In this example genWIndowHandles return WindowHandle of all the tabs

		Set<String> allWHS = d.getWindowHandles();
		System.out.println("Total tab count:"+allWHS.size());

		for (String wh : allWHS) {
			d.switchTo().window(wh);//Switch to tab
			System.out.println(d.getTitle());
		}
		d.close();//to close current tab
		d.quit();// to close all tabs

	}


}
