package Allprograms2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownOptionFacebookDemo {

	static {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("http://www.facebook.com");
		WebElement listbox = d.findElement(By.id("month"));
		
		Select s=new Select(listbox);
		//s.selectByIndex(3);//March is  selected
		//s.selectByVisibleText("May");
		//s.selectByVisibleText("Jan");
		s.selectByIndex(1);


	}

}
