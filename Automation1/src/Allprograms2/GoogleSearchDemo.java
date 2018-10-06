package Allprograms2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;


//Do a google search based on a key word, and get all the suggested names  by google

public class GoogleSearchDemo {

	static {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("http://www.google.com");
		d.findElement(By.id("lst-ib")).sendKeys("java");

		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		String xp ="//div[contains(text(),'java')]";
		List<WebElement> allAS = d.findElements(By.xpath(xp));
		System.out.println(allAS.size());

		for (WebElement e : allAS) {
			System.out.println(e.getText());

		}
		allAS.get(1).click();

	}

}


