package Allprograms2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actiTIMEnew {

	static {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://www.actitime.com/");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement menu1 = d.findElement(By.linkText("Features"));
		//Mouse hover on the menu
		Actions a=new Actions(d);

		a.moveToElement(menu1).perform();
		//clicking on sub menu
		d.findElement(By.linkText("Simple Time Tracking")).click();
		d.navigate().back();

		//Navigating to another menu in the tool bar called "Purchase"

		//		WebElement menu2 = d.findElement(By.linkText("Clients"));
		//		a.moveToElement(menu2).perform();
		//		d.findElement(By.linkText("IT")).click();
		//		d.navigate().back();
		//		------
		//		Thread.sleep(1000);
		//		a.moveToElement(menu2).perform();
		//		d.findElement(By.linkText("Design")).click();
		//		d.navigate().back();
		//		Thread.sleep(1000);
		//		a.moveToElement(menu2).perform();
		//		d.findElement(By.linkText("Engineering")).click();
		//		d.navigate().back();
		//		
		//		WebElement menu3 = d.findElement(By.linkText("Help Center"));
		//	a.moveToElement(menu3).perform();
		//		d.findElement(By.linkText("Contact Support")).click();



	}

}
