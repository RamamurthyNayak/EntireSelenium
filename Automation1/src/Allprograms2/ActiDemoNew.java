package Allprograms2;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiDemoNew {

	static {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
	}

	public static void main(String[] args) {
		
		WebDriver d=new ChromeDriver();
		
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		d.get("https://demo.actitime.com/login.do");
		d.findElement(By.id("username")).sendKeys("admin");
		d.findElement(By.name("pwd")).sendKeys("manager");
		d.findElement(By.xpath("//div[text()='Login ']")).click();
		
		
	
		WebDriverWait wait=new WebDriverWait(d, 10);
	
		wait.until(ExpectedConditions.titleContains("Enter"));
		System.out.println(d.getTitle());		
				
		d.findElement(By.id("logoutLink")).click();
		wait.until(ExpectedConditions.titleContains("Login"));
		System.out.println(d.getTitle());
		d.close();
		
	}

}
