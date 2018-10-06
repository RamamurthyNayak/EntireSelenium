package Allprograms2;

import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CleartripDemo {

	static {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException {

		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");

		WebDriver d=new ChromeDriver(co);
		d.get("https://www.cleartrip.com/");
		d.findElement(By.xpath("//*[@id='FromTag']")).sendKeys("Bang");

		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		d.findElement(By.xpath("//a[contains(text(),'Kempegowda International Airport')]")).click();


		d.findElement(By.xpath("//*[@id='ToTag']")).sendKeys("Goa");


		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		d.findElement(By.xpath("//*[contains(@id,'DepartDate')]")).click();

		d.findElement(By.xpath("//a[contains(@class,'highlight')]")).click();

		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		d.findElement(By.id("SearchBtn")).click();

		//List<WebElement> allPrices = d.findElements(By.xpath("//Th[@class='price']"));

		Thread.sleep(10);

		List<WebElement> allPrices = d.findElements(By.xpath("//*[@id='BaggageBundlingTemplate']"));
		
	
		for (WebElement al : allPrices) {
			Thread.sleep(10);

			String txt = al.getText();
			//System.out.println(txt);

			String newtxt = txt.substring(1).replaceAll(",","");

			System.out.println("Formatted : "+newtxt);
			
			System.out.println(newtxt);
			
			
		}

	}

}


