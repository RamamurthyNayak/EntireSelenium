package Allprograms2;

import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FlipkartDemo {

	static {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");


		WebDriver d=new ChromeDriver(co);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		d.get("https://www.flipkart.com/");
		d.findElement(By.xpath("(//button)[2]")).click();
		d.findElement(By.name("q")).sendKeys("iphone x");
		Thread.sleep(1000);
String xp="//span[contains(text(),'iphone x mobile')]/..";
d.findElement(By.xpath(xp)).click();
		
		String pxp="//div[starts-with(text(),'Apple iphone')]/../../div[2]/div[1]/div[1]div[1]";
		List<WebElement> allP = d.findElements(By.xpath(pxp));

		TreeSet<Integer> t=new TreeSet<Integer>();


		for (WebElement p : allP) {
			Integer v=Integer.parseInt(p.getText().substring(1).replaceAll(",",""));
			t.add(v);
		}

		//System.out.println("---------Low &High Prices----");
		System.out.println(t.first());
		System.out.println(t.last());
		


	}

}
