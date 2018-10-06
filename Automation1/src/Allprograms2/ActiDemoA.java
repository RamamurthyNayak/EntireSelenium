package Allprograms2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiDemoA {
	
	//Logout button capture script
	
	static {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();

		d.get("https://demo.actitime.com/login.do");
		d.findElement(By.id("username")).sendKeys("admin");
		d.findElement(By.name("pwd")).sendKeys("manager");
		d.findElement(By.xpath("//div[text()='Login ']")).click();
		while(true){
		try {
			d.findElement(By.id("logoutLink")).click();
		
			System.out.println("Logout link is present and clicked");
		break;
		}
		
		catch (Exception e) {
		System.out.println("Logout link is not present");
		}
		
		}
		d.close();
		

	}
}
