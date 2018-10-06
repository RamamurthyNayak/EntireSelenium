package Allprograms2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iSTQBDemo {
	static {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);;
		d.get("https://www.istqb.org/");
		WebElement menu = d.findElement(By.linkText("Certification"));
		Actions a=new Actions(d);
		a.moveToElement(menu).perform();
		d.findElement(By.linkText("Why ISTQB® Certification?")).click();
		d.navigate().back();




	}

}
