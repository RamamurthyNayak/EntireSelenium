package Allprograms2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClickGoogleDriveDemo {
	static {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		d.get("https://www.google.com/drive/");
		
		d.findElement(By.xpath("//div[2]/div/a")).click();
		d.findElement(By.xpath("//*[contains(@id,'identifierId')]")).sendKeys("sdramnayak");
		
		d.findElement(By.xpath("(//*[@class='RveJvd snByac'])[1]")).click();
		d.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("amma109%");
		d.findElement(By.xpath("//*[@id='passwordNext']/content/span")).click();
		
		WebElement el = d.findElement(By.xpath("(//*[@class='l-u-Ab-zb-Pn-ve'])[1]"));
		Actions a=new Actions(d);
		a.doubleClick(el).perform();

		d.navigate().back();
		d.findElement(By.xpath("//a[@class='gb_b gb_eb gb_R']")).click();
		d.findElement(By.xpath("//a[@id='gb_71']")).click();
	
		
	}

}
