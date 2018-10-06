package Allprograms2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	static {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");

	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/Googledemo.html");
		driver.findElement(By.xpath("/html/body/a")).click();
		driver.navigate().back();


	}

}
