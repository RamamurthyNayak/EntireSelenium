package Allprograms2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLoginDemo {

	static {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
	}

	public static void main(String[] args) {

		//open the browser
		WebDriver d=new ChromeDriver();
		//Enter the application url
		d.get("https://demo.actitime.com/login.do");
		//Verify login page is displayed
		//check point1->Verify title
		String expectedTitle="actiTIME - Login";
		System.out.println("Expected:"+expectedTitle);
		String actualTitle = d.getTitle();
		System.out.println("Actual:"+actualTitle);


		if(actualTitle.equals(expectedTitle)){
			System.out.println("Pass: Title is matching");
		}
		else
		{			
			System.out.println("Fail: Title is not matching");
		}

		//checkpoint 2-verify elements are present or not

		WebElement userName = d.findElement(By.id("username"));

		if(userName.isDisplayed()){
			System.out.println("Pass");
		}
		else{
			System.out.println("Fail");
		}

		d.findElement(By.id("username")).sendKeys("admin");
		d.findElement(By.name("pwd")).sendKeys("manager");
		d.findElement(By.xpath("//div[text()='Login ']")).click();

		String expTitle="actTitle:actiTIME - Login";
		System.out.println("expTitle:"+expTitle);

		String actTitle = d.getTitle();
		System.out.println("actTitle:"+actTitle);
		if(actTitle.equals(expTitle)){
			System.out.println("Pass");
		}
		else{
			System.out.println("Fail");
		}




	}
}


