package Allprograms2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StarHealthDemo {

	static {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://retail.starhealth.in/renewal");
		d.findElement(By.id("nqame2")).sendKeys("D1234");
		d.findElement(By.id("dtDOB")).click();	
		
		d.findElement(By.cssSelector("li.currentdate>a")).click();
		
		d.findElement(By.id("proceed")).click();

	}

}


