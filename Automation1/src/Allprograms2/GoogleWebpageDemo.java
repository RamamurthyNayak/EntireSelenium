package Allprograms2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleWebpageDemo {

	static {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./MozillaDriver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/Googledemo.html");
		
//		driver.findElement(By.tagName("a")).click();//In the browser,find the element by using Tagname "a" and click it
//		Thread.sleep(1000);
//		driver.navigate().back();	
//		
//		driver.findElement(By.id("a1")).click();
//		Thread.sleep(1000);
//		
//		driver.navigate().back();
//		
//		driver.findElement(By.name("n1")).click();
//		Thread.sleep(1000);
//		driver.navigate().back();
//				
//		driver.findElement(By.className("c1")).click();
//		Thread.sleep(1000);
//		driver.navigate().back();
//		driver.findElement(By.partialLinkText("Goo")).click();
		
		driver.findElement(By.cssSelector("a[id='a1']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[name='n1']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[class='c1']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.findElement(By.linkText("Google")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.findElement(By.partialLinkText("oog")).click();
		

	}

}
