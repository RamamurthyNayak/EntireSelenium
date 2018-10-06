package Allprograms2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrivagoSearchDemo {

	static {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://www.trivago.in/");
		d.findElement(By.xpath("//*[@id='horus-querytext']")).sendKeys("B");

		String xp = "//*[contains(text(),'B')]";
		List<WebElement> allWE = d.findElements(By.xpath(xp));
		System.out.println(allWE.size());

		for (WebElement we : allWE) {
			System.out.println(we.getText());

		}

		Thread.sleep(1000);
		allWE.get(1).click();

	}

}
