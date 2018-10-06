package Allprograms2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	static {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://en-gb.facebook.com/login/");


		String expectedTitle="Log in to Facebook | Facebook";
		System.out.println("Expected:"+expectedTitle);

		String actualTitle = d.getTitle();
		System.out.println("Actual:"+actualTitle);


		if(actualTitle.equals(expectedTitle)){
			System.out.println("Act and Exp both Title match");
		}

		else
		{
			System.out.println("Title does not match");
		}


		WebElement fn = d.findElement(By.name("email"));
		if(fn.isDisplayed()){
			System.out.println("Username field exist");
		}

		else{
			System.out.println("Username field does not exist");
		}
		
		WebElement pf = d.findElement(By.id("pass"));
		if(pf.isDisplayed()){
			System.out.println("password field also exist on Login page");
		}
		else{
			System.out.println("Password  field missing on login page");
		}
		}
	}




