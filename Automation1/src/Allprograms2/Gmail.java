package Allprograms2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	static {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://accounts.google.com/");
		String expTitle="Sign in – Google accounts";
		System.out.println("Expected page title is:"+expTitle);
		String actTitle = d.getTitle();
		System.out.println("Page title is :"+actTitle);
if(actTitle.equals(expTitle)){
	System.out.println("Both exp title and act title are same");
}
else{
	System.out.println("Both exp title and act title are same");
}
		
WebElement unf = d.findElement(By.name("identifier"));
if(unf.isDisplayed()){
	System.out.println("User name field displayed");
}
else{
	System.out.println("UN field not displayed");
}
	}

}
